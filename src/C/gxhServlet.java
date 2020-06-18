package C;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import M.User;
import M.UserDAO;
import M.UserDAOJdbcimpl;

/**
 * Servlet implementation class gxhServlet
 */
@WebServlet("*.xh")
public class gxhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  UserDAO UserD=new UserDAOJdbcimpl();     
       
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
	protected void login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.print(username);
		System.out.print(password);
		User user=UserD.get(username,password);
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
				request.getRequestDispatcher("loginaddreg.html").forward(request,response);
			}
			else
			{
				User user=new User(username,password,gender,phonenumber);
			    UserD.add(user);
			    System.out.print("123456789");
				out.print("注册成功，3秒钟后返回登录页面");
				response.setHeader("refresh", "3;URL=loginaddreg.html");
				
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
