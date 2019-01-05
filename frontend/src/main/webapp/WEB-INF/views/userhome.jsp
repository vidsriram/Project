<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<center>
		<h2>
			<img src="resources/images/logo.jpg" alt="Company Logo" height="250"
				width="400"  align="top">
		</h2>
	</center>


<div class="container-fluid">
  <div class="row"> <!-- Menubar -->
  
  
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">FURNITURE SHOPPEEE</a>
    </div>
    <ul class="nav navbar-nav">       
      <li class="active"><a href="userhome">User Home</a></li> 
    </ul>
      </div>
</nav>
   </div>
 <C:if test="${!empty Products}">
		<h2 align="center">Product List</h2>
		<div class="w3-responsive">
		<table class="w3-table-all">
		<Table align="Center" border ="2">
		<tr>
		<th> Product ID</th>
		<th>Product Name</th>
		<th>Description</th>
		<th>product image</th>
		<th>Price</th>
		</tr>
		<c:forEach items="${ProductList}" var="product">
		<tr>
		<td><c:out value="${product.productId}"/></td>
		<td><c:out value="${product.prodName}"/></td>
		<td><c:out value="${product.prodDesc}"/></td>
		<td> <img src="resources/images${product.productId}.jpg" alt="Product Image Logo" height="50"
				width="50" /> </td>
		<td><c:out value="${product.price }"/></td>
	</c:forEach>
		</Table>
		</C:if>
</body>
</html>