<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.desafiolatam.modelo.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="starter-template.css" rel="stylesheet">
	
	<!--Librería de Jquery paa trabajarla sin descargar, esta libreia sirve para llamada ajax-->
<script type="text/JavaScript"
src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	
<title>Insert title here</title>

</head>
<body>
 <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
      <a class="navbar-brand" href="sign_in.jsp">Horoscopo chino</a>
      
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="Sign_Up.jsp">Sign Up</a>
          </li>     
        </ul>
      </div>
    </nav>
    
 <h1 style="padding-top: 70px;" class="hidden">Sign In</h1>
   <form action="SignIn_servlet" method="POST" class="hidden">
  <div class="form-group hidden">
    <label for="exampleInputEmail1" class="hidden">Email address</label>
    <input type="email" class="form-control hidden" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email">
    <small id="emailHelp" class="form-text text-muted hidden">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group hidden">
    <label for="exampleInputPassword" class="hidden">Password</label>
    <input type="password" class="form-control hidden" id="exampleInputPassword1" placeholder="Password" name="pass">
  </div>
  
  <button type="submit" class="btn btn-primary hidden">Sign in</button>
</form>


<% if (request.getAttribute("name")!=null) { %>
	<script>
	iniciar();
	function iniciar(){
		$(".hidden").empty();
	}
	
	</script>
	
<div>Bienvenido <%=request.getAttribute("name") %></div>
<% } else { %>

<% } %>

 <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>