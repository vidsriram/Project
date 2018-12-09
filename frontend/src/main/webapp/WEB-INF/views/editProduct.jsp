<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page import="com.niit.backend.model.Supplier"%>
<%@ page import="com.niit.backend.model.Category"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Add products</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<!-- Menubar -->


			<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">FURNITURE SHOPPEEE</a>
				</div>
				<ul class="nav navbar-nav">
					<li><a href="home">Home</a></li>
					<li class="active"><a href="addproductpage">ADD PRODUCT</a></li>
					<li><a href="addSupplierpage">ADD SUPPLIER</a></li>
					<li><a href="categoryPage">ADD CATEGORY</a></li>
				</ul>
			</div>
			</nav>
		</div>


		<form:form method="POST" action="saveProduct" modelAttribute="product"
			enctype="multipart/form-data">
			<table align="center">
				<tr>
					<td colspan="2"><center><b>Update Product Details</b></center></td>
				</tr>
				<tr>
					<td>Product Name</td>
					<td><form:input path="prodName"  value="${product.prodName}"/></td>
				</tr>	
				<tr>
					<td>Price</td>
					<td><form:input path="price"  value="${product.price}"/></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><form:input path="quantity" value="${product.quantity}"/></td>
				</tr>

				<tr>
					<td>Product Desc</td>
					<td><form:textarea path="prodDesc" /></td>
				</tr>


				<tr>
					<td>Supplier :</td>
					<td><form:select path="supplier.SupplierId" value="${product.supplier.getSupplierName()}">
							<c:forEach items="${SupplierList}" var="supplier">

								<form:option value="${supplier.getSupplierId()}"
									label="${supplier.getSupplierName()}">
								</form:option>

							</c:forEach>
						</form:select></td>
				</tr>
				<tr>
					<td>Product Category:</td>
					<td><form:select path="category.categoryId" value="${product.category.categoryName}">
							<c:forEach items="${CatagorList}" var="category">
								<form:option value="${category.getCategoryId()}"
									label="${category.categoryName}">

								</form:option>
							</c:forEach>
						</form:select></td>
				</tr>

				<tr>
					<td>Product Image</td>
					<td><form:input type="file" path="pimage" /></td>
				</tr>



				<tr>
					<td></td>
					<td colspan="2"><input type="submt"></td>
				</tr>
			</table>
		</form:form>
		<C:if test="${!empty Products}">
		<h2 align="center">Product List</h2>
		<div class="w3-responsive">
		<table class="w3-table-all">
		<Table align="Center" border ="1">
		<tr>
		<th> Product ID</th>
		<th>Product Name</th>
		<th>Description</th>
		<th>Price</th>
		<th>quantity</th>
		<th>Category</th>
		<th>Supplier</th>
		
		</tr>
		<c:forEach items="${ProductList}" var="product">
		<tr>
		<td><c:out value="${product.productId}"/></td>
		<td><c:out value="${product.prodName}"/></td>
		<td><c:out value="${product.prodDesc}"/></td>
		<td><c:out value="${product.price }"/></td>
		<td><c:out value="${product.quantity}"/></td>
		<td><c:out value="${product.category.categoryName}"/></td>
		<td><c:out value="${product.supplier.getSupplierName()}"></c:out>
		<a href="<c:url value="deleteProduct/?productId= ${product.productId}"/>">Delete</a></td>
		</c:forEach>
		</Table>
		</C:if>
</body>
</html>