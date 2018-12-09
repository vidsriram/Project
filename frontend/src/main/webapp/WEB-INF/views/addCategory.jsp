<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Add category</title>
</head>
<body>
<h2>Category Details</h2>
<div class="container-fluid">
  <div class="row"> <!-- Menubar -->
  
  
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">FURNITURE SHOPPEEE</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="home">Home</a></li>
      <li><a href="addproductpage">ADD PRODUCT</a></li>
      <li><a href="addSupplierpage">ADD SUPPLIER</a></li>
      <li class="active"> <a href="categoryPage">ADD CATEGORY</a></li>
    </ul>
  </div>
</nav>
   </div>
  
<form:form method="POST" action="saveCategory">
<table>
				<tr>
				<td colspan="2"><center>Category Details</center></td>
			</tr>
			<tr>
				<td>Category Name</td>
				<td><form:input path="categoryName" /></td>
			</tr>
			<tr>
				<td>Category Description</td>
				<td><form:input path="categoryDesc" /></td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" /></td>
			</tr>
</table>
</form:form>
</body>
</html>	