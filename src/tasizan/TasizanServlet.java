package tasizan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TasizanServlet
 */
@WebServlet("/TasizanServlet")
public class TasizanServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	      req.setCharacterEncoding("utf-8");
	      res.setContentType("text/html; charset=utf-8");
	      PrintWriter out = res.getWriter();
	      out.println("<!DOCTYPE html>");
	      out.println("<meta charset=\"utf-8\">");
	      out.println("<title>BMI</title>");
	      
	      String a = req.getParameter("a");
	      String b = req.getParameter("b");
	      double t = Double.parseDouble(a);
	      double s = Double.parseDouble(b) / 100;


	      
	      out.println(a + b);

	}




	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
}
	
	

