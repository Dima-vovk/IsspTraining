package ua;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1233451L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		response.getOutputStream().println("Session ID is "+ session.getId());
		response.getOutputStream().println("Session time is "+ session.getMaxInactiveInterval());
		response.getOutputStream().println("Session time is "+ session.getMaxInactiveInterval());
		session.setMaxInactiveInterval(5);
	}

}
