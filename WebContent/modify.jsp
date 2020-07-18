<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.desafiolatam.modelo.Usuario" %>
    <%if (request.getSession().getAttribute("session") == null){
    	request.getRequestDispatcher("sign_in.jsp").forward(request,response);
    	
    }else{
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="starter-template.css" rel="stylesheet">
	<%Usuario user; %>
	<%user=(Usuario)request.getAttribute("user"); %>
<title>Modify</title>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
      <a class="navbar-brand" href="Horoscope_servlet">Horoscopo</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
      	<li class="nav-item ">
            <a class="nav-link" href=#><%=user.getName()%></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="ModifyUser_servlet">Modify account</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="EliminateUser_servlet">Eliminate account</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="SearchUser_servlet">Users</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="CloseSession_servlet">Close Session</a>
          </li>
          
        </ul>
        
      </div>
    </nav>
    
   <h1 style="padding-top: 70px;" class="hidden">Modify</h1>
   <form action="ModifyUser_servlet" method="POST" class="hidden">
  <div class="form-group hidden">
    <label for="exampleInputEmail1" class="hidden">Email address to change</label>
    <input type="email" class="form-control hidden" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="emailModify" value="<%=user.getEmail() %>">
    <small id="emailHelp" class="form-text text-muted hidden">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group hidden">
    <label for="exampleInputPassword" class="hidden">Password to change</label>
    <input type="password" class="form-control hidden" id="" placeholder="Password" name="passModify" value="<%=user.getPass()%>">
  </div>
   <div class="form-group hidden">
    <label for="exampleInputPassword" class="hidden">Phone to change</label>
    <input type="number" class="form-control hidden" id="" placeholder="Phone" name="phoneModify" value="<%=user.getPhone()%>">
  </div>
  <div class="form-group hidden">
    <label for="exampleInputPassword" class="hidden">Name to change</label>
    <input type="text" class="form-control hidden" id="" placeholder="Name" name="nameModify" value="<%=user.getName()%>">
  </div>
  <div class="form-group hidden">
    <label for="exampleInputPassword" class="hidden">Date to change</label>
    <input type="text" class="form-control hidden" id="" placeholder="Date" name="dateModify" value="<%=user.getDate()%>">
  </div>
  
  <button type="submit" class="btn btn-primary hidden">Modify account</button>
</form>
    
  
 


<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
<%}%>