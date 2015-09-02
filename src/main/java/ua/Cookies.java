package ua;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cookies extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1346L;

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
			parametrNames.hasMoreElements();
			name = parametrNames.nextElement();
			name2 = parametrNames.nextElement();
			value = request.getParameter(name);
			value2 = request.getParameter(name2);
			
						
			if (request.getCookies() != null){
				response.sendRedirect("main.html");
			}
			else 
			response.sendRedirect("ligin.html");
			Cookie cookie = new Cookie("transport-cookie",new Date().toString());
			
			}
			catch (Exception e) {
		e.printStackTrace();
	}	
	}
	}
