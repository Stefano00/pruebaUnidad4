<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.desafiolatam.modelo.*" %>
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
    
    <!-- <link href="starter-template.css" rel="stylesheet"> -->

     <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 
    <script>src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"</script>
    
<!--Librería de Jquery paa trabajarla sin descargar, esta libreia sirve para llamada ajax-->
<script type="text/JavaScript"
src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


    <title>Insert title here</title>
</head>
<body>

 <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
      <a class="navbar-brand" href=#>Horoscopo</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
        <li class="nav-item dropdown active">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Horoscope</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
            
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('aries');">Aries</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('tauro');">Tauro</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('geminis');">Geminis</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('cancer');">Cancer</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('leo');">Leo</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('virgo');">Virgo</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('libra');">Libra</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('escorpion');">Escorpion</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('sagitario');">Sagitario</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('capricornio');">Capricornio</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('acuario');">Acuario</a>
              <a class="dropdown-item" href="#" onclick="nombreHoroscopo('piscis');">Piscis</a>
              
            </div>
            <%Usuario user;
            user = (Usuario) request.getAttribute("user");%> <!--  sessionScope.session-->
          </li>
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
    
      <main role="main" class="container" style="padding-top: 70px;">

      <div class="starter-template">
        <h1>Horoscopo del dia</h1>
       <h3> <%=request.getAttribute("horoscopo") %></h3>
        <br>
       <h3> <%=request.getAttribute("descripcion") %></h3>
        
        
        <div class="result"></div>
        
      </div>

    </main>

	<script>
	$(document).ready(function() {

        $.ajax({
            url:"https://api.adderou.cl/tyaas/", 
            dataType:'json', 
            success:function(respuesta){
               // console.log(respuesta.horoscopo.capricornio);
            }});
        	
    });

    function nombreHoroscopo(nombre){
        $.ajax({
            url:"https://api.adderou.cl/tyaas/", 
            dataType:'json', 
            success:function(respuesta){
                console.log(nombre);
                switch (nombre){
                    case "aries":
                    var horoscopoNombre=respuesta.horoscopo.aries;
                    break;
                    case "tauro":
                    var horoscopoNombre=respuesta.horoscopo.tauro;
                    break;
                    case "geminis":
                    var horoscopoNombre=respuesta.horoscopo.geminis;
                    break;
                    case "cancer":
                    var horoscopoNombre=respuesta.horoscopo.cancer;
                    break;
                    case "leo":
                    var horoscopoNombre=respuesta.horoscopo.leo;
                    break;
                    case "virgo":
                    var horoscopoNombre=respuesta.horoscopo.virgo;
                    break;
                    case "libra":
                    var horoscopoNombre=respuesta.horoscopo.libra;
                    break;
                    case "escorpion":
                    var horoscopoNombre=respuesta.horoscopo.escorpion;
                    break;
                    case "sagitario":
                    var horoscopoNombre=respuesta.horoscopo.sagitario;
                    break;
                    case "capricornio":
                    var horoscopoNombre=respuesta.horoscopo.capricornio;
                    break;
                    case "acuario":
                    var horoscopoNombre=respuesta.horoscopo.acuario;
                    break;
                    case "piscis":
                    var horoscopoNombre=respuesta.horoscopo.piscis;
                    break;
                }
                
                
                //console.log(horoscopoNombre);
                mostrar(horoscopoNombre);  
            }});

    }
    function mostrar(respuesta){
        $(".result").empty();
        $('.result').append(
                '<a>Nombre: '+respuesta.nombre+'</a><br>'+
                '<a>Fecha signo: '+respuesta.fechaSigno+'</a><br>'+
                '<a>Amor: '+respuesta.amor+'</a><br>'+
                '<a>Salud: '+respuesta.salud+'</a><br>'+
                '<a>dinero: '+respuesta.dinero+'</a><br>'+
                '<a>Color: '+respuesta.color+'</a><br>'
             );
    }

	</script> 



</body>

</html>
<%} %>