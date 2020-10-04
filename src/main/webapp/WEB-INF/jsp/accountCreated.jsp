<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style> 
input[type=text] {
  width: 100%;
  padding: 10px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 4px;
}
</style>
</head>
<body>

	<h2 align="center">Welcome to Shivani's Portal.</h2>

   <form:form method="post" action="save">
		<table>
			<tr>
				<td>User Id</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
 --%>













<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

	.error{
	color:red;
	font-size:15px;
	}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
</head>
<body>

	<h2 align="center">Welcome to DXC Technology</h2>
	<p>DXC Technology is the world's leading independent, end-to-end IT
		services and solutions company, helping customers harness the power of
		innovation to thrive.</p>

	<div class="container">
		<form:form modelAttribute = "aNewUSer" action="save">
			<div class="row">
				<div class="col-25">
					<label for="userid">User Id</label>
				</div>
				<div class="col-75">
					<form:input path="user_id" id="userid" name="user_id"
						placeholder="Your id..." />
						<form:errors path="user_id" cssClass="error"/>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="username">User Name</label>
				</div>
				<div class="col-75">
					<form:input path="username" id="username" name="username"
						placeholder="Your name.." />
						<form:errors path="username" cssClass="error"/>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="password">Password</label>
				</div>
				<div class="col-75">
					<form:input path="password" id="password" name="password"
						placeholder="Your password.." />
						<form:errors path="password" cssClass="error"/>
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Login">
			</div>
		</form:form>
	</div>

</body>
</html>
