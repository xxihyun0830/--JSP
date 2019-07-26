<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-idth, initial-scale=1">
   

    <title>DECADANCE</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	 <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>
</head>

<body>

		
	<jsp:include page="include/header.jsp"/>
 
 
    <div class="container">
    
        <div class="row">
            <div class="box">
                <div class="col-lg-12 text-center">
                    <div id="carousel-example-generic" class="carousel slide">
                       
                        <ol class="carousel-indicators hidden-xs">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            
                        </ol>

                     
                        <div class="carousel-inner">
                            <div class="item active">
                                <img height=100px class="img-responsive img-full" src="img/slide-03.gif">
                            </div>
                            <div class="item">
                                <img height=100px class="img-responsive img-full" src="img/slide-02.jpg">
                            </div>
                            <div class="item">
                                <img height=100px class="img-responsive img-full" src="img/slide-01.jpg">
                            </div>
                           
                        </div>

                       
                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                            <span class="icon-prev"></span>
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                            <span class="icon-next"></span>
                        </a>
                    </div>
                    <h2 class="brand-before">
                        <small>RESSENTIMENT</small>
                    </h2>
                    <h1 class="brand-name">DEDICATED TO XXX</h1>
                    <hr class="tagline-divider">
                    <h2>
                        <small>By
                            <strong>Decadance</strong>
                        </small>
                    </h2>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">DECADANCE
                        <strong>RULES</strong>
                    </h2>
                    <hr>
                    <img class="img-responsive img-border img-left" src="img/intro-pic.jpg" alt="">
                    <hr class="visible-xs">
                    <hr>
                    <br>
                    <p align = "center">* ONLY MEMBERS ALLOWED *</p>
                    <p align = "center">* SCRAPS FORBIDDEN *</p>
                    <p align = "center">** </p>
                </div>
            </div>
        </div>

          
    <!-- /.container -->
    </div>
    
    <jsp:include page="include/footer.jsp"/> 
</body>
</html>