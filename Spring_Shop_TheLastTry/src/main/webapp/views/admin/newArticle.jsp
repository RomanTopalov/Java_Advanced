<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

  <%@ taglib uri="http://www.springframework.org/security/tags"	prefix="sec"%>

    
<link   rel="stylesheet"  href="css/article.css">


<%-- 
	<sf:form modelAttribute="article" action="createArticle" method="post">
		<sf:input path="name" />
		<input name="dateofPublic" type="date">
		<sf:input path="data" />

		<button>create</button>
	</sf:form>
 --%>
 
 <div class="login-page">
  <div class="form">
  	<h1 class="article">Add New Post</h1>
   <sf:form modelAttribute="article" action="createArticle" method="post">
	<sf:input path="name" type="text"/>
	<input name="date" type="date">
	 
	 <p class="text_data"><sf:input path="data" /></p>

      <button>Publish</button>
    
      </sf:form>
  </div>
</div>

​ <link   rel="stylesheet"  href="js/article.js"> 

	<c:forEach var="article" items="${articles}">
${article.name}
${article.dateofPublic}
${article.data}

<sec:authorize access="hasRole('ROLE_ADMIN')">
<a href="deleteArticle/${article.id}">delete</a>
</sec:authorize>
	</c:forEach>


<%-- 
 
        <div id="main-container">
            <div id="left-container"> <!-- Left part -->
                <div id="newPost" class="container"> <!-- Add New Post -->


                    <div class="newPostContent">
                        <h1>Add New Post</h1>               
                      
  					<sf:form modelAttribute="article" action="createArticle" method="post">
  				 <sf:input path="name" type="text" placeholder="Enter title here" id="post-title"/> 
				<input name="date" type="date"  placeholder="Enter date here" id="post-title">
    
    <sf:input path="data"  placeholder="Enter text here" id="post-title" />
                    
                      

  
                        <a href="#13" class="btn ">preview</a>
                        <button><a href="#14" class="btn" type="button">publi</a></button>
                          </sf:form>
                    </div>                   
                </div>

                

              

            <div id="middle-container"> <!-- Middle Part -->
                <div id="relatedPosts" class="container"> <!-- Related Posts -->
                    <div class="bar title-bar">
                        <h2>Related Posts</h2>
                    </div>

                    <div class="rpost">
                        <p><a href="#19">Philosophy cannot be taught; it is the application of the sciences to truth</a> <br/>
                        <a href="#20">by Lord Wilmore</a></p>
                    </div>
                   

                    <div class="rpost">
                        <p><a href="#21">Now let the avenging god make way for me to punish the wrongdoer!</a> <br/>
                        <a href="#22">by Abbe Busoni</a></p>
                    </div>
                   

                    <div class="rpost">
                        <p><a href="#23">There is neither happiness nor misery in the world</a> <br/>
                        <a href="#24">by Monsieur Zaccone</a></p>
                    </div>
                   
                </div>

                
        </div> --%>

