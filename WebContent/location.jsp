<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/style1.css">
    <title>location</title>
   
</head>
<body>
   
    <!--========== HEADER ==========--> 
    <header class="l-header" id="header">
        <nav class="nav bd-container">
            <a href="acceuil" class="nav__logo"><img src="./images/logo.png" ></a>

            <div class="nav__conten" id="nav-conten">
                <ul class="nav__list">
                    <li class="nav__item"><a href="acceuil" class="nav__link active-link">Acceuil</a></li>
                    <li class="nav__item"><a href="vente" class="nav__link">achat</a></li>
                    <li class="nav__item"><a href="location" class="nav__link">location</a></li>
                    <li class="nav__item"><a href="#contact" class="nav__link">Contactez-nous</a></li>
                    <li class="nav__item"><a href="./S'authentifier.jsp" class="nav__link">s'inscrire</a></li>


                   
                </ul>
            </div>

            <div class="nav__toggle" id="nav-toggle">
                <i class='bx bx-conten'></i>
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
     
      <!--========== propostition ==========-->
      <div class="container ">
          <div class="row">
              <form >
                  <h3 class="text-centre"> Search for</h3>
                  <div class="row">
                      <input type="text" placeholder="Search of Properties">

                  </div>
                  <div class="row">
                    
                        <select name="" id="" >
                            <option value=" location"> location</option>  
                            <option value="buy">buy</option>
                        </select>
                    
                    
                    
                        <select name="" >
                            <option value=" prix"> prix</option>  
                            <option value="1">150$--200$</option>
                            <option value="2">250$--400$</option>
                            <option value="3">450$--600$</option>
                            <option value="4"> more than 700$</option>
    
                        </select>  
                  </div>
                  <div class="row justify-content-md-center ">
                      <button class="button btn ">find</button>
                  </div>
              </form>

          </div>

      </div>
    
     <!--========== contenue ==========-->
     <div class="row">
     <section class="conten section bd-container" id="conten">
        <span class="section-subtitle">Buy</span>
       <h2 class="section-title">MAKE YOUR CHOICE</h2>
       <div class="row">
       	<div class="card-group">
        <c:forEach items="${Offres}" var="offre">
	
          <div class="col-md-3">
          <div class="card">
            <img class="card-img-top1 display" src="${offre.image }" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">num:${offre.idoffres }</h5>
               <h5 class="card-title">prix:${offre.prix }</h5>
              <p class="card-text">localisation:${offre.localisation } </p>
              <p>type: ${offre.type }</p>
              <a href="./aprés.jsp" class="button conten__button">demande</a>
  				
            </div>
          </div>
          </div>
          
    

   </c:forEach>
   </div>
     </div>
    </section>
    
    </div>
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
                    <li>Bootstrap Realestate@gmail.com</li>
                </ul>
            </div>
        </div>

        <p class="footer__copy">&#169; realise par salma haifa rihem</p>
    </footer>

    
</body>
</html>