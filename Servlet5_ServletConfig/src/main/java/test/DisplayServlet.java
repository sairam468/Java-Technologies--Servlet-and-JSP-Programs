package test;

import java.io.*;
//import java.io.IOException;
//import java.io.PrintWriter;

import java.util.Enumeration;

import jakarta.servlet.*;
//import jakarta.servlet.GenericServlet;
//import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;

public class DisplayServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String uname=req.getParameter("uname");
		
		pw.println("Welcome :"+uname);
		pw.println("<br>***ServletConfig***");
		
		ServletConfig scf=this.getServletConfig();
		pw.println("<br>ServletName : "+scf.getServletName());
		
		Enumeration <String> e= scf.getInitParameterNames();
		
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			pw.println("<br>"+s+" : "+scf.getInitParameter(s));
		}
		
	}

}
