package ua;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstSeervlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("FirstServlete service!" + arg0.getAttribute("ff") + arg0.getAttribute("sf"));
		PrintWriter out = arg1.getWriter();
		out.print("First Servlet!");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlete init!");
	}
	
	@Override
	public void destroy() {
		System.out.println("FirstServlete destroy!");
	}
	
	
	
	
	
	
	
	
	
//	
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public ServletConfig getServletConfig() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getServletInfo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void init(ServletConfig arg0) throws ServletException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void service(ServletRequest request, ServletResponse response)
//			throws ServletException, IOException {
//		request.
//
//	}

}
