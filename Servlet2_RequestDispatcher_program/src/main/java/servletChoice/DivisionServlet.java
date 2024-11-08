package servletChoice;
import java.io.*;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/di")
public class DivisionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int x=Integer.parseInt(req.getParameter("v1"));
		int y=Integer.parseInt(req.getParameter("v2"));
		int z=x/y;
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("Division: "+z+"<br>");
		
		RequestDispatcher rd=req.getRequestDispatcher("choice.html");
		rd.include(req, res);
		
		
		
	}

	
}
