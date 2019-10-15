<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jelly Bean Machine</title>

<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-9NlqO4dP5KfioUGS568UFwM3lbWf3Uj3Qb7FBHuIuhLoDp3ZgAqPE1/MYLEBPZYM" crossorigin="anonymous"></head>
<body>

<h1>Jelly Bean List</h1>
	<table>
		<tr>
			<!-- <th>ID</th> -->
			<th>Style</th>
			<th>Rating</th>
			<!-- <th>Delete</th> -->
		</tr>
		<c:forEach var="jb" items="${list }" varStatus="i">
		<tr>
			<%-- <td>${i.count }</td> --%>
			<%-- <td>${jb.id }</td> --%>
			<td>${jb.style }</td>
			<td>${jb.rating }</td>
			<%-- <td><a href="delete-jellybean?idDelete=${jb.id }">Delete</a></td> --%>
		
		</tr>
		</c:forEach>
	</table>

	<h1>Jelly Bean Adder</h1>
	<form action="create-jelly">
	<input type="text" name="style" placeholder="Jelly Bean Style">
	<input type="text" name="rating" placeholder="Jelly Bean Rating">
	<input type="submit" value="Add Jelly Bean">	
	</form>




</body>
</html>


