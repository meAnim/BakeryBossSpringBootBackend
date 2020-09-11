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
		
		<title>BakeryBoss</title>
	</head>
	<body>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		  <span class="navbar-brand">BakeryBoss</span>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="/BakeryBoss/feedback.user">Feedback</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/BakeryBoss/fetchOneRecordFeedback.user">Single</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/BakeryBoss/fetchMultipleRecordsFeedback.admin">Multiple</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/BakeryBoss/feedbackDataAPIGetAll">API</a>
		      </li>
		    </ul>
		    
		    
		    <form class="form-inline my-2 my-lg-0">
		      <!-- <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>-->
		      <a class="nav-link" href="/SecureApp/logout">
		      	<button class="btn btn-outline-danger my-2 my-sm-0" type="button">Log out</button>
		      </a>
		    </form>
		  </div>
		</nav>
		<form class="form-signin" style="width:300px; margin:100px auto;" action="/BakeryBoss/addFeedback.user" method="post" >
		  <!-- <b style="color:red;">${errorMessage}</b> -->
		  <div class="text-center mb-4">
		    <h1 class="h3 mb-3 font-weight-normal">Dashboard</h1>
		  </div>
		
		  <div class="form-label-group">
		  	<!-- <label for="inputName">Name</label> -->
		    <input type="text" name="name" id="inputName"   class="form-control" placeholder="Name" required autofocus> 
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!--<label for="inputEmail">Email address</label>-->
		    <input type="email" name="email" id="inputEmail"   class="form-control" placeholder="Email address" required autofocus>  
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!-- <label for="inputMessage">Message</label>-->
		    <input type="text" name="message" id="inputMessage"   class="form-control" placeholder="Message" required autofocus>
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!--<label for="inputNumber">Regarding</label>-->
		    <input type="number" name="regarding" id="inputRegarding"  class="form-control" placeholder="Regarding" required>
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!--<label for="inputCode">Code</label>-->
		    <input type="text" name="code" id="inputCode"   class="form-control" placeholder="Code" required autofocus>
		  </div>
		  
		  <div class="form-label-group inputMargins">
		  	<!--<label for="inputRating">Rating</label>-->
		    <input type="number" name="rating" id="inputRating"  class="form-control" placeholder="Rating" required>
		    
		  </div>
		  
		  <button class="btn btn-lg btn-primary btn-block inputMargins" type="submit">Submit</button>
		  <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2019</p>
	</form>
	<script>
		<%@include file="../js/bootsrap/bootstrap.js" %>
	</script>
	</body>
</html>