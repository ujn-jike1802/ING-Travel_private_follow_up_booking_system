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
import M.PageMan;
import M.UserDAO;
import M.classDemo;
import M.DemoDAOJdbcimpl;
import M.DemoDao;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(urlPatterns= {"*.yb"})
public class ybServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO DAO=new DemoDAOJdbcimpl();       //DAO
	
    
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
		String action=request.getParameter("type");
		
	}
}
