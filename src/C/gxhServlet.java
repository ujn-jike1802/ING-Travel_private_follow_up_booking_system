package C;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import M.User;
import M.UserDAO;
import M.UserDAOJdbcimpl;
import M.criteriauser;
import M.criteriaorder;
import M.Order;
import M.OrderDAO;
import M.OrderDAOJdbcimpl;

/**
 * Servlet implementation class gxhServlet
 */
@WebServlet("*.xh")
public class gxhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  UserDAO UserD=new UserDAOJdbcimpl(); 
	private  OrderDAO OrderD=new OrderDAOJdbcimpl();    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gxhServlet() {
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
		methodName= methodName.substring(0,methodName.length()-3);
		try {
		
			Method method=getClass().getDeclaredMethod(methodName,HttpServletRequest.class, HttpServletResponse.class );
			method.invoke(this, request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.print(username);
		System.out.print(password);
		User user=UserD.getuser(username,password);
		if(user!=null)
		{
			    HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("success.jsp");
		}
		else
		{
			request.setAttribute("msg", "用户名账号或密码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	private void getusers(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		List<User> us=UserD.getalluser();
		if(us!=null)
		{
		request.setAttribute("user", us);
	    request.getRequestDispatcher("getusers.jsp").forward(request, response);
		}
	}
    private void exituser(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		String idString=request.getParameter("id");
		String forwardPath="erro.jsp";
		try {
			User user=UserD.getuser(Integer.parseInt(idString));
			if(user!=null)
			{	
				
				request.setAttribute("user", user);
				System.out.print(user.getId());
				forwardPath="updateuser.jsp";
				//request.getRequestDispatcher().forward(request, response);
			}
			
		} catch (Exception e) {
			
		}
		request.getRequestDispatcher(forwardPath).forward(request, response);
	}
    private void exitorder(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		String idString=request.getParameter("id");
		String forwardPath="erro.jsp";
		try {
			Order order=OrderD.getorder(Integer.parseInt(idString));
			if(order!=null)
			{	
				request.setAttribute("order", order);
				forwardPath="updateorder.jsp";
				//request.getRequestDispatcher().forward(request, response);
			}
			
		} catch (Exception e) {
			
		}
		request.getRequestDispatcher(forwardPath).forward(request, response);
    }
    private void updateuser(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		int id=Integer.parseInt(request.getParameter("id"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		User user=UserD.getuser(id);
		System.out.print(user.getGender());
		User user1=new User(id,username,password,gender,phonenumber);
		UserD.updateuser(user1);
		response.sendRedirect("query4.xh");
		
	}
	private void updateorder(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		int id=Integer.parseInt(request.getParameter("id"));
		String username=request.getParameter("username");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		String ph_id=request.getParameter("ph_id");
		String ph_username=request.getParameter("ph_username");
		String ph_gender=request.getParameter("ph_gender");
		String ph_phonenumber=request.getParameter("ph_phonenumber");
		String status=request.getParameter("status");
		System.out.print(gender);
		Order order=OrderD.getorder(id);
		Order order1=new Order(id,username,gender,phonenumber,ph_id,ph_username, ph_gender,ph_phonenumber,status);
		OrderD.updateorder(order1);
		response.sendRedirect("query2.xh");
		
	}
    private void deleteuser(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int i=0;
		String id=request.getParameter("id");
		try {
			UserD.deleteuser(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		response.sendRedirect("query4.xh");
	}
	private void deleteorder(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int i=0;
		String id=request.getParameter("id");
		try {
			OrderD.deleteorder(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		response.sendRedirect("query2.xh");
	}
	private void adduser(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		User user=new User(username,password,gender,phonenumber);
		UserD.adduser(user);
		response.sendRedirect("query4.xh");
	}
	private void addorder(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		String username=request.getParameter("username");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		String ph_id=request.getParameter("ph_id");
		String ph_username=request.getParameter("ph_username");
		String ph_gender=request.getParameter("ph_gender");
		String ph_phonenumber=request.getParameter("ph_phonenumber");
		String status=request.getParameter("status");
		Order order=new Order(username,gender,phonenumber,ph_id,ph_username, ph_gender,ph_phonenumber,status);
		OrderD.addorder(order);
		response.sendRedirect("query2.xh");
	}
    private void query1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		String username=request.getParameter("username");
		String ph_username=request.getParameter("ph_username");
		String status=request.getParameter("status");
		criteriaorder oo=new criteriaorder(username,ph_username,status);
		HttpSession session=request.getSession();
		session.setAttribute("oo",oo);
		System.out.print(oo.getUsername()+oo.getPh_username()+oo.getStatus());
		request.getRequestDispatcher("query2.xh").forward(request,response);
	}
	private void query3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String phonenumber=request.getParameter("phonenumber");
		criteriauser cc=new criteriauser(username,password,gender,phonenumber);
		HttpSession session=request.getSession();
		session.setAttribute("cc",cc);//把获取的值保存到一个criteriauser
		request.getRequestDispatcher("query4.xh").forward(request,response);
	}
    private void query2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	request.setCharacterEncoding("UTF-8");
	response.setContentType("textml; charset=UTF-8");
	HttpSession session=request.getSession();
	criteriaorder oo=(criteriaorder) session.getAttribute("oo");
	int currPage;
	int pageSize=2;
	int pageCount=(int)((OrderD.getPageCount2(oo)-1)/pageSize+1);
	if(request.getParameter("page")==null){
		currPage=1;
	}
	else
	{
		currPage=Integer.parseInt(request.getParameter("page"));
	}
	List<Order> or=OrderD.getcriteriaoder(oo, currPage, pageSize);
	request.setAttribute("pageSize", pageSize);
	request.setAttribute("currPage", currPage);
	request.setAttribute("pageCount",pageCount);
	if(or!=null)
	{
		
	request.setAttribute("order", or);
    request.getRequestDispatcher("getallorder.jsp").forward(request, response);
	}
	}
	private void query4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml; charset=UTF-8");
		HttpSession session=request.getSession();
		criteriauser cc=(criteriauser) session.getAttribute("cc");//获取cc  跟那个就一样了
		System.out.print(cc.getPassword());
		int currPage;
		int pageSize=2;
		int pageCount=(int)((UserD.getPageCount1(cc)-1)/pageSize+1);
		if(request.getParameter("page")==null){
			currPage=1;
		}
		else
		{
			currPage=Integer.parseInt(request.getParameter("page"));
		}
		List<User> us=UserD.getcriteriauser(cc, currPage, pageSize);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("currPage", currPage);
		request.setAttribute("pageCount",pageCount);
		if(us!=null)
		{
			
		request.setAttribute("user", us);
	    request.getRequestDispatcher("getalluser.jsp").forward(request, response);
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
