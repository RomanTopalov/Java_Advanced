<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

-----------------HOMEs
	
<%-- ${user.name}${user.surName}${user.describes}
		
		<c:forEach var="product" items="${user.product}">
		${product.type} ${product.name}
		<br>
		
		
		</c:forEach> 
			
			<img src="${user.pathImage}" alt="add foto" width="500px" height="500px">
		
		<sf:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">

   			<input type="file" name="image">
  	 		<button>save image</button>
		</sf:form>
 --%>

<c:forEach var="product" items="${products}">
    ${product.name} ${product.price}
<a href="buyProduct/${product.id}">buy</a>
<br>
</c:forEach>
 
<c:forEach var="product" items="${user.product}">
		${product.type} ${product.name}${product.price} 
		<br>
		</c:forEach> 
<br>
<br>
<br>



