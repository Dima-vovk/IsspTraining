package ua;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 17320894L;
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	
	try (PrintWriter out = response.getWriter()){
		HttpSession session = request.getSession();
		Enumeration<String> parametrNames =  request.getParameterNames();
		String name;
		String name2;
		String value;
		String value2;
		out.println("Request parametr are:");
		parametrNames.hasMoreElements();
		name = parametrNames.nextElement();
		name2 = parametrNames.nextElement();
		value = request.getParameter(name);
		value2 = request.getParameter(name2);
		
		
		
		
		if (session.isNew()){
		session.setMaxInactiveInterval(60);	
		response.sendRedirect("login.html");
		}
		
		else 
			if (session.getLastAccessedTime() == 0){
			response.sendRedirect("login.html");
			}
			else response.sendRedirect("main.html");
		}
		catch (Exception e) {
	e.printStackTrace();
}	
}
}
