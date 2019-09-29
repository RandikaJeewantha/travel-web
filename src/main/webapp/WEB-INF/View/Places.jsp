<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
		<title>Web-Site-Name-Places</title>

		<!-- CSS -->
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
		<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">
		
		<style type="text/css">
			.banner-left, .banner-right{
  				background: rgba(0,0,0,0.6);
  				margin-top: 120px;
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
				<div class="row align-items">
					<div class="col-lg-6 col-md-6 banner-left">

						<br><h2 class="text-white">${searchPlace.get(0).getName()}</h2><br>
					
						<div class="places-images">
							<img src="<c:url value="/resources/img/horton.jpg" />" />
						</div><br>

						<label class="more-img"> Click <a href="#">HERE</a> to see more images...</label>
						
						<h3> Suggestions </h3><br>
						
						<div class="suggestions">
							<ul>
							<c:forEach items="${searchPlace}" var="s">
								<li><img src="<c:url value="/resources/img/success-check.png" />" /><a href="Search?Name=${s.getName()}">${s.getName()}</a></li>
							</c:forEach>
							</ul>
						</div>
					</div>

					<div class="col-lg-6 col-md-6 banner-right">
						<label>~ Speciality ~</label>
							<p>${searchPlace.get(0).getDescription()}</p>
						<label>~ Link to map ~</label>
							<p>${searchPlace.get(0).getLink()}</p>
						<label>~ By bus ~</label>
							<p>${searchPlace.get(0).getRoutes()}</p>
						<label>~ Safety precautions ~</label>
							<p>${searchPlace.get(0).getSafety()}</p>
						<label>~ Discussions ~</label>
							<p>ddddddddddddddddddddddddddddd</p>
					</div>
				</div>
			</div>
		</section>
	</body>	
</html>