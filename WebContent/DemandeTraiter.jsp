<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Traiter demande</title>
</head>
<body>
<body style="background-image: url('image/properties/1.jpg');">
<div class="container-fluid">
<div class="row" >
<div class="col-md-4">
<a href="./agent.jsp">BACK</a></div>
<div class="col-md-10"><br><br>
            <h2>Traiter Demande</h2><br><br>
        	</div>
</div>
<div class="row">
 <c:forEach items="${demande}" var="demandes">
	<div class="card-group">
          <div class="col-md-12">
          <div class="card">
            <p class="card-title">numD:"${demandes.numD }"</p><br>
            <div class="card-body">
              <p> Client: ${demandes.nomclient } ${demandes.prenomclient }<br> numcin:  ${demandes.cinclient } </p>
               <p >tel:${demandes.numtelClient }</p>
              <p class="card-text">RV:${demandes.rendezvous } </p>
              <svg xmlns="http://www.w3.org/2000/svg" width="10" height="10" fill="currentColor" class="bi bi-geo-alt-fill" viewBox="0 0 16 16">
  				<path d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"/><p>numoffres: ${demandes.numoffresclient }</p></svg>
				<button type="reset" name="b" class="btn" onclick="window.location.href=<%= request.getContextPath() %>/DemandeT?page=delete&b=${demandes.numD}"  name="supprimer_offre" value="supprimer">annuler</button>
            </div>
          </div>
          </div>
      </div>

   </c:forEach>
            </div>
    

</div>
</body>
</html>