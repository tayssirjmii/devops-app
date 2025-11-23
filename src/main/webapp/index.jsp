<!DOCTYPE html>
<html>
<head>
    <title>Page d'Accueil JSP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #74b9ff, #0984e3);
            color: white;
            text-align: center;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 30px;
        }
        h1 {
            font-size: 3em;
            margin-bottom: 10px;
        }
        .card {
            background: rgba(255,255,255,0.1);
            padding: 25px;
            border-radius: 15px;
            margin: 25px 0;
            backdrop-filter: blur(10px);
        }
        .btn {
            display: inline-block;
            background: white;
            color: #0984e3;
            padding: 12px 25px;
            text-decoration: none;
            border-radius: 8px;
            margin: 10px;
            font-weight: bold;
            transition: transform 0.3s;
        }
        .btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 5px 15px rgba(0,0,0,0.2);
        }
        .feature-list {
            text-align: left;
            display: inline-block;
            margin: 20px 0;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>🏠 Page JSP</h1>
    <h2>Application DevOps ISETK</h2>

    <div class="card">
        <h3>Cette page utilise :</h3>
        <div class="feature-list">
            <p>✅ Jakarta EE 10</p>
            <p>✅ JSP (Java Server Pages)</p>
            <p>✅ HTML5 & CSS3</p>
            <p>✅ Maven pour le build</p>
        </div>
    </div>

    <div class="card">
        <h3>Informations dynamiques :</h3>
        <p><strong>Date et heure :</strong> <%= new java.util.Date() %></p>
        <p><strong>Nom de l'application :</strong> <%= getServletContext().getServletContextName() %></p>
    </div>

    <div>
        <h3>Navigation :</h3>
        <a href="accueil" class="btn">🚀 Accueil Servlet</a>
        <a href="hello" class="btn">👋 Page de bienvenue</a>
        <a href="info" class="btn">🔧 Informations techniques</a>
    </div>

    <div class="card" style="margin-top: 40px;">
        <p><strong>ISET Kairouan - Cours DevOps 2025/2026</strong></p>
        <p>Application déployée avec pipeline CI/CD</p>
    </div>
</div>
</body>
</html>