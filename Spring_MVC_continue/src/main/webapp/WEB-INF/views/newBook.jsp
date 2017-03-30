<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/>
Book
${books}
<form action="saveBook" method="post">
<input name="bookName" placeholder="book name">
<input name="bookPage" placeholder="book page">

<button>save book</button>
</form>

</body>
</html>