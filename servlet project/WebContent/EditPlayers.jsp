<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
Playerdao pd=new Playerdao();
Player p1=pd.getAllPlayerById(id);
%>
<form action="./UpdatePlayerServlet" method="post">
Player Id:<input type="hidden" name="pid" value= <%=p1.getPid() %>> <br><br>
Player Name: <input type="text" value="<%=p1.getpName() %>" name="pname"><br><br>
Player Country: <input type="text" value="<%=p1.getNationality() %>" name="Nationality"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>