	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
		${user.name}${user.email}${user.phone}
		
		
			
			<img src="${user.pathImage}" alt="add foto" width="110px" height="110px">
		
		<sf:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">

   			<input type="file" name="image">
  	 		<button>save image</button>
		</sf:form>