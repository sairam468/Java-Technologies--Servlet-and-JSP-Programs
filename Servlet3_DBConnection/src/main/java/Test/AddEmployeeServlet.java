package Test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployeeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		EmployeeBean eb =new EmployeeBean();
		
		eb.setId(Integer.parseInt(req.getParameter("id")));
		eb.setName(req.getParameter("name"));
		eb.setDesg(req.getParameter("desg"));
		eb.setBsal(Double.parseDouble(req.getParameter("bsal")));
		
		int k=new InsertEmployeeDAO().insertDetails(eb);
		
		if(k>0) {
			pw.println("Employee Details Added Sucessfull......<br>");
			RequestDispatcher rd=req.getRequestDispatcher("choice.html");
			rd.include(req, res);
			
		}
		else {
		    pw.println("Failed to Add Employee Details...<br>");
		    RequestDispatcher rd = req.getRequestDispatcher("input.html");
		    rd.include(req, res);
		}
	
	}

}
