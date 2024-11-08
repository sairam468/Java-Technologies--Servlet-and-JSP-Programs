package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/first")
public class Servlet1 implements Servlet{

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// No code
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String mailId=req.getParameter("mid");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("***Display from servlet***");
		pw.println("<br>UserName : "+name);
		pw.println("<br>MailID :"+mailId);
	}

	@Override
	public void destroy() {
		// No code
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		return "FirstServlet reading data from Html"; //demo code
	}

}
