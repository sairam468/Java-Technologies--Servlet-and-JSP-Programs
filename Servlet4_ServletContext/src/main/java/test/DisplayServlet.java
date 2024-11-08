 package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String uname=req.getParameter("name");
		
		pw.println("Welcome "+uname);
		
		ServletContext sct=this.getServletContext();
		pw.println("<br>***ServletContext***");
		
		pw.println("<br>Servlet Info :"+sct.getServerInfo());
		
//		pw.println("<br>ContextVal :"+sct.getInitParameter("x"));
//		pw.println("<br>ContextVal :"+sct.getInitParameter("y"));
//		pw.println("<br>ContextVal :"+sct.getInitParameter("z"));
		
		Enumeration<String> e=sct.getInitParameterNames();
		
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			pw.println("<br>"+s+"-->"+sct.getInitParameter(s));
		}
		
	}

}
