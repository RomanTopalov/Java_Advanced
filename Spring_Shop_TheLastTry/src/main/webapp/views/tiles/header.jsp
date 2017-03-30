<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/security/tags"	prefix="sec"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    <meta charset="UTF-8">
    <link   rel="stylesheet"  href="css/main.css">
	
 <header class="clearfix">

<sec:authentication property="name" />

    <div class="container">
			<div class="header-left">
				<h1 class="logo">Your LOGO</h1>
			</div>
			<div class="header-right">
				<label for="open">
					<span class="hidden-desktop"></span>
				</label>
				<input type="checkbox" name="" id="open">
				
				<nav>
				<div class="letter">
					<a href="home">Home</a>
					<a href="#">Inspiration</a>
					<a href="newArticle">Articles</a>
					<sec:authorize access="!isAuthenticated()">
					<a href="loginpage">login</a>
					<a href="registration">registration</a>
						</sec:authorize>
					
						<sec:authorize access="isAuthenticated()"><a>
							<sf:form action="logout" method="post">
									<button>logout</button>
							</sf:form>
							</a>
						</sec:authorize>
                      	
                 <sec:authorize access="isAuthenticated()">
								<a href="profile">profile</a>
				</sec:authorize>
				
				<sec:authorize access="hasRole('ROLE_ADMIN')">

	<a href="admin">admin page</a>

</sec:authorize>
</div>
				</nav>
			</div>
		</div>
	</header>
<section class="clearfix">
		<div class="container">
			<div class="section-left">
				<h1 class="section-title">Lorem ipsum dolor sit amet.</h1>
				<h5 class="section-tagline">sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</h5>
			</div>
			<div class="section-right">
				<button class="learn-more">Learn more</button>
			</div>
		</div>
	</section>
	

	
	
