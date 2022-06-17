<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
<h2>Create | Lead</h2>
<form action="saveLead" method="post">
 <pre>
    FirstName <input type="text" name="firstName"/>
    LastName  <input type="text" name="lastName"/>
    LeadSource<select name="leadSource" >
				  <option value="radio">Radio</option>
				  <option value="newsPaper">News Paper</option>
				  <option value="tv">Television</option>
				  <option value="online">Online</option>
              </select>
      Email   <input type="email" name="email"/>
      Mobile  <input type="tel" name="mobile"/>
      <input type="submit" value="save"/>        
 </pre>
</form>

    ${error}
</body>
</html>