package ua;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LifeCycleServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1564L;
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init LifeCycleServlet");
		Enumeration<String> paramNames = config.getInitParameterNames();
		String name;
		System.out.println("Parameters:");
		while (paramNames.hasMoreElements()) {
			name = paramNames.nextElement();
			System.out.println("Parameter name is " + name);	
			System.out.println("Parameter value is " + config.getInitParameter(name));
		}
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("Run Service");
	}
	@Override
public void destroy() {
	System.out.println("Destroy LifeCycleServlet");
}
}