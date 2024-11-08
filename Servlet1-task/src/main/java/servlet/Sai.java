package servlet;
import java.io.*;
import java.io.IOException;
import jakarta.servlet.annotation.*;

import jakarta.servlet.*;

@WebServlet("/dis")
public class Sai implements Servlet{


	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String cusname=req.getParameter("cusname");
		String pn=req.getParameter("phno");
		String cuscity=req.getParameter("city");
		String cusmid=req.getParameter("mail");
		
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
//		pw.println("=======Customer Details======<br>");
//		pw.println("Customer name : "+cusname+"<br>");
//		pw.println("Customer phone number : "+pn+"<br>");
//		pw.println("Customer city : "+cuscity+"<br>");
//		pw.println("Customer mailid : "+cusmid+"<br>");
	
		
		pw.println("<h2>Customer Details</h2>");
		pw.println("<table border='1' cellpadding='5' cellspacing='0'>");
		pw.println("<tr><th>Field</th><th>Value</th></tr>");
		pw.println("<tr><td>Customer Name:</td><td>" + cusname + "</td></tr>");
		pw.println("<tr><td>Customer Phone Number:</td><td>" + pn + "</td></tr>");
		pw.println("<tr><td>Customer City:</td><td>" + cuscity + "</td></tr>");
		pw.println("<tr><td>Customer Mail ID:</td><td>" + cusmid + "</td></tr>");
		pw.println("</table>");


		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "SaiServlet";
	}


}
