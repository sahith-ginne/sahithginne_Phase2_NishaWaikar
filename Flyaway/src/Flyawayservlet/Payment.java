package Flyawayservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<div align = 'center'>");
		out.println("Payment Gateway</br></br>");
		out.println("<label for='Card Number'>Card Number</label>");
	    out.println("<input type='int' id='number' name='Card Number' placeholder='0000-0000-0000-0000' pattern='[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}'></br></br>");
		out.println("<label for='Card holder Name'>Card Holder Name</label>");
		out.println("<input type='text'placeholder='Name'></br></br>");
		out.println("<label for='Valid'>Valid Thru</label>");
		out.println("<input type='date'id='date'placeholder=''></br></br>");
		out.println("<label for='CVV'>CVV</label>");
		out.println("<input type='int'id='number'placeholder='CVV' pattern='[0-9]{3}'></br></br>");
		out.println("<form action='Thankyou' method='post'>");
        out.println("<input type='submit' value='submit'/>");
        out.println("</form>");
        out.println("</div>");
        out.println("</html");
        out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
