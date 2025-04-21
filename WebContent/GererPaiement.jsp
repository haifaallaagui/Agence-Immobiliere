<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gérer les paiement</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">


</head>
<body style="background-image: url('img/1.jpg');">
<div class="container">
<div class="row">
<div class="col-md-12">
<a href="./agent.jsp">BACK</a></div>
<div class="col-md-10"><br><br>
            <h2>Traiter Demande</h2><br><br>
        	</div>
</div>
<div class="row ">
  <div class="col-sm-4">
    <div class="card">
      <div class="card-body">
		<form method="get" action="paiementS">
        <label id="lab" for="nom" class="form-label">CIN</label>
         <input type="text" class="form-control" name="cinC" placeholder="cin" aria-label="cin">
         <label id="lab" for="nom" class="form-label">Nom</label>
         <input type="text" class="form-control" name="nom" placeholder="Nom Client" aria-label="Nom Client">
         <label id="lab" for="prenom" class="form-label">Prenom</label>
         <input type="text" class="form-control"  name="prenom" placeholder="Prenom Client" aria-label="Prenom Client">
        <label class="form-label">demande:</label>
         <input type="text" name="demande">
		<label id="lab" for="prix" class="form-label">Prix</label>
         <input type="text"  name="prix" class="form-control" placeholder="prix" aria-label="prix">
        <button type="submit" class="btn btn-outline-primary "value="payee">Payée</button>
        </form>
      </div>
    </div>
  </div>
  
    

   
 
</div>
<div class="row">
<div class="row">
 <c:forEach items="${paiements}" var="paiement">
	<div class="card-group">
          <div class="col-md-12">
          <div class="card">
            <p class="card-title">nump:"${paiement.idp }"</p><br>
            <div class="card-body">
              <p> Client: ${paiement.nomC } ${paiement.prenomC }<br>  ${demandes.ncinC } </p>
               <p >Demande:${paiement.demande }</p>
              <p class="card-text">prix:${paiement.prix } </p>
				<button type="reset" class="btn"  name="supprimer_offre" value="supprimer">annuler</button>
            </div>
          </div>
          </div>
      </div>

   </c:forEach>
            </div>
    </div>
</div>
</body>
</html>