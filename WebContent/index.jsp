<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/style1.css">
    <title>Agence immobilière</title>
   
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
s
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
                        <img src="./images/exterior-05-1240x720.jpg" alt="">
                        <img src="./images/10-1740x960-c-center.jpg" alt="">
                    </figure>
                  
              </div>
                
            </div>
                   
   
          
       
        

  <!--========== vende ==========-->
    <section class="conten section bd-container" id="conten">
        <span class="section-subtitle">achat</span>
       <h2 class="section-title">les meilleurs propositions</h2>
       <div class="conten__container bd-grid">
        <div class="conten__content">
            <img src="./images/1.jpg" alt="" class="conten__img">
        <h3 class="conten__name">Royal Inn</h3>
        <span class="conten__detail">3 chbr ,1 sal ,</span>
        <span class="conten__preci">$223.00</span>
        <a href="vente" class="button conten__button">buy</a>
    </div>

    <div class="conten__content">
        <img src="./images/2.jpg" alt="" class="conten__img">
        <h3 class="conten__name">Royal Inn</h3>
        <span class="conten__detail">descripiton</span>
        <span class="conten__preci">$120.00</span>
        <a href="location" class="button conten__button">buy</a>
    </div>
    
    <div class="conten__content">
        <img src="./images/3.jpg" alt="" class="conten__img">
        <h3 class="conten__name">Royal Inn</h3>
        <span class="conten__detail">descripiton </span>
        <span class="conten__preci">$900.50</span>
        <a href="vente" class="button conten__button">buy</a>
    </div>
        </div>
       </div>
   </section>

  <!--========== location ==========-->
  <section class="conten section bd-container" id="conten">
    <span class="section-subtitle">location</span>
   <h2 class="section-title">les meilleurs propositions</h2>
   <div class="conten__container bd-grid">
    <div class="conten__content">
        <img src="./images/1.jpg" alt="" class="conten__img">
        <h3 class="conten__name">Royal Inn</h3>
        <span class="conten__detail">3 chbr ,1 sal ,</span>
        <span class="conten__preci">$223.00</span>
        <a href="location" class="button conten__button">loc</a>
    </div>

    <div class="conten__content">
        <img src="./images/2.jpg" alt="" class="conten__img">
        <h3 class="conten__name">Royal Inn</h3>
        <span class="conten__detail">descripiton</span>
        <span class="conten__preci">$120.00</span>
        <a href="location" class="button conten__button">loc</a>
    </div>
    
    <div class="conten__content">
        <img src="./images/3.jpg" alt="" class="conten__img">
        <h3 class="conten__name">Royal Inn</h3>
        <span class="conten__detail">descripiton </span>
        <span class="conten__preci">$900.50</span>
        <a href="location" class="button conten__button">loc</a>
    </div>
    </div>
</section>
 <!--========== demande ==========-->

 <!--========== CONTACT US ==========-->
    <div class="contact section bd-container" id="contact">
        <div class="half-contact">
            <div class="container-fluid ">
                <div class="row ">
                    <div class="col-md-12 col-md-offset-0 text-center contact__data">
                        <span class="section-subtitle contact__initial">parlons</span>
                        <h2 class="section-title contact__initial">Contactez nous</h2>
                        <h3>Demandez à un agent, nous sommes là pour vous aider 24/7</h3>
                    </div>
                </div>
                <div class="row justify-content-md-center ">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Name">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Email">
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <textarea name="" class="form-control" id="" cols="30" rows="7" placeholder="Message"></textarea>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="submit" value="Send Message" class="btn btn-success ">
                                </div>
                            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
        </div>
       
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
                    <li><a href="#" class="footer__link">Contactez nous</a></li>
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
                    <li>tastyfood@email.com</li>
                </ul>
            </div>
        </div>

        <p class="footer__copy">&#169; 2020 Bedimcode. All right reserved</p>
    </footer>

    
</body>
</html>