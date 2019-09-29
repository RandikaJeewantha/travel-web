<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<header id="header">
<br><div class="container main-menu">
		<div class="row align-items-center justify-content-between d-flex">
			<div id="logo">
				<img src="<c:url value="/resources/img/logo.png" />" />
			</div>
			
			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<li><a href="HomePage">Home</a></li>
				          
					<li><a href="#">Nature</a>
				          
						<ul>
							<div class="drop-left">
								<c:forEach items="${theNature}" var="n">
									<li><a href="">${n.getName()}</a></li>
								</c:forEach>
							</div>

							<div class="drop-right" >
								<div class="drop-img">
									<img src="<c:url value="/resources/img/Sigiriya.jpg"/>" />
								</div>
							</div>
						</ul>
					</li>

					<li><a href="#">Ancient</a>
						<ul>
							<div class="drop-left">
								<c:forEach items="${theAncient}" var="a">
									<li><a href="">${a.getName()}</a></li>
								</c:forEach>
							</div>

							<div class="drop-right">
								<div class="drop-img">
									<img src="img/Sigiriya.jpg">
								</div>
							</div>
						</ul>
					</li>

					<li><a href="#">Newly Build</a>
						<ul>
							<div class="drop-left">
								<c:forEach items="${theNewlyBuild}" var="b">
									<li><a href="">${b.getName()}</a></li>
								</c:forEach>
							</div>

							<div class="drop-right">
								<div class="drop-img">
									<img src="img/Sigiriya.jpg">
								</div>
							</div>
						</ul>
					</li>

					<li><a href="#">Discussions</a></li>

					<li><a href="ContactPage">Contact Us</a></li>
					
					<li><a href="#">Log Out</a></li>
				</ul>
			</nav><!-- #nav-menu-container -->					      		  
		</div>
	</div>
</header>