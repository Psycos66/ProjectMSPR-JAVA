<!DOCTYPE html>
<html lang="fr" >
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="assets/image/logo.ico">
    <title>Liste des équipements</title>
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Styles -->
    <link rel="stylesheet" href="assets/css/bootstrap4.min.css">
    <link rel="stylesheet" href="assets/css/mainv2.css">
    <link rel="stylesheet" href="assets/css/wireframe-theme.min.css">
    <script>document.createElement( "picture" );</script>
    <script class="picturefill" async="async" src="assets/js/picturefill.min.js"></script>
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,b%7CRoboto+Condensed:300,400,b%7CRoboto:300,400,b">
</head>
<body>
<div class="row nav-row">
    <div class="col-xs-12">
        <div class="container-fluid nav-container"><a href="index.php" class="responsive-picture logo" title="EPSI LOGO"><picture><img alt="EPSI" src="assets/image/logoepsi-400x400.png"></picture></a>
            <a class="link-text nav-link2" href="agents.php" title="Liste des agents">Liste des agents</a>
            <a class="link-text nav-link2" href="index.php" title="Espace Eleve">Présentation du projet</a>
        </div>
    </div>
</div>
<div class="row wecome-row">
    <div class="col-xs-12 welcome-column">
        <h4 class="welcome-subtitle">Liste des</h4>
        <h1>Équipements</h1>
    </div>
</div>
</body>
<br>
<br>
<br>
<br>
<br>
<body>
<div style="border: 2px solid #659224; border-radius:10px; padding:40px;">
    <div style="display: flex;
    width: 100%;
    justify-content: center;
    align-items: center; ">
        <h1 style=" font-size:medium; font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; margin-right:auto; margin-left:auto;">Agents de sécurité
        </h1>
        <img src="assets/image/ecusson-rond-securite-privee.jpg" style="border-radius:10px; margin-bottom:5px; border: 2px solid #659224; padding:5px; max-width:5rem;"/>

    </div>
    <div style="border: 2px solid #379EC1; border-radius:10px;padding:30px;">
        <?php
        include 'html/Cagent/Cagent2.txt.html';
        ?>
    </div>

</div>
<br>
<br>
<br>
<br>
</body>
<br>
<br>
<br>
<br>
<div class="footer-basic" style="background-color: #333333">
    <footer>
        <div class="social" style="color:#FFFFFF;"><a href="https://github.com/Psycos66/ProjectMSPR-JAVA"><i class="icon ion-social-github"></i></a></div>
        <p class="copyright">Julien Seux, Kilian Billard, Mathis Belin, Clément Moreau</p>
        <p class="copyright"> © 2022 </p>
    </footer>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
</html>