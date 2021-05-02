package Flyawayservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Set;

import Flyawaydao.FlyawayDao;
import Flyawaydao.FlyawayDaoImpl;
import Flyawaydto.Flyaway;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Flyawaydao.FlyawayDaoImpl;
import Flyawaydto.Flyaway;

//@WebServlet("/register")
public class Flyawayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String uname = request.getParameter("uname");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<div align = 'center'>");
		out.println("Passenger details </br></br>");
		out.println("<label for='Passenger Name'>Passenger Name</label>");
		out.println("<input type='text'placeholder='Name'></br></br>");
		out.println("<label for='Passenger Email'>Email</label>");
		out.println("<input type='int'placeholder='Email'></br></br>");
		out.println("<label for='Passenger Contact'>Contact</label>");
		out.println("<input type='phone' id='phone'placeholder='Contact'></br></br>");
		out.println("<form action='Payment' method='post'>");
        out.println("<input type='submit' value='submit'/>");
        out.println("</form>");
        out.println("</div>");
        out.println("</html");
        out.close();

        FlyawayDao flyawayDao = new FlyawayDaoImpl();
		System.out.println("flights details");
		
		Set<Flyaway> flyaway = flyawayDao.getAllFlyaway();
		System.out.println(flyaway);

        
	}

}
          