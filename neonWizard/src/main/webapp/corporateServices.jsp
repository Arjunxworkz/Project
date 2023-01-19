<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>



<head>
<title>NeonWizard-form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	background: bisque;
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

/* Full-width input fields */
input[type=text], input[type=email], input[type=number] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

/* Set a style for all buttons */
button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 25px;
	top: 0;
	color: #000;
	font-size: 35px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: red;
	cursor: pointer;
}

/* Add Zoom Animation */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
.services-select-option li {
    width: 100%;
    min-height: 65px;
    color: #959595;
    font-size: 17px;
    position: relative;
    padding-left: 80px;
    border-radius: 4px;
    margin-bottom: 20px;
    cursor: pointer;
    border: 2px solid #ededed;
}
budget-area .opti-list li {
    position: relative;
    display: inline-block;
    margin-right: 25px;
    font-size: 19px;
    color: #5f5f63;
    padding: 20px 20px 20px 60px;
    width: 33%;
    font-weight: 600;
    cursor: pointer;
   
}
.bg-white {
    background-color: #fff!important;
}
</style>
<style>
body {
	background-image: url('image/sn.png');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
.budget-area select {
    width: 100%;
    height: 60px;
    border: 2px solid #ededed;
    padding: 0px 30px;
}
.services-select-option li label {
    display: block;
    margin-bottom: 0;
    padding: 18px 0;
}
    
</style>
</head>
<body>

	<div class="container-fluid">
	<form action="use" method="post">
		<div class="row">
			<div class="col-sm-6" style="padding-left: 20px">
			<span class="step-no bottom-line">Step 2</span><br>
				
					<span>Name:</span> <input type="text"
						name="name" required /><br> <br> <span
						>Email:</span><input type="email"
						placeholder="Enter Email" name="email" required /><br> <br>
					<span >Number:</span><input
						type="number" placeholder="Enter Your Number" name="number"
						required /><br>
					<p>Gender</p>
					  <input type="radio" id="html" name="gender" value="male">
					  <label for="html">Male</label><br>   
					  <input type="radio"
						id="css" name="gender" value="female">   <label
						for="css">Female</label> 
						<br>
						<br>
						<p>Upload Document</p> 
						  <input type="file" id="myFile" name="filename"><br>
						<br>

			
			</div>
			<div class="col-sm-6">
			<div class="step-inner-content">
									<span class="step-no bottom-line">Step 3</span>
									<!--<div class="step-progress float-right">
										<span>3 of 5 completed</span>
										<div class="step-progress-bar">
											<div class="progress">
												<div class="progress-bar" style="width:40%"></div>
											</div>
										</div>
									</div>//-->
									
									<div class="services-select-option">
										<ul>
											<li class="bg-white"><label>Web Design <input type="radio" id="condition2" name="web_service" value="Web Design" checked=""></label></li>
											<li class="bg-white"><label>Web Development <input type="radio" name="web_service" value="Web Development"></label></li>
											<li class="bg-white"><label>Graphics Design <input type="radio" name="web_service" value="Graphics Design"></label></li>
											<li class="bg-white active"><label>SEO <input type="radio" name="web_service" value="SEO"></label></li>

										</ul>
									</div>
									<div class="conditional" data-condition="#condition2 &amp;&amp; web_service == 'Web Design'" style="display: none;">
										<div class="form-inner-area">
										<label> <h3>Details</h3></label>
											<input type="text" name="web_service_detail">
										</div>
									</div>
									<div class="language-select">
										<p>I want to browse projects in the following languages: </p>
										<select name="languages" class="valid" aria-invalid="false">
											<option>English</option>
											<option>Arabic</option>
											<option>Spanish</option>
											<option>French</option>
										</select>
									</div>
									<div class="comment-box">
										<p><i class="fas fa-comments"></i> Write Somthing note</p>
										<textarea name="full_comments" placeholder="Write here"></textarea>
									</div>
								</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-6">
			<div class="step-content-area">
			<span class="step-no bottom-line">Step 4</span>
										<div class="budget-area">
											<p><i class="fas fa-dollar-sign"></i> Budget</p>
											<select name="budget">
												<option>$390 - $600</option>
												<option>$390 - $600</option>
												<option>$390 - $600</option>
												<option>$390 - $600</option>
												<option>$390 - $600</option>
											</select>
										</div>
										<div class="budget-area">
											<p><i class="fas fa-comments"></i> Required Support</p>
											<select name="support_period">
												<option>2 to 6 month</option>
												<option>2 to 6 month</option>
												<option>2 to 6 month</option>
												<option>2 to 6 month</option>
												<option>2 to 6 month</option>
											</select>
										</div>
										<div class="budget-area">
											<p>Optimization and Accessibility</p>
											<div class="opti-list">
												<ul>
													<li class="bg-white active"><input type="checkbox" name="code_opti1" value="Semantic coding" checked="">Semantic coding</li>
													<li class="bg-white active"><input type="checkbox" name="code_opti2" value="Mobile APP">Mobile APP</li>
													<li class="bg-white"><input type="checkbox" name="code_opti3" value="Mobile Design">Mobile Design</li>
												</ul>
											</div>
										</div>
										<div class="comment-box">
											<p><i class="fas fa-comments"></i> Write Somthing note</p>
											<textarea name="comments-note" placeholder="Your Content Here"></textarea>
										</div>
									</div>
			</div>
			</div>
			<div  class="col-sm-6">
			 <input type="checkbox"
						id="check" name="checkbox" onclick="enable()"> <span
						style="color: antiquewhite;"> Aggrement</span><br> <input
						type="submit" class="signupbtn" value="Submit"
						disabled="disabled" id="btn" />
			</div>
				</form>
	</div>

	<script>
		function enable() {
			var check = document.getElementById("check");
			var btn = document.getElementById("btn");
			if (check.checked) {
				btn.removeAttribute("disabled");
			} else {
				btn.disabled = "disabled";
			}

		}
	</script>
</body>
</html>