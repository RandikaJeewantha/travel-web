<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Author Meta -->
		<meta name="author" content="com.randika">
		<!-- Meta Description -->
		<meta name="description" content="Travel">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- favicon -->
		<link rel="icon" type="image/png" href="<c:url value="/resources/img/favicon.ico" />"/>
		<!-- Site Title -->
		<title>Web-Site-Name-Home</title>

		<!-- CSS -->
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
		<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">
		
		<style type="text/css">
			.banner-right {
  				margin-top: 80px;
			}
		</style>
		
		<!-- javaScript -->
		<script src="<c:url value="/resources/js/jquery-2.2.4.min.js" />"></script>				
		<script src="<c:url value="/resources/js/superfish.min.js" />"></script>	
		<script src="<c:url value="/resources/js/jquery.magnific-popup.min.js" />"></script>						
		<script src="<c:url value="/resources/js/main.js" />"></script>

	</head>
	
	<body>
	
		<jsp:include page="Header.jsp" />
			
		<!-- start banner Area -->
		<section class="banner-area relative">				
				
			<div class="container">
				<div class="row fullscreen align-items-center justify-content-between">
					<div class="col-lg-6 col-md-6 banner-left">

						<!--  search area -->
						<div class="search">
							<div class="notFound">
								<h4> ${notFound} </h4>
							</div>
							<form:form action="Search" modelAttribute="searchPlace">
								<div class="error">
									<form:errors path="searchKey" />
								</div>
								<form:input type="text" path="searchKey"/>
								<input type="submit" value="Find">
							</form:form>
						</div><br>

						<h6 class="text-white">Away from monotonous life</h6>
						<h1 class="text-white">Find Your destination</h1>
						
						<p>
							If you like to help others, you can post or add places to this website but first register or login.
						</p>
							
						<a href="AddPlaces" class="primary-btn text-uppercase">To Add Places</a>
					</div>

					<div class="col-lg-6 col-md-6 banner-right">
						<div class="login-form-div">
							<div class="user-login-icon">
								<img src="<c:url value="/resources/img/user.png" />">
							</div>
							
							<div class="error">
								<h4>Welcome ${log.email}</h4> 
							</div><br><br>
								
							<form:form action="Logging" modelAttribute="log">
								<form:input type="text" placeholder="E-mail" path="email"/>
								<div class="error">
									<form:errors path="email"/>
								</div><br>
								<form:input type="password" placeholder="Password" path="password"/>
								<div class="error">
									<form:errors path="password"/>
								</div>
								<input type="submit" value="LOG IN">
								
								<div class="reg-link">
									New around here! Click <a href="">here</a> to join.
								</div><br>

								<div class="reg-fog">
									<a href="">Forgot Password!</a>
								</div>
								
							</form:form>
						</div><br>
					</div>
				</div>
			</div>
		</section>
	</body>	
</html>
