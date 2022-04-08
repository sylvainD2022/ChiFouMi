<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résultat</title>
</head>
<body>
	<h1><%= request.getAttribute("result") %> </h1>
	<br>
	<h2><em>Votre choix : <%= request.getAttribute("choix") %> </em></h2>
	<br>	
	<h2><em>Le choix de l'ordinateur : <%= request.getAttribute("ordiChoix") %></em></h2>
		
	<a href ="./">Rejouez</a>
</body>
</html>