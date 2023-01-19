<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Wizard V1 test</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="assets/css/animate.min.css">
<link rel="stylesheet" href="assets/css/fontawesome-all.css">
<link rel="stylesheet" href="assets/css/style.css">

<link rel="stylesheet" type="text/css"
	href="assets/css/colors/switch.css">
<!-- Color Alternatives -->
<style>
body{
    background: #f9f9f9;
}

.form-content .step-no {
	font-size: 27px;
}
@media screen and (max-width: 1440px)
.form-content {
    padding-top: 55px;
    padding-left: 80px;
    padding-right: 4%;
}
@media screen and (max-width: 1440px)
.form-content h2 {
    font-size: 42px;
}
form-content h2 {
    
    font-weight: 700;
    padding: 85px 0px 20px 0px;
}
.step-box-content {
    cursor: pointer;
    border-radius: 8px;
    border: 2px solid #e1e1e1;
    padding: 55px 20px 35px 20px;
    display: block;
    min-height: 260px;
}
.relative-position {
    position: relative;
}
</style>
</head>
<body>
<div class="container-fluid">
<span class="step-no">Step 1</span>
<div class="row">
<div class="col-sm-3">

</div>
<div class="col-sm-6">
<h2>What kind of Services You need?</h2>
						<p>Tation argumentum et usu, dicit viderer evertitur te has.
							Eu dictas concludaturque usu, facete detracto patrioque an per,
							lucilius pertinacia eu vel.</p>
</div> 
<div class="col-sm-3">

</div>

</div>
<div class="row">
<div class="col-sm-1"></div>
<div class="col-sm-3">
<label
										class="step-box-content bg-white text-center relative-position active">
										<span class="step-box-icon"> <img
											src="assets/img/d1.png" alt="">
									</span> <span class="step-box-text"> Corporate Services </span> <span
										class="service-check-option"> <span><input
												type="radio" name="service_name" value="Corporate Services"
												checked=""></span>
									</span>
									<a href="corporateServices.jsp">Next</a>
									</label>
</div>
<div class="col-sm-3">
<label
										class="step-box-content bg-white text-center relative-position">
										<span class="step-box-icon"> <img
											src="assets/img/d2.png" alt="">
									</span> <span class="step-box-text"> Freelancing Serivces </span> <span>conditional</span>
										<span class="service-check-option"> <span><input
												id="condition1" type="radio" name="service_name"
												value="Freelancing Services"></span>
									</span>
									</label>
</div>
<div class="col-sm-3">
<label
										class="step-box-content bg-white text-center relative-position">
										<span class="step-box-icon"> <img
											src="assets/img/d3.png" alt="">
									</span> <span class="step-box-text"> Development </span> <span
										class="service-check-option"> <span><input
												type="radio" name="service_name"
												value="Development Services"></span>
									</span>
									</label>
</div>
<div class="col-sm-1"></div>
</div>
</div>
	
	
</body>
</html>