<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start page.</title>
</head>
<body style="background: silver; color: maroon; text-align: center;">
	<c:url var="annot" value="/aninfo" />
	<c:url var="xml" value="xmlinfo" />
	<hr />
	<h3>Start page.</h3>
	<hr>
	<a href="${annot }">annot</a>&nbsp;&nbsp;
	<a href="${xml }">xml</a>
</body>
</html>