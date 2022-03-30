<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create Post</title>
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="../css/app.css" rel="stylesheet">
</head>
<body>
	<form action="/blog/post" method="post">
		<label class="input-group-text" for="user">Titulo</label>
  		<input class="form-control mb-5" id="user" name="titulo">
  		
  		<label class="input-group-text" for="user">Autor</label>
  		<input class="form-control mb-5" id="user" name="autor">
  		
		<label class="input-group-text" for="user">Texto</label>
  		<input class="form-control mb-5" id="user" name="texto">
  		<button type="submit" class="btn btn-success btn-lg">Criar</button>
	</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>