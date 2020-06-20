package C;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import M.CriteriaDemo;
import M.CriteriaPhotographer;
import M.Criteriaorder;
import M.PageMan;
import M.User;
import M.attractions;
import M.classDemo;
import M.order;
import M.orderdao;
import M.orderdaoimpl;
import M.photographer;
import M.photographerdao;
import M.photographerimpl;
import M.pieces;
import M.piecesdao;
import M.piecesdaoimpl;
import M.DemoDAOJdbcimpl;
import M.DemoDao;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(urlPatterns= {"*.yb"})
public class ybServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DemoDao DAO=new DemoDAOJdbcimpl();       //DAO
	private photographerdao Dao=new photographerimpl();
	private piecesdao pDao=new piecesdaoimpl();
    private orderdao dao=new orderdaoimpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ybServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
	protected void Demo(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		out.print("我是demo.yb");
	}
	protected void attraction_show(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		int currPage;
		if(request.getParameter("page")==null || request.getParameter("page").matches("[0-9]+")==false){
			 currPage=1;
	    	  
	       }
		else{
	    	 currPage=Integer.parseInt(request.getParameter("page"));
	    	 currPage=currPage<1?1:currPage;
	       }
		attractions att=new attractions();
		att=DAO.getById(currPage); 
		int attnumber=(int)DAO.getAttNumber();
		request.setAttribute("att",att);
		request.setAttribute("attnumber",attnumber);
		request.setAttribute("currPage",currPage);
		request.getRequestDispatcher("showattraction.jsp").forward(request, response);
	}
	protected void attraction_show_by_name(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		attractions att=new attractions();
		att=DAO.getByname(request.getParameter("name"));
		System.out.print(att.getAttname()+"\n");
		int attnumber=(int)DAO.getAttNumber();
		request.setAttribute("att",att);
		request.setAttribute("attnumber",attnumber);
		request.setAttribute("currPage",att.getId());
		request.getRequestDispatcher("showattraction.jsp").forward(request, response);
	}
	protected void photographer_and_pieces(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String ph_name=request.getParameter("ph_name");
		CriteriaPhotographer pher=new CriteriaPhotographer(ph_name);
		List<photographer> list=Dao.getCirteriaphers(pher);
		List<pieces> piece = pDao.getpieces();
		System.out.print(list.size()+"\n");
		/*for(int i=0;i<list.size();i++) {
			photographer p=list.get(i);
			System.out.print(p.getPh_id()+"\n");
			System.out.print(p.getPh_username()+"\n");
		}*/

		for(int i=0;i<list.size();i++) {
			List<pieces> temp;
			photographer p=list.get(i);
			System.out.print(p.getPh_id()+"\n");
			System.out.print(p.getPh_username()+"\n");
			temp=pDao.getpieces_by_id(p.getPh_id());
			pieces temp1=temp.get(0);
			pieces temp2=temp.get(1);
			System.out.print(temp1.getId()+temp1.getPhoto_place()+"\n");
			System.out.print(temp2.getId()+temp2.getPhoto_place()+"\n");
			piece.set(2*i,temp1);
		    piece.set(2*i+1,temp2);
		}
		request.setAttribute("piece",piece);
		request.setAttribute("list",list);
		request.getRequestDispatcher("Photographers.jsp").forward(request, response);
	}
	protected void user_appointment(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		}
	protected void pher_appointment(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		}
	protected void user_select_appointment(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		// TODO Auto-generated method stub
		  String ph_username=null;
		  String ph_gender=null;
		  String action=(String)request.getParameter("do");
		  HttpSession session=request.getSession(true);
		  
		  String id="1"; //活跃用户id(String) session.getAttribute("id");
		  
		if(action.equals("no")) 
		{  
	      ph_username=(String) session.getAttribute("ph_username");
	      ph_gender=(String) session.getAttribute("ph_gender");
		 
		}
	    else if(action.equals("yes")){
	    	ph_username=request.getParameter("ph_username");
	    	ph_gender=request.getParameter("ph_gender"); 
		   session.setAttribute("ph_username",ph_username);
		   session.setAttribute("ph_gender", ph_gender);
		   
		}
		  Criteriaorder criteriorder=new Criteriaorder(ph_username,ph_gender);  
		  
		   PageMan pageMan=new PageMan(); 
	       if(request.getParameter("page")==null || request.getParameter("page").matches("[0-9]+")==false){
	    	   pageMan.setCurrent(1);
	       }
	       else{
	    	   pageMan.setCurrent(Integer.parseInt(request.getParameter("page")));
	    	   pageMan.setCurrent(pageMan.getCurrent()<1?1:pageMan.getCurrent());
	       }
	        pageMan.setPageSize(4);
	        int selectNumber=(int)dao.getorderNumber(id,criteriorder); //活跃用户id
	        System.out.print(selectNumber+"\n");
	        List<order> orders=dao.getCirteriaorder(id,criteriorder,pageMan); //活跃用户id
	        for(int i=0;i<orders.size();i++){
       		  order or=orders.get(i);     	
	             System.out.print(or.getId());       
	             System.out.print(or.getPh_id());       
	             System.out.print(or.getOr_status());            
	        }
       	  
	        pageMan.setPageNumber(((selectNumber-1)/pageMan.getPageSize())+1);
			request.setAttribute("pageMan",pageMan);
		    request.setAttribute("orders", orders);
		    request.getRequestDispatcher("apointment_of_user.jsp").forward(request, response);
	}
	protected void pher_select_appointment(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		// TODO Auto-generated method stub 
		  String username=null;
		  String gender=null;
		  String action=(String)request.getParameter("do");
		  HttpSession session=request.getSession(true);
		  String ph_id="1";//(String) session.getAttribute("ph_id");session
		if(action.equals("no")) 
		{
			username=(String) session.getAttribute("username");
			gender=(String) session.getAttribute("gender");
		 
		}
	    else if(action.equals("yes")){
	    	username=request.getParameter("username");
	    	gender=request.getParameter("gender");
		   session.setAttribute("username",username);
		   session.setAttribute("gender", gender);
		   
		}
		  Criteriaorder criteriorder=new Criteriaorder(username,gender);  
		  
		  PageMan pageMan=new PageMan(); 
		  pageMan.setPageSize(4);
	       if(request.getParameter("page")==null || request.getParameter("page").matches("[0-9]+")==false){
	    	   pageMan.setCurrent(1);
	       }
	       else{
	    	   pageMan.setCurrent(Integer.parseInt(request.getParameter("page")));
	    	   pageMan.setCurrent(pageMan.getCurrent()<1?1:pageMan.getCurrent());
	       }
	        int selectNumber=(int)dao.getordernumber(ph_id,criteriorder);
	        List<order> orders=dao.getCirteriaOrder(ph_id,criteriorder,pageMan);
	        pageMan.setPageNumber(((selectNumber-1)/pageMan.getPageSize())+1);
			request.setAttribute("pageMan",pageMan);
		    request.setAttribute("orders", orders);
		    request.getRequestDispatcher("appointment_of_pher.jsp").forward(request, response);
	}
	protected void delete_from_user(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			// TODO Auto-generated method stub
		    dao.delete_by_User(request.getParameter("id"));
			response.sendRedirect("apointment_of_user.jsp");
	}
	protected void delete_from_pher(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		   
		    dao.delete_by_Pher(request.getParameter("id"));
		    response.sendRedirect("appointment_of_pher.jsp");
	}
	protected void 	update_from_pher(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	       String id= request.getParameter("id");
	       order temp=dao.get_order_by_oid(id);
	       temp.setOr_status("1");
		   dao.update_by_Pher(temp);
	       response.sendRedirect("appointment_of_pher.jsp");
  }
	protected void 	addorder(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	       String id= request.getParameter("id");
	       User user=new User(1,"yangbao","aaa","男","19861823401");//这里是从活跃用户的地方获取
		   photographer pher=Dao.get_by_id(id);
		   dao.add(pher, user);
	       response.sendRedirect("apointment_of_user.jsp");
}

}
