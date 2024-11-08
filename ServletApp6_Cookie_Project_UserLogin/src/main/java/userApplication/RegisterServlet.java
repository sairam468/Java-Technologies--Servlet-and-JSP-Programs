package userApplication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		UserBean ub=new UserBean();
		ub.setName(req.getParameter("uname"));
		ub.setPword(req.getParameter("pword"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setAddr(req.getParameter("addr"));
		ub.setMid(req.getParameter("mid"));
		ub.setPnum(Long.parseLong(req.getParameter("phno")));
		
		int k=new RegisterDAO().insertUserDetails(ub);
		
		if(k>0) {
			pw.println("User Registered Sucessfully.....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else
			pw.println("Error Occured");
		
		
		
	}

}
