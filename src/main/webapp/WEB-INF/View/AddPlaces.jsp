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
		<title>Web-Site-Name-Places-Adding</title>

		<!-- CSS -->
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
		<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">
		
		<style type="text/css">
			.banner-left, .banner-right{
  				background: rgba(0,0,0,0.6);
  				margin-top: 100px;
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

					<div class="places">
						<h1>ADD PLACES</h1><br>

						<div class="add-img">
							<form:form action="upload" modelAttribute="uploadForm" enctype="multipart/form-data">
								
								<form:input type="file" name="files" path="files"/><br/>
    							<form:input type="file" name="files" path="files"/><br/>
    							<form:input type="file" name="files" path="files"/><br/><br>
    							<h4>${message}</h4>
    							<input type="submit" value="Upload" />
							
							</form:form>
						</div><br>
						
					</div>
					
					<div class="places">
						<form:form action="add" modelAttribute="addPlace">
						
							<form:input type="text" placeholder="Place Name" path="name" />
							<div class="error">
								<form:errors path="name"/>
							</div><br>
							
							<form:textarea type="text" placeholder="Place Description And Tell Your Experience About This Place" path="description" />
							<div class="error">
								<form:errors path="description"/>
							</div><br>
							
							<form:select path="category">
								<form:option value="Select Category" label="Select Category" />
								<form:option value="Nature" label="Nature" />
								<form:option value="Ancient" label="Ancient" />
								<form:option value="Newly Build" label="Newly Build" />
							</form:select>
							<div class="error">
								<form:errors path="category"/>
							</div><br>
							
							<form:input type="text" placeholder="Map Link" path="link"/><br><br>
							
							
							
							<form:textarea type="text" placeholder="Bus Routes" path="routes" />
							<div class="error">
								<form:errors path="routes"/>
							</div><br>
							
							<form:textarea type="text" placeholder="Safety Precautions" path="safety" />
							
							<input type="submit" name="Add" id="add" value="ADD"><br>
						</form:form>
					</div>
				</div>
			</div>
		</section>
	</body>	
</html>