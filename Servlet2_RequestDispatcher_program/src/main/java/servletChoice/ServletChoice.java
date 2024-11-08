package servletChoice;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/main")
public class ServletChoice extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("s1");
		if(s1.equalsIgnoreCase("add")) {
			RequestDispatcher rd=req.getRequestDispatcher("ad");
			rd.forward(req, res);
		}
		else if(s1.equalsIgnoreCase("sub")) {
			RequestDispatcher rd=req.getRequestDispatcher("sb");
			rd.forward(req, res);
		}
		else if(s1.equalsIgnoreCase("mul")) {
			RequestDispatcher rd=req.getRequestDispatcher("mu");
			rd.forward(req, res);
		}
		else if(s1.equalsIgnoreCase("div")) {
			RequestDispatcher rd=req.getRequestDispatcher("di");
			rd.forward(req, res);
		}
		else if(s1.equalsIgnoreCase("mod")) {
			RequestDispatcher rd=req.getRequestDispatcher("mo");
			rd.forward(req, res);
		}
		else if(s1.equalsIgnoreCase("avg")) {
			RequestDispatcher rd=req.getRequestDispatcher("av");
			rd.forward(req, res);
		}	
	}
}
