<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/spring-mvc/itens" method="post">
		<div>
			<label>Title</label> <input type="text" name="title"></input>
		</div>
		<div>
			<label>Description</label> <textarea rows="5" cols="10" name="description"></textarea>
		</div>
		<div>
			<label>Price</label> <input type="text" name="price"></input>
		</div>
		<button type="submit">Save</button>
	</form>

</body>
</html>