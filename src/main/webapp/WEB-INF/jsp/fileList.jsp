<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>File List</h2>

	<table width="50%" border="1">
		<tr>
			<th>Ref Name</th>
			<th>Original Name</th>
			<th>File Size</th> 
		</tr>
	
	<c:if test="${not empty fileDetailList}">
	<tr>
			<c:forEach var="listValue" items="${fileDetailList}">
				<td>${listValue.name}</td>
				<td>${listValue.fileName}</td>
				<td>${listValue.fileSize}</td>
			</c:forEach>
	</tr>
	</c:if>
	</table>
	<br/>
	<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>
</html>