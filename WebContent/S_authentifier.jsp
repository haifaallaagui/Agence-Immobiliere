<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">

<title>S'authentifier Agent</title>
</head>
<body style="background-image: url('image/properties/1.jpg');">
<div class="container-fluid"> 
<div class="row">
        <div class="col-md-12">
            <h2>S'authentifier</h2><br><br>
            <form class="form0" method="get" action="login_serv" enctype="multipart/form-data">
            <input type="hidden" name="page" value="admin-login-form">
                <label for="user">LOGIN:</label>
                <input type="text" id="user" required name="username" placeholder="Your Username"><br>
                <br>
                <label>MOT DE PASSE:&nbsp; </label>
                <input type="password"  name="password" placeholder="Enter password"><br><br>
                <button type="submit" class="btn">connexion</button>


            </form>
        </div>
    </div>
</div>

</body>
</html>