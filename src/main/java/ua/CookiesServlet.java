package ua;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesServlet extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 14567L;

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	Cookie [] cookies = request.getCookies();
	response.getWriter().println("Cookies count is " + cookies.length);
	for (int i =0; i<cookies.length; i++){
		response.getWriter().println(cookies[i].getComment());
		response.getWriter().println(cookies[i].getDomain());
		response.getWriter().println(cookies[i].getMaxAge());
		response.getWriter().println(cookies[i].getName());
		response.getWriter().println(cookies[i].getPath());
		response.getWriter().println(cookies[i].getSecure());
		response.getWriter().println(cookies[i].getValue());
		response.getWriter().println(cookies[i].getVersion());
		response.getWriter().println(cookies[i].isHttpOnly());
	}
	Cookie cookie = new Cookie("issp-cookie",new Date().toString());
	cookie.setComment("Bla-bla");
	//cookie.setHttpOnly(true);
	cookie.setDomain("localhost:8080");
	cookie.setPath("/issp");
	response.addCookie(cookie);
}
}