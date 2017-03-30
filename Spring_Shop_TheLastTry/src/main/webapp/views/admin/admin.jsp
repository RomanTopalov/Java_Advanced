<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    
<link   rel="stylesheet"  href="css/admin/admin.css">



<section>
 <a href="newArticle"> <button class='lined thick'>Add Article</button></a>
 <a href="newCountry"><button class='dotted thick'>Add Country</button></a>
 <a href="newCategory"> <button class='dashed thick'>Add Category</button></a>
</section>
<section>
 <a href="newCity"> <button class='lined thin'>Add City</button></a>
 <a href="newProduct"> <button class='dotted thin'>Add Product</button></a>
  <a href="#"> <button class='dashed thin'>Add some</button></a>
</section>


<%--    <div class="Top">
   <center><ul class="menu">
      <li><a href="newArticle"><button type="button" class="btn btn-default btn-lg">add article</button></a></li>
		<li><a href="newCountry"><button>add country</button></a></li>
	
		<li><a href="newCategory">create category </a></li>
		<li><a href="newCity">add city</a></li>
		<li><a href="newProduct">add product</a></li>
   </ul></center>
</div> 
 --%>