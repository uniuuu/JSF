package project.filters;

import java.io.IOException;

//import java.util.logging.Filter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.bean;

public class loginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
	    HttpServletResponse resp = (HttpServletResponse) response;
	    bean session = (bean) req.getSession().getAttribute("bean1");
	    String url = req.getRequestURI();
	    
	    
	    if (session == null || !session.isLogged) {
	    	if(url.indexOf("forum.xhtml") >=0 || url.indexOf("logout.xhtml") >=0 ){
	    		resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
	    	} else {
	    		chain.doFilter(request, response);
	    	}
	    	
	    	
	    } else {
	    	if (url.indexOf("register.xhtml") >= 0 || url.indexOf("login.xhtml") >=0 ) {
	    		resp.sendRedirect(req.getServletContext().getContextPath() + "/forum.xhtml");
	    	} else if (url.indexOf("logout.xhtml") >=0 ) {
	    		req.getSession().removeAttribute("bean1");
	    		resp.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
	    	} else {
	    		chain.doFilter(request, response);
	    	}
	    }
	
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
