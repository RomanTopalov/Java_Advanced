<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>



<c:forEach var="product" items="${products}">
	<div>
		${product.name} ${product.price} <a href="deleteProduct/${product.id}">delete</a>
	</div>
	<br>
</c:forEach>

<sf:form modelAttribute="product" action="saveProduct" method="post">

	<sf:input path="name" placeholder="name" />
		<input name="count" type="number" />
		<input name="price" type="number">
		<input name="describe_product" type="describe_product">
	
	<sf:select path="country" items="${countriesDTOs}" itemLabel="name" itemValue="id">
	</sf:select>

	<sf:select path="category" items="${categoriesDTOs}" itemLabel="name" itemValue="id" >
	</sf:select>

	<button>create product</button>
</sf:form>











