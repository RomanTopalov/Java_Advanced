<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<link rel="stylesheet" href="css/login.css">

<%--  <div class="login">
	<h1>Login</h1>
    <sf:form action="loginprocesing" method="post">
     <div style="text-align: center; color: red; margin: 5px">
							<label for="name">${usernameException}</label>
						</div>
    	<input name="username"  type="text" name="u" placeholder="Username" required="required" />
    	  <div style="text-align: center; color: red; margin: 5px">
							<label for="password">${passwordException}</label>
						</div>
        <input  name="password" type="password" name="p" placeholder="Password" />
        
        <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
</sf:form>
</div>
  --%>


<div class="login-page">
	<div class="form">
		<sf:form action="loginprocesing" method="post" class="login-form">

			<input name="username" type="text"  />

			<input name="password" />
					 <button>Login</button>
			
				Not registered? <a href="registration">Create an account</a>
			
		</sf:form>
	</div>
</div>
​
<link rel="stylesheet" href="js/login.js">

