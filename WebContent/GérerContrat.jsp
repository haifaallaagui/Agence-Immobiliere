<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Gérer les contrat</title>
</head>
<body style="background-image: url('image/properties/1.jpg');">
<div class="container-fluid" > 
<div class="row">
<div class="col-md-4">
<a href="agent.jsp">BACK</a></div>
<div class="col-md-10"><br><br>
            <h2>Gérer les contrats</h2><br><br>
    </div>
</div>
 <div class="row">
          <div class="col-md-3"><br>
          <div class="card">
          <form method="get" action="ContratS">
          <input type="hidden" name="page" value="Ajoutcontrat">
          <label>idcontrat:</label>
          <input type="text" name="id">
          <input type="file" name="contrat">
          <button type="submit" class="btn">ajouter</button>
          </form>
          </div>
          </div>
          </div>
<div class="row">
<c:forEach items="${Contrats}" var="contratt">
<div class="card-group">

          <div class="col-md-4"><br>
          <div class="card">
          <img class="card-img-top2 display" src="${contratt.contrat }" alt="Card image cap">
         </div>
          </div>
          
</div>
          </c:forEach>
         </div>
         </div>
    


</body>
</html>