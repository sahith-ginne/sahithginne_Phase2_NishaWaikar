<%@page import="Flyawaydao.FlyawayDao"%>
<%@page import="Flyawaydao.FlyawayDaoImpl"%>
<%@page import ="Flyawaydto.Flyaway"%>
<%@page import ="java.util.Set"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Welcome to Flyaway</h1>
 
  <form action="<%= request.getContextPath() %>/Flyawayservlet" method="post">
   <table style="with: 80%">
    <% 
FlyawayDao flyawayDao = new FlyawayDaoImpl();
		
Set<Flyaway> flyawayData = flyawayDao.getAllFlyaway();
		 %>
		
    <tr>
     <td>Airlines</td>
     <td><input type="text" name="Airlines" required ></input></td>
    </tr>
   
    <tr>
     <td>Arival</td>
     <td><input type="text" name="Arival" required/></td>
    </tr>
    <tr>
     <td>Departure</td>
     <td><input type="text" name="Departure" required/></td>
    </tr>
    <tr>
     <td>Economy</td>
     <td><input type="text" name="Economy" required /></td>
    </tr>
    <tr>
    <td>Date of Journey</td>
   <td><input type ="date" id="date" name="date" required/></td>
   </tr>
   <tr>
    <td>Date of Return</td>
   <td><input type ="date" id="date" name="date" /></td>
   </tr>
   <tr>
    <td>Number of Passengers</td>
   <td><input type ="int"  name="no of passengers" required/></td>
   </tr>
    <tr>
     <td>Price</td>
     <td><input type="int" name="Price" required/></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>