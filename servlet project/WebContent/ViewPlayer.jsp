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
Playerdao pd=new Playerdao();
List<Player> li=pd.showPlayer();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Team_id</th>
<th>Date of Birth</th>
<th>Skill</th>
<th>Number of Matches</th>
<th>Runs</th>
<th>Wickets</th>
<th>Country</th>
</tr>
<%
for(Player p:li)
{
	%>
	<tr>
	<td><%=p.getPid() %></td>
	<td><%=p.getpName() %></td>
	<td><%=p.getTeamId() %></td>
	<td><%=p.getDateOfBirth() %></td>
	<td><%=p.getSkill() %></td>
	<td><%=p.getNoOfMatches() %></td>
	<td><%=p.getRuns() %></td>
	<td><%=p.getWickets() %></td>
	<td><%=p.getNationality() %></td>
	<td><a href="EditPlayer.jsp?id=<%=p.getPid()%>">Update</a></td>
	</tr>
	<%} %>
</table>

</body>
</html>