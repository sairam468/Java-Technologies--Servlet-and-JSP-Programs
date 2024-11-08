package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/view")
public class RetrieveEmployeeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		ArrayList<EmployeeBean> al= new RetrieveEmployeeDAO().getEmp();

		if(al.size()==0) {
			pw.println("No Empolyee records found...");
			RequestDispatcher rd=req.getRequestDispatcher("choice.html");
			rd.include(req, res);
		}
		else {
			pw.println("Employee Details are...<br>");
			for(EmployeeBean e : al) {
				pw.println(
						"<tr>" +
								"  <td>" + e.getId() + "</td>" +
								"  <td>" + e.getName() + "</td>" +
								"  <td>" + e.getDesg() + "</td>" +
								"  <td>" + e.getBsal() + "</td>" +
								"</tr>&nbsp&nbsp<a href='edit'>Edit</a>&nbsp&nbsp<a href='delete'>Delete</a><br>"
						);
			}
		}
		pw.println("<a href='choice.html'> back</a>");

	}

}
