/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-05-01 12:38:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Flyawaydao.FlyawayDao;
import Flyawaydao.FlyawayDaoImpl;
import Flyawaydto.Flyaway;
import java.util.Set;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div align=\"center\">\r\n");
      out.write("  <h1>Welcome to Flyaway</h1>\r\n");
      out.write(" \r\n");
      out.write("  <form action=\"");
      out.print( request.getContextPath() );
      out.write("/Flyawayservlet\" method=\"post\">\r\n");
      out.write("   <table style=\"with: 80%\">\r\n");
      out.write("    ");
 
FlyawayDao flyawayDao = new FlyawayDaoImpl();
		
Set<Flyaway> flyawayData = flyawayDao.getAllFlyaway();


	

		 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>Airlines</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"Airlines\" required ></input></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>Arival</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"Arival\" required/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>Departure</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"Departure\" required/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>Economy</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"Economy\" required /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Date of Journey</td>\r\n");
      out.write("   <td><input type =\"date\" id=\"date\" name=\"date\" required/></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td>Date of Return</td>\r\n");
      out.write("   <td><input type =\"date\" id=\"date\" name=\"date\" /></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td>Number of Passengers</td>\r\n");
      out.write("   <td><input type =\"int\"  name=\"no of passengers\" required/></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>Price</td>\r\n");
      out.write("     <td><input type=\"int\" name=\"Price\" required/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("   \r\n");
      out.write("  </form>\r\n");
      out.write("  \r\n");
      out.write(" </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
