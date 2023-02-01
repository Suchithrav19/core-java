<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>


	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="44" class="d-inline-block align-text-top">
			</a>



			<form class="d-flex">
				<button class="btn btn-outline-success" type="submit">Home</button>
			</form>
		</div>
	</nav>

	<h1>Page to send FoodItem</h1>

 <form action="foodsend" method="post">
	<div class="mb-3">
		<label for="disabledTextInput" class="form-label">Name</label> 
		<input type="text" id="disabledTextInput" class="form-control" name="name"	placeholder="enter food item name">
	</div>

	<br>

	<select class="form-select form-select-sm"  name="type" aria-label=".form-select-sm example">
		<option selected>Select food menu</option>
		<option value="1">Veg</option>
		<option value="2">Non-Veg</option>
		<option value="3">Both</option>
	</select>

	<br>

	<label for="customRange1" class="form-label">Quantity</label>
	<input type="range" name="quantity" class="form-range" id="customRange1" min="1" max="5">

	<br>

	<div class="mb-3">
		<label for="disabledTextInput" class="form-label">Price</label>
		 <input	type="text" id="disabledTextInput" class="form-control" name="price"	placeholder="enter food item price">
	</div>

	<br>

	<div class="col-12">
		<input type="submit" value="Send" class="btn btn-primary">
	</div>
	
	</form>


</body>
</html>