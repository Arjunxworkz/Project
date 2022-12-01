<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>



<head>
<title>online-booking</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js">
</script>
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.header {
	overflow: hidden;
	background-color: #1b1b1b;
	padding: 20px 10px;
}

.header a {
	float: left;
	color: white;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
}

.header a:hover {
	background-color: #ddd;
	color: black;
}

.header a.active {
	background-color: dodgerblue;
	color: white;
}

.header-right {
	float: right;
}

@media screen and (max-width: 500px) {
	.header a {
		float: none;
		display: block;
		text-align: left;
	}
	.header-right {
		float: none;
	}
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: #1b1b1b;
	color: white;
	text-align: center;
}
</style>
<style>
body {
  background-image: url('image/sn.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>

	<div class="header">
	<img src="image/lg.png"  style="height: 57px;">
		<div class="header-right">
			<a class="active" href="signUp.jsp">SignUp</a>
			
			
			<a href="logIn.jsp">SignIn</a>
		</div>
	</div>
     <h3>${UserData}</h3>
     <span style="color: antiquewhite;"> ${msg}</span>
	<div style="padding-left: 20px">
		<h1>Project Description</h1>
		
		
		<p>content..</p>
	</div>
	<div class="footer">
		<p>@arjunbari </p>
	</div>
</body>
</html>