<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

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
		    <span class="navbar-brand">${user} </span>
		    <form class="form-inline my-2 my-lg-0">
		      <!-- <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>-->
		      <a class="nav-link" href="/BakeryBoss/logout">
		      	<button class="btn btn-outline-danger my-2 my-sm-0" type="button">Log out</button>
		      </a>
		    </form>
		  </div>
		</nav>
		<form class="form-signin" style="width:700px; margin:100px auto 20px auto;" action="/BakeryBoss/addUser" method="post" >
		  <div class="text-center mb-4">
		    <h1 class="h3 mb-3 font-weight-normal" style="color:red;">An error occurred: Access denied</h1><br>
		  </div>
		</form>	
		
	<script>
		<%@include file="../js/bootsrap/bootstrap.js" %>
	</script>
	</body>
</html>