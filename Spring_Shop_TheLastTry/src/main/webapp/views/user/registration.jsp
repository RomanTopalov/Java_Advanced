<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>


 <link   rel="stylesheet"  href="css/registration.css"> 

<%-- 
	Users -------
	
		<sf:form modelAttribute="user" action="registration" method="post">
			<div class="vid-container">
  				<video id="Video1" class="bgvid back" autoplay="false" muted="muted" preload="auto" loop>
   				   <source src="http://shortcodelic1.manuelmasiacsasi.netdna-cdn.com/themes/geode/wp-content/uploads/2014/04/milky-way-river-1280hd.mp4.mp4" type="video/mp4">
  				</video>
  		<div class="inner-container">
   				 <video id="Video2" class="bgvid inner" autoplay="false" muted="muted" preload="auto" loop>
    			  <source src="http://shortcodelic1.manuelmasiacsasi.netdna-cdn.com/themes/geode/wp-content/uploads/2014/04/milky-way-river-1280hd.mp4.mp4" type="video/mp4">
    			</video>
   		 <div class="box">
     		 <h1>Registration</h1>
     		 <div style="text-align: center; color: red; margin: 5px">
							<label for="Name">${usernameException}</label>
						</div>
      <sf:input path="name" type="text" placeholder=" login" />
      <div style="text-align: center; color: red; margin: 5px">
							<label for="password">${passwordException}</label>
						</div>
      <sf:input path="password" type="password" placeholder="Password"/>
      
      <div style="text-align: center; color: red; margin: 5px">
							<label for="email">${emailException}</label>
						</div>
       <sf:input path="email" type="email" placeholder="email"/>
       
       <div style="text-align: center; color: red; margin: 5px">
							<label for="phone">${phoneException}</label>
						</div>
						<sf:input path="phone" type="text"
							class="validate[required,custom[password]] feedback-input"
							id="phone" placeholder="phone" />
							
     	 <button>Registered</button>
     
    </div>
  </div>
</div>
	</sf:form>
	
<script src="js/user.js"></script> --%>


<div class="login-page">
  <div class="form">
  <h1 class="registration">Registration</h1>
  <sf:form modelAttribute="user" action="registration" method="post">
  
<div style="text-align: center; color: red; margin: 5px">
							<label for="Name">${usernameException}</label>
						</div>
      <sf:input path="name" type="text" placeholder=" login" />
      <div style="text-align: center; color: red; margin: 5px">
							<label for="password">${passwordException}</label>
						</div>
      <sf:input path="password" type="password" placeholder="Password"/>
      
      <div style="text-align: center; color: red; margin: 5px">
							<label for="email">${emailException}</label>
						</div>
       <sf:input path="email" type="email" placeholder="email"/>
       
       <div style="text-align: center; color: red; margin: 5px">
							<label for="phone">${phoneException}</label>
						</div>
						<sf:input path="phone" type="text"
							class="validate[required,custom[password]] feedback-input"
							id="phone" placeholder="phone" />
      <button>Registered</button>
      </sf:form>
  </div>
</div>
​ <link   rel="stylesheet"  href="js/registration.js">

	
