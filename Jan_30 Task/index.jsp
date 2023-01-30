<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>com.xworkz</title>
</head>
<body>

<h2>Favourite Person</h2>
<form action="person" method="post">

First name: <input type="text" name="fname">
Last name: <input type="text" name="lname">
Gender: <input type="radio" name="gen" value="male">male
        <input type="radio" name="gen" value="female">female
        <input type="radio" name="gen" value=other>other

Reason: <input type="textarea" name="reason">
Address: <input type="textarea" name="address">

<input type="submit" value="Send">

</form>

</body>
</html>