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

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		Cookie c[]=req.getCookies();
	    
		if(c==null) {
			pw.println("session expired...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		else {
			String fname=c[0].getValue();
			pw.println("Page Belongs to User "+fname+"<br>");
			
			ServletContext sct=this.getServletContext();
			UserBean ub=(UserBean) sct.getAttribute("ub");
			
			pw.println(ub.getFname()+"&nbsp&nbsp&nbsp&nbsp"+ub.getLname()+"&nbsp&nbsp&nbsp&nbsp"+ub.getAddr()+"&nbsp&nbsp&nbsp&nbsp"+ub.getMid()+"&nbsp&nbsp&nbsp&nbsp"+ub.getPnum()+"&nbsp&nbsp&nbsp&nbsp"
					      +"<a href='edit'>Edit Profile</a><br><a href='logout'>Logout</a>"   );
		
		}
	}

}
