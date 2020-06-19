package C;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import C.phUserCriteria.attCriteria;
import C.phUserCriteria.phCriteria;
import M.User;
import M.UserDAO;
import M.UserDAOJdbcimpl;
import M.attDao.attDao;
import M.attDao.attDaoJdbcimpl;
import M.attractions.attractions;
import M.phUser.phUser;
import M.phUserdao.phUserDao;
import M.phUserdao.phUserDaoJdbcimpl;

/**
 * Servlet implementation class pzlServlet
 */
@WebServlet("*.pzl")
public class pzlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  UserDAO UserD=new UserDAOJdbcimpl();  
	private  phUserDao phUserdao=new phUserDaoJdbcimpl();
	private  attDao att=new attDaoJdbcimpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pzlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		String servletPath=request.getServletPath();
		String methodName=servletPath.substring(1);
		methodName= methodName.substring(0,methodName.length()-4);
		try {
		
			Method method=getClass().getDeclaredMethod(methodName,HttpServletRequest.class, HttpServletResponse.class );
			method.invoke(this, request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String ident=request.getParameter("ident");
		System.out.print(username);
		System.out.print(password);
		
		if(ident.equals("2"))
		{
			User user=UserD.getuser(username,password);
			if(user!=null)
			{
				    HttpSession session = request.getSession();
					session.setAttribute("username", username);
					session.setAttribute("activeUser", user);
					response.sendRedirect("index.html");
			}
			else
			{
				request.setAttribute("msg", "用户名账号或密码错误");
				request.getRequestDispatcher("loginaddreg.html").forward(request, response);
			}	
		}
			
			if((ident.equals("1"))&&(username.equals("孜霖"))&&(password.equals("123"))) {
				
					    HttpSession session = request.getSession();
						session.setAttribute("username", username);
						//session.setAttribute("activeUser", user);
						response.sendRedirect("houtai.html");
				}
				else
				{
					request.setAttribute("msg", "用户名账号或密码错误");
					request.getRequestDispatcher("loginaddreg.html").forward(request, response);
				}	
		 
				if(ident.equals("3")) {
					
			}
		
	}

	protected void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		PrintWriter out=response.getWriter();
		System.out.print(username);
		System.out.print(password);
		
		
			long count=UserD.getCountWithName(username);
			System.out.print(count);
			if(count>0) {
				request.setAttribute("msg","用户名"+username+"已被占用，请重新输入！");
				request.getRequestDispatcher("loginadderg.html").forward(request,response);
			}
			else
			{
				User user=new User(username,password,gender,phonenumber);
			    UserD.add(user);
			    //System.out.print("123456789");
				//out.print("注册成功，3秒钟后返回登录页面");
				response.sendRedirect("loginadderg.html");
				
			}
	}
	
protected void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		List<phUser> users=phUserdao.getAll();
		

		request.setAttribute("users", users);	
	
		request.getRequestDispatcher("phUser1.jsp").forward(request,response);
	
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		int i=0;
		
		try {
			i=Integer.parseInt(id);
			phUserdao.delete(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("query2.pzl");
	}

	protected void query1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		HttpSession session=request.getSession();
		List<phUser> users=(List<phUser>)session.getAttribute("Users");
	    int total=phUserdao.Count(users);
		int currentPage;
		int pageSize=3;
		int pageCount=(total-1)/pageSize+1;
		if(request.getParameter("page")==null){
			currentPage=1;
			
		}else{
			currentPage=Integer.parseInt(request.getParameter("page"));	
		}
		if(currentPage<pageCount) {
			List<phUser> us=phUserdao.selectUser(users, currentPage, pageSize);
			request.setAttribute("users", us);
		}
		else {
			int endSize=total%pageSize;
			
			if(endSize==0) {
				List<phUser> us=phUserdao.selectUser(users, currentPage, pageSize);
				request.setAttribute("users", us);
			}else {
				List<phUser> us=phUserdao.selectUser2(users, currentPage, pageSize,endSize);
				request.setAttribute("users", us);
				
			}
			
		}
			
		request.setAttribute("pageSize",pageSize);
		request.setAttribute("currentPage",currentPage);
		request.setAttribute("pageCount",pageCount);
		request.getRequestDispatcher("phUser1.jsp").forward(request,response);
	
	}
	protected void query2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username=request.getParameter("username");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		
		phCriteria CriteriaUser=new phCriteria(username,gender,phonenumber);
		List<phUser> users=phUserdao.CriteriaUser(CriteriaUser);
		HttpSession session=request.getSession();
		session.setAttribute("Users",users);	
		request.getRequestDispatcher("query1.pzl").forward(request,response);
	
	}
	
	protected void delete2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		int i=0;
		
		try {
			i=Integer.parseInt(id);
			att.delete(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("query4.pzl");
	}
	protected void update2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String attname=request.getParameter("attname");
		String attsrc_img=request.getParameter("attsrc_img");
		String attsrc_img1=request.getParameter("attsrc_img1");
		String attsrc_img2=request.getParameter("attsrc_img2");
		String attsrc_img3=request.getParameter("attsrc_img3");
		String glname1=request.getParameter("glname1");
		String glname2=request.getParameter("glname2");
		String glname3=request.getParameter("glname3");
		String atttype=request.getParameter("atttype");
		String opentime=request.getParameter("opentime");
		String lasting=request.getParameter("lasting");
		String sensons=request.getParameter("seasons");
		String attlevels=request.getParameter("attlevels");
		String attvideo=request.getParameter("attvideo");
	   int id=Integer.parseInt(request.getParameter("id"));
	   attractions us=att.get(id);
	System.out.println("123456");
	   String oldname=us.getAttname();
	
	   attractions user=att.get(id);
		if(!oldname.equals(attname)) {
			long count=att.getCountWithName(attname);
			if(count>0) {
				System.out.println("wwwww");
				request.setAttribute("msg","景区"+attname+"已被占用，请重新输入！");
				request.setAttribute("user", user);
				request.getRequestDispatcher("/attractionupdate.jsp").forward(request,response);
				
			}else {
				System.out.println("aaaaa");
				attractions user1=new attractions(id,attname,attsrc_img,attsrc_img1, attsrc_img2, attsrc_img3,glname1,  glname2,  glname3,  atttype,  opentime,  lasting,sensons,  attlevels,attvideo);
				att.update(user1);
				response.sendRedirect("query4.pzl");
			}
		}else {
			System.out.println("bbbbb");
			attractions user1=new attractions(id,attname,attsrc_img,attsrc_img1, attsrc_img2, attsrc_img3,glname1,  glname2,  glname3,  atttype,  opentime,  lasting,sensons,  attlevels,attvideo);
			att.update(user1);
			response.sendRedirect("query4.pzl");
		}
		
		
	}
	protected void edit2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String forwardPath="/error.jsp";
		
		try {
			attractions user=att.get(Integer.parseInt(id));
			if(user!=null) {
				request.setAttribute("user",user);
				forwardPath="/attractionupdate.jsp";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		request.getRequestDispatcher(forwardPath).forward(request,response);
		
	}
	protected void query3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		HttpSession session=request.getSession();
		List<attractions> attractions=(List<attractions>)session.getAttribute("Users");
	    int total=att.Count(attractions);
		int currentPage;
		int pageSize=3;
		int pageCount=(total-1)/pageSize+1;
		if(request.getParameter("page")==null){
			currentPage=1;
			
		}else{
			currentPage=Integer.parseInt(request.getParameter("page"));	
		}
		if(currentPage<pageCount) {
			List<attractions> us=att.selectUser(attractions, currentPage, pageSize);
			request.setAttribute("users", us);
		}
		else {
			int endSize=total%pageSize;
			
			if(endSize==0) {
				List<attractions> us=att.selectUser(attractions, currentPage, pageSize);
				request.setAttribute("users", us);
			}else {
				List<attractions> us=att.selectUser2(attractions, currentPage, pageSize,endSize);
				request.setAttribute("users", us);
				
			}
			
		}
			
		request.setAttribute("pageSize",pageSize);
		request.setAttribute("currentPage",currentPage);
		request.setAttribute("pageCount",pageCount);
		request.getRequestDispatcher("attraction.jsp").forward(request,response);
	
	}
	protected void query4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String attname=request.getParameter("attname");
		String atttype=request.getParameter("atttype");
		String attlevels=request.getParameter("attlevels");
		
		attCriteria CriteriaUser=new attCriteria(attname,atttype,attlevels);
		List<attractions> users=att.attCriteria(CriteriaUser);
		HttpSession session=request.getSession();
		session.setAttribute("Users",users);	
		request.getRequestDispatcher("query3.pzl").forward(request,response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
