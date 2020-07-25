<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<style type="text/css">
			<%@include file="../css/bootstrap/bootstrap.min.css" %>
		    <%@include file="../css/main.css" %> 
		</style>
		
		<title>Eshlon Shop Manager</title>
	</head>
	<body>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		  <a class="navbar-brand" href="/SecureApp">Secure App</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
		    <ul class="navbar-nav mr-auto">
		      
		    </ul>
		    <form class="form-inline my-2 my-lg-0">
		      <!-- <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		      
		      <a class="nav-link" href="/SecureApp/logout">
		      	<button class="btn btn-outline-danger my-2 my-sm-0" type="button">Log out</button>
		      </a>-->
		      <a class="nav-link" href="/SecureApp/register">
			      <button class="btn btn-outline-success my-2 my-sm-0" type="button">Sign up</button>
			  </a>
		    </form>
		  </div>
		</nav>
		<form class="form-signin" style="width:300px; margin:100px auto;" action="/SecureApp/login" method="post" >
		  <b style="color:red;">${SPRING_SECURITY_LAST_EXCEPTION.message}</b> 
		  <div class="text-center mb-4">
		    <h1 class="h3 mb-3 font-weight-normal">Log In</h1>
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!--<label for="inputEmail">Email address</label>-->
		    <input type="email" name="email" id="email" class="form-control" placeholder="Email Address" required autofocus>  
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!-- <label for="password">Password</label> -->
		    <input type="password" name="password" id="password"   class="form-control" placeholder="Password" required autofocus> 
		  </div>
		  
		  <button class="btn btn-lg btn-primary btn-block inputMargins" type="submit">Submit</button>
		  <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2019</p>
	</form>
	<script>
		<%@include file="../js/bootsrap/bootstrap.js" %>
	</script>
	</body>
</html>