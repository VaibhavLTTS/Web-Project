<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.dao.*,com.ltts.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Teamdao td=new Teamdao();

List<Team> li=td.showTeam();
%>
<table>
<tr>
<th>Teamname</th>
<th>teamId</th>
<th> Teamowner</th>
<th> TeamCaptain</th>

</tr>
<%
for (Team t:li){
%>
<tr>
<td><%=t.getTeamName() %></td>
<td><%=t.getTeamId() %></td>

<td><%=t.getTeamOwner() %></td>
<td><%=t.getTeamCaptain() %></td>

</tr>
<%} %>
</table>

</body>
</html>