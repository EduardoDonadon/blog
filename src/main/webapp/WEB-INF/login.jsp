<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="../css/app.css" rel="stylesheet">
</head>
<body>
	<form action="/blog/login" method="post">
		<label class="input-group-text" for="user">User</label>
  		<input class="form-control mb-5" id="user" name="user">
  		
  		<label class="input-group-text" for="pass">Senha</label>
  		<input class="form-control mb-5" id="pass" name="pass">
  		
  		<button type="submit" class="btn btn-success btn-lg">Login</button>
	</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>