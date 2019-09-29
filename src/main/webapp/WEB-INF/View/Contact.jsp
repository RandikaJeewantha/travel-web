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
				<div class="row align-items Contact">
					<div class="left">
						<h3>WHO WE ARE?</h3><br>

						<p>dbsbvhvhifbvifbvifsihshvfhvvd <br>ndsv f vdhf vhd vhdf vf v<br>dbfvsjvbksbv vfbvfbvbfbvhfbvs<br> vfv fv fvsvsfbv</p>

						<h3>WE CAN HELP YOU WITH...</h3><br>

						<p>dbsbvhvhifbvifbvifsihshvfhvvd <br>ndsv f vdhf vhd vhdf vf v<br>dbfvsjvbksbv vfbvfbvbfbvhfbvs<br> vfv fv fvsvsfbv</p>

						<br><h3>CONTACT Us</h3><br>
										
						<p>Send us your query anytime</p> 
								
						<img src="<c:url value="/resources/img/fb.png" />" /> <a href="#">link</a>
						<br> <img src="<c:url value="/resources/img/g+.png" />" /> <a href="#">link</a>
						<br>
						
					</div>

					<div class="col-lg-6 col-md-6 right">
							
						<form:form action="msg" modelAttribute="message">
							
							<form:input type="text" placeholder="Your Name" path="name" />	
							<div class="error">
								<form:errors path="name"/>
							</div><br>
									
							<form:input type="text" placeholder="E-mail" path="email" />
							<div class="error">
								<form:errors path="email"/>
							</div><br>
									
							<form:input type="text" placeholder="Subject" path="subject" />
							<div class="error">
								<form:errors path="subject"/>
							</div><br>
									
							<form:textarea placeholder="Your Message" path="message" />
							<div class="error">
								<form:errors path="message"/>
							</div><br>
									
							<input type="submit" value="Send Message"><br><br>
						</form:form>
						
						<img src="<c:url value="/resources/img/twitter.png" />" /> <a href="#">link</a>
						<br> <img src="<c:url value="/resources/img/gmail.png" />" /> <a href="#">link</a><br><br>
					</div>
				</div>
			</div>
		</section>
	</body>	
</html>
