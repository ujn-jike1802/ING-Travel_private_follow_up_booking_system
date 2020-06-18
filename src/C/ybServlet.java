package C;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import M.CriteriaDemo;
import M.CriteriaPhotographer;
import M.PageMan;
import M.UserDAO;
import M.attractions;
import M.classDemo;
import M.photographer;
import M.photographerdao;
import M.photographerimpl;
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
	protected void photographer_and_pieces(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String ph_name=request.getParameter("ph_name");
		CriteriaPhotographer pher=new CriteriaPhotographer(ph_name);
		int pher_number=(int)Dao.getPhNumber(pher);
		int id=(int)Dao.getPhid(pher);
	}
}
