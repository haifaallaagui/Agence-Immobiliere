<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Ajouter Client</title>
</head>
<body style="background-image: url('image/properties/1.jpg');">
<div class="container-fluid">
<div class="row">
<div class="col-md-4">
<a href="agent.jsp">BACK</a></div>
<div class="col-md-10"><br><br>
            <h2>Ajouter Clients</h2><br><br>
        	</div>
</div>


   
 <div class="row">       
 <div class="col-md-6"><br>
 <div class="card">
<form class="form1" method="get" action="ClientS">
 <input type="hidden" name="page" value="AjoutClient">
<label>CIN:</label>
<input type="text" name="cin"pattern="[0-9]{8}" required><br>
<label>Nom:</label>
<input type="text"  name="nom"required><br>
<label>Prénom:</label>
<input type="text" name="prenom" required><br>
<label>Date de naissance:</label>
<input type="date" name="date_naissance" required><br>
<label>Adresse:</label>
<input type="text" name="adresse" required><br>
<label>num tel:</label>
<input type="tel"  name="numtel" pattern="[0-9]{8}"><br>
<label>Demande:</label>
<input type="text" name="d">
<label for="fileupload"> Select an image to upload</label>
<input type="file" name="image" required><br>
<button type="submit" class="btn" value="confirmer">confirmer</button>
				<button type="reset" class="btn" value="annuler">annuler</button>

</form>
</div>
</div>
<div class="col-md-6">
 <div class="card">
<form class="form1" method="get" action="ClientS">
<input type="text" name="cin2">
<c:forEach items="${Clients}" var="Client">
<a class="button conten__button" href="<%= request.getContextPath() %>/ClientS?page=delete&cin2=${Client.cinC}">Supprimer</a>
</c:forEach>

  </form>
</div>
</div>
</div>
<div class="row">

 <c:forEach items="${Clients}" var="Client">
	<div class="card-group">
          <div class="col-md-12">
          <div class="card">
            <img class="card-img-top1 display" src="${Client.image }" alt="Card image cap">
            <div class="card-body">
              <p >${Client.cinC } ${Client.nom } ${Client.prenom }</p>
               <p>${Client.datenaissance}</p>
              <p class="card-text">${Client.adresse } </p>
              <p>${Client.numtel }</p>
              <p>${Client.demande }</p>
  			
				
            </div>
          </div>
          </div>
      </div>
</c:forEach>
   
            </div>
</div>




</body>
</html>