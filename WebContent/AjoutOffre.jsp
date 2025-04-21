<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Ajouter offre</title>
</head>
<body style="background-image: url('image/properties/1.jpg');">
<div class="container-fluid">
<div class="row" >
<div class="col-md-4">
<a href="agent.jsp">BACK</a></div>
<div class="col-md-10"><br><br>
            <h2>Ajouter offres</h2><br><br>
        	</div>
</div>
<div class="row">
      <div class="col-md-6"><br>
          <div class="card">
            
            <div class="card-body">
              
 				<form class="form2" method="get" action="offr" enctype="multipart/form-data">
 				<label>idoffres:</label> <input type="text" name="nom" required class="nom">
 				<label>price:</label> <input type="text" required  name="prix" class="price">
 				<label>location:</label> <input type="text"  name="localisation" required class="localisation">
 				<label>Type:</label> <input type="text"  name="type" required class="type">
 				<input type="file" id="avatar" name="image"  accept="image/png,image/jpeg">

       			
 				<button type="submit" value="submit" name="" class="btn">confirmer</button>
 				<button type="reset" value="confirmer" class="btn">annuler</button>
 			
 				
 				
 				</form>
 				</div>
 				</div>
 				</div>
 <div class="col-md-6">
 <div class="card">
<form class="form1" method="get" action="offr">
<input type="text" name="k">
<c:forEach items="${Offres}" var="offre">
<a class="button conten__button" href="<%= request.getContextPath() %>/offr?page=edit&k=${offre.idoffres}">Supprimer</a>
</c:forEach>
</form>
</div>
</div>
</div>
</div>
 				<br><br><br>
 	<div class="row">
 	<c:forEach items="${Offres}" var="offre">
	<div class="card-group">
          <div class="col-md-12">
          <div class="card">
            <img class="card-img-top1 display" src="${offre.image }" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">${offre.idoffres }</h5>
               <h5 class="card-title">${offre.prix }</h5>
              <p class="card-text">Price:${offre.localisation } </p>
              <svg xmlns="http://www.w3.org/2000/svg" width="10" height="10" fill="currentColor" class="bi bi-geo-alt-fill" viewBox="0 0 16 16">
  				<path d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"/><p> ${offre.type }</p></svg>
            </div>
          </div>
          </div>
      </div>
   </c:forEach>

            </div>
      </div>



</body>
</html>