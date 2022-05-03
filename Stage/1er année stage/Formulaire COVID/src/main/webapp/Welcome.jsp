<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>Bienvenue sur l'inscription</title>
		<link rel = 'stylesheet' type = 'text/css' href='style.css'/>
	</head>

	<body>
		<h1>Bienvenue sur l'inscription  ${login}!</h1>
			<form method="post" action = "formulaire">	
				<label for='txtName'> Prénom :</label>
					<input name='txtName' type='text' value ='${name}' /><br/>
				<label for = 'txtLastName'>Nom :</label>
					<input name= 'txtLastName' type='text' value ='${lastname}'/><br/>
					<label for='txtName'> Age :</label>
					<input name='txtName' type='text' value ='${age}' /><br/>
				
					
					<select name="vaccin" id="vaccin">
						<optgroup label="Vaccin">
							<option value="Tozinaméran">AstraZeneca</option>
							<option value="Moderna">Moderna</option>
							<option value="Sputnik V">Sputnik V</option>
							<option value="Astrazeneca">Tozinaméran</option>
							<option value="BBIBP-CorV">BBIBP-CorV</option>
						</optgroup>
						
					</select>
					<select name="ville" id="ville">
						<optgroup label="ville">
							<option value="Paris">Paris</option>
							<option value="lyon">Lyon</option>
							<option value="Bordeaux ">Bordeaux</option>
							<option value="Nice">Nice</option>
							<option value="Toulouse">Toulouse</option>
						</optgroup>
						
					</select>
					<select name="jours" id="jours">
						<optgroup label="jours">
							<option value="Lundi">Lundi</option>
							<option value="Mardi">Mardi</option>
							<option value="Mercredi ">Mercredi</option>
							<option value="Jeudi">Jeudi</option>
							<option value="Vendredi">Vendredi</option>
						</optgroup>
						
					</select>
				
					<label for = 'heure'>Heures</label>
						<input name= 'heure' type='text' value ='${heure}'/><br/>
					<label for = 'heure'>Année</label>
						<input name= 'heure' type='text' value ='${année}'/><br/>
					<br/>
					<input name ='btnConnect' type='submit' /><br/>
				</form>
			
					
	</body>
</html>