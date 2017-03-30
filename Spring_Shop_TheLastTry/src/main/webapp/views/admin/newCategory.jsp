<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

--------CATEGORY


	<c:forEach var="category" items="${categories}">
		${category.name} 
		<a href="deleteCategory/${category.id}">delete category</a>

		<c:forEach var="product" items="${category.products}">
			${product.name}
			<a href="deleteProductFromCategory/${product.id}">delete </a>

		</c:forEach>
		<br>
	</c:forEach>



  <sf:form modelAttribute="category" action="saveCategory" method="post" >
    <p><sf:input path="name"  type="text" placeholder="name"/></p>
   
    <p><input type="submit" value="save category"></p>
  </sf:form>



