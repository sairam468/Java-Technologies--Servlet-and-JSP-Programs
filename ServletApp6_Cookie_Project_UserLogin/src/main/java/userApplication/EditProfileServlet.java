package userApplication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditProfileServlet
 */
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		Cookie c[]=request.getCookies();
		if(c==null) {
			pw.println("Session Expired...<br>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		else {
			ServletContext sct=this.getServletContext();
			UserBean ub=(UserBean) sct.getAttribute("ub");

			pw.println("Page belongs to "+ub.getFname()+"<br>");
			pw.println("<form action='update' method='post'>");
			pw.println("Address : <input type='text' name='addr' value=' "+ub.getAddr()+" '><br> ");
			pw.println("Mail Id : <input type='text' name='mid' value=' "+ub.getMid()+" '><br> ");
			pw.println("Phone Number : <input type='text' name='phno' value=' "+ub.getPnum()+" '><br> ");
			pw.println("<input type='submit' value='update'>");
			pw.println("</form>");

		}
	}

}
