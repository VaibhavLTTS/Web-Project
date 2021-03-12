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
List<Player> nli=new ArrayList<Player>();
String name=request.getParameter("pname");
for(Player p: li){
	if(p.getNationality().equalsIgnoreCase(name)){
		nli.add(p);
	}
}
%>
<h1>Team Name: <%=name %> </h1>
<h2>Players are</h2>
<% for(Player p2:nli) {%>
<%=p2.getpName() %> <br><br>
<%} %>
</body>
</html>