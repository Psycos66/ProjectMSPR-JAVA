<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="{{asset('images/xefi.ico')}}">
    <title>Accueil</title>
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600;700&display=swap" rel="stylesheet">
    <!-- Styles -->

</head>
<body style="padding:15px;">
<div style="border: 2px solid #659224; border-radius:10px; padding:40px;">
<div style="display: flex;
    width: 100%;
    justify-content: center;
    align-items: center; ">
    <h1 style=" font-size:medium; font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; margin-right:auto; margin-left:auto;">Agents de sécurité
    </h1>
    <img src="../asset/image/R.png" style="border-radius:10px; margin-bottom:5px; border: 2px solid #659224; padding:5px; max-width:5rem;"/>
</div>
    <div style="border: 2px solid #379EC1; border-radius:10px;padding:30px;">
    <?php
    include '../Agent/listeAgents.html';
    ?> 
    </div>
    
</div>

</body>
</html>