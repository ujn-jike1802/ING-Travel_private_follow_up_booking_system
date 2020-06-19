package C.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class managerFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
		HttpServletRequest httpServletRequest=(HttpServletRequest)request;
		HttpSession session=httpServletRequest.getSession();
		
		Object user=session.getAttribute("activeUser");
		
		
		if(user==null) {
			try {
				request.getRequestDispatcher("/loginaddreg.html").forward(request,response);
				return;
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}else {
			try {
				chain.doFilter(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
				
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}

	
	
}
