<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>CHI FOU MI</title>
</head>
<body>
	<h1>Pierre feuille Ciseaux</h1>
	<br>
		<div class="container">
			<form action="./traitementChiFouMi" method="post">
				<button name="choix" value="pierre">Pierre</button>
				<button name="choix" value="feuille">Feuille</button>
				<button name="choix" value="ciseaux">Ciseaux</button>
			</form>
		</div>
</body>
</html>