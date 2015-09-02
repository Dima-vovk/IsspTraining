package ua;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("name1")
public class ServletAdmin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 134L;


		
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (
				PrintWriter out = response.getWriter()) {
				Enumeration<String> parametrNames =  request.getParameterNames();
				String name;
				String value;
				while (parametrNames.hasMoreElements()){
					name = parametrNames.nextElement();
					value = request.getParameter(name);

if (name.equals(getInitParameter(name)) || value.equals(getInitParameter(value))){
	out.println("HELO");}
	else {
		out.println("POKA");
	}
		}
			}
				catch (Exception e) {
			e.printStackTrace();
		}
		}
	}