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
<title>Registration</title>
</head>
<body>
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
      <li> <a href="categoryPage">ADD CATEGORY</a></li>
      <li class="active"><a href="Register">Registration</a></li>
    </ul>
  </div>
</nav>
   </div>
<form action="saveRegister" method="POST">
		 		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

<div class="container">
            <div class="container text-center">

  <div class="col-md-6 "><h2><center><p align="right">REGISTRATION   FORM</p></center></h2></div>  
  <div class="col-md-4 inputgroupContainer">
  <div class="input-group">
    </div>
  </div>
  </div>
</div>
<br>
<br>
<div class="form-group">
            <div class="container text-center">

  <label class="col-md-4 control-label"><p align="right">Username</p></label>  
  <div class="col-md-4 inputgroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="name" placeholder="Username" class="form-control"  type="text">
    </div>
  </div>
</div>
</div>



<div class="form-group">
            <div class="container text-center">

  <label class="col-md-4 control-label" ><p align="right">Password</p></label> 
    <div class="col-md-4 inputgroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="password" placeholder="Password" class="form-control"  type="password">
    </div>
  </div>
</div>
</div>



<div class="form-group">
            <div class="container text-center">

  <label class="col-md-4 control-label" ><p align="right">Confirm Password</p></label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="confirmpassword" placeholder="Confirm Password" class="form-control"  type="password">
    </div>
  </div>
</div>
</div>


       <div class="form-group">
                   <div class="container text-center">
       
  <label class="col-md-4 control-label"><p align="right">E-Mail</p></label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="E-Mail Address" class="form-control"  type="text">
    </div>
  </div>
</div>
</div>



       
<div class="form-group">
            <div class="container text-center">

  <label class="col-md-4 control-label"><p align="right">Contact </p></label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="contact" placeholder="(639)" class="form-control" type="text">
    </div>
  </div>
</div>
</div>
<div class="form-group">
            <div class="container text-center">

  <label class="col-md-4 control-label"><p align="right">Address</p></label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-address"></i></span>
  <input name="address" placeholder="" class="form-control" type="text">
    </div>
  </div>
</div>
</div>


<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="submit" class="btn btn-warning"  name="butSubmit" value="Register">

  </div>
</div>

</fieldset>
</form>

</div>
    </div>
        </div>
        </section>
    				</body>
    				</html>