<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<link rel="stylesheet" href="/css/country.css">

<script src="/js/jquery-3.1.1.min.js"></script>




<input type="hidden" name="csrf_name" value="${_csrf.parameterName}" />
<input type="hidden" name="csrf_value" value="${_csrf.token}" />


<div class="wrapper" style="text-align: center">
	<header>
		<div id="error"></div>
		<input type="text" id="nameCountry" placeholder="name of country">
		<button id="save">save</button>
	</header>
	<div class="all"></div>
</div>




<script src="/js/country.js"></script>

<%-- Country -------

<c:forEach var="country" items="${countries}">
${country.nameCountry}
<a href="deleteCountry/${country.id}">delete</a>
</c:forEach>


<sf:form modelAttribute="country" action="createCountry" method="post">
		<sf:input path="nameCountry" placeholder="name of country"/>
	<button>create</button>
	</sf:form>
 --%>


