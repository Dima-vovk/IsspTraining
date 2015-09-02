package ua;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ShowParametrServlet implements Servlet {

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
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {

			try (
			PrintWriter out = response.getWriter()) {
			Enumeration<String> parametrNames =  request.getParameterNames();
			String name;
			String value;
			out.println("Request parametr are:");
			while (parametrNames.hasMoreElements()){
				name = parametrNames.nextElement();
				value = request.getParameter(name);
				out.println("Parametr: "+ name + "="+ value);
			}
			}
			catch (Exception e) {
		e.printStackTrace();
	}
	}
}