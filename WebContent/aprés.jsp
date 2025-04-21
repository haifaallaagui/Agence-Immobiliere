<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Random"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/style1.css">
    <title>Document</title>
    
</head>
<body>
   
    <!--========== HEADER ==========--> 
    <header class="l-header" id="header">
        <nav class="nav bd-container">
            <a href="./index.jsp" class="nav__logo"><img src="./images/logo.png" ></a>

            <div class="nav__menu" id="nav-menu">
                <ul class="nav__list">
                    <li class="nav__item"><a href="acceuil" class="nav__link active-link">Acceuil</a></li>
                    <li class="nav__item"><a href="vente" class="nav__link">achat</a></li>
                    <li class="nav__item"><a href="location" class="nav__link">location</a></li>
                    <li class="nav__item"><a href="./index.jsp" class="nav__link">Contactez-nous</a></li>
                    <li class="nav__item"><a href="" class="nav__link">s'inscrire</a></li>
                   
                </ul>
            </div>

            <div class="nav__toggle" id="nav-toggle">
                <i class='bx bx-menu'></i>
            </div>
        </nav>
    </header>
     <!--========== Home==========--> 
     <div class="container-fluid">
        <div id="slider">
            <figure>
                <img src="./images/bunglow-01-1240x720.jpg" alt="">
                <img src="./images/exterior-04-1240x720.jpg" alt="">
                <img src="./images/exterior-05-1240x720.jpg" alt="">
            </figure>
          
      </div>
        
    </div>
 
 
    <form class="form1" action="DemandeS" method="get" enctype="multipart/form-data">
        <label>Nom:</label><br>
        <input type="text" name="name"  required><br>
        <label>Prénom:</label><br>
        <input type="text" name="prenom" required><br>
        <label>CIN:</label><br>
        <input type="text" name="cin" pattern="[0-9]{8}" required><br>
        <label>num tel:</label><br>
        <input type="text" name="numtel" pattern="[0-9]{8}"><br>
        <label>num offres:</label><br>
        <input type="text" name="numoffres" pattern="#[0-9]{8}"><br>
        <label>Demande:</label><br>
        <input type="text" name="demande"required><br>
        <label>Date du rendez-vous:</label>
        <input type="text" name="planning"required><br>
         <label>num demande:</label>
        <input type="text" name="numD"required><br>
   
        
       <button type="submit" class="btn button" value="submit">confirmer</button>
        <button type="reset" class="btn button" value="annuler">annuler</button>
 </form>
     <!--========== FOOTER ==========-->
     <footer class="footer section bd-container">
        <div class="footer__container bd-grid">
            <div class="footer__content">
                <a href="#" class="footer__logo">Bootstrap Realestate</a>
                <span class="footer__description">agence immobilière </span>
                <div>
                    <a href="#" class="footer__social"><i class='bx bxl-facebook'></i></a>
                    <a href="#" class="footer__social"><i class='bx bxl-instagram'></i></a>
                    <a href="#" class="footer__social"><i class='bx bxl-twitter'></i></a>
                </div>
            </div>

      

            <div class="footer__content">
                <h3 class="footer__title">Information</h3>
                <ul>
                    <li><a href="#" class="footer__link">Event</a></li>
                    <li><a href="#" class="footer__link">Contact us</a></li>
                    <li><a href="#" class="footer__link">Privacy policy</a></li>
                    <li><a href="#" class="footer__link">Terms of services</a></li>
                </ul>
            </div>

            <div class="footer__content">
                <h3 class="footer__title">Adress</h3>
                <ul>
                    <li>Lima - Peru</li>
                    <li>Jr Union #999</li>
                    <li>999 - 888 - 777</li>
                    <li>Bootstrap Realestate@email.com</li>
                </ul>
            </div>
        </div>

        <p class="footer__copy">&#169; realise par salma haifa rihem</p>
    </footer>

</body>
</html>