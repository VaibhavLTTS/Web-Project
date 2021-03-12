  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
  <%
  Playerdao pd=new Playerdao();
  Set<String> teamname = new TreeSet<String>();
  List<Player> li=pd.showPlayer();
  for(Player p:li){
	  teamname.add(p.getNationality());
  }
  
  %>
  <%
for(String str:teamname){
	 %>
	 <a href="viewteamplayers.jsp?pname=<%=str%>"><%=str%></a> <br><br>
	 <%} %>

</body>
</html>