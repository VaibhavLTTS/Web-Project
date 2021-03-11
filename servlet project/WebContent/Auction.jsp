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
Auctiondao ad=new Auctiondao();

List<Auction> li=ad.showAuction();
%>
<table>
<tr>
<th>Auction Id</th>
<th> Player Id</th>
<th>team Id</th>

<th> Amount</th>

</tr>
<%
for (Auction a:li){
%>
<tr>
<td><%=a.getAuc_id() %></td>
<td><%=a.getPlayer_id() %></td>

<td><%=a.getTeam_id() %></td>
<td><%=a.getAmount() %></td>

</tr>
<%} %>
</table>

</body>
</html>