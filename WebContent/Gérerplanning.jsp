<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/Style2.css">
</head>
<body style="background-image: url('img/1.jpg');"><br>
<div class="container-fluid">
<div class="row">
<div class="col-md-4">
<a href="./agent.jsp">BACK</a></div>
<div class="col-md-10"><br><br>
<h2 id="h">Traiter planning</h2></div>
</div><br><br><br><br>
<div class="row">
<div class="col-md-12">
<table class="table table-bordered border-primary">
  <thead>
    <tr>
      <th scope="col">jour</th>
      <th scope="col">lundi</th>
      <th scope="col">mardi</th>
      <th scope="col">mercredi</th>
      <th scope="col">jeudi</th>
      <th scope="col">vendredi</th>
      <th scope="col">samedi</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">temps</th>
      <td>
      <form>
  		<textarea id="story" name="story"
          rows="3" cols="25">08:00 10:00 11:00 13:00 15:00
		  
          
 		  </textarea>
 		  <button  type="submit" value="modifier">modifier</button>
      </form>
      </td>
      <td>
      <form>
      <textarea id="story" name="story"
rows="3" cols="25">08:00 10:00 11:00 13:00 15:00		  
          
 		  </textarea>
 		  <button  type="submit" value="modifier">modifier</button>
      </form>
      </td>
      <td><form>
      <textarea id="story" name="story"
rows="3" cols="25">08:00 10:00 11:00 13:00 15:00		  
          
 		  </textarea>
 		  <button  type="submit" value="modifier">modifier</button>
      </form>
      </td>
      <td><form>
      <textarea id="story" name="story"
rows="3" cols="25">08:00 10:00 11:00 13:00 15:00		  
          
 		  </textarea>
 		  <button  type="submit" value="modifier">modifier</button>
      </form>
      </td>
      <td><form>
      <textarea id="story" name="story"
rows="3" cols="25">08:00 10:00 11:00 13:00 15:00		  
          
 		  </textarea>
 		  <button  type="submit" value="modifier">modifier</button>
      </form>
      </td>
      <td>
      <form>
      <textarea id="story" name="story" rows="3" cols="25">
       
          
 		  </textarea>
 		  <button  type="submit" value="ajouter">ajouter</button>
      </form>
      </td>
    </tr>
    
  </tbody>
</table>
</div>
</div>
</div>
</body>
</html>