package ua;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ParametrServlet extends HttpServlet implements Servlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("Destroy ShowParameterServlet");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Init ShowParameterServlet");
		

	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			try (PrintWriter out = response.getWriter()) {
			Enumeration<String> parametrNames =  request.getParameterNames();
			String name;
			String name2;
			String value;
			String value2;
			out.println("Request parametr are:");
			
			if (request.getMethod().equals("GET"))
				out.print("GET");

			parametrNames.hasMoreElements();
			name = parametrNames.nextElement();
			name2 = parametrNames.nextElement();
			value = request.getParameter(name);
			value2 = request.getParameter(name2);
			out.println("Parametr: "+ name + "="+ value);
			out.println("Parametr: "+ name2 + "="+ value2);
			
		
			if (name == null && name2 == null){
			response.sendError(505);
			}
			else 	if (value == "" || value2==""){
				out.print("The data is entered incorrectly!!!");
			}
			else {
				out.print("Vse OK!!!!!!");
			}
			}
		
			
			
			catch (Exception e) {
		e.printStackTrace();
	}
	}
}