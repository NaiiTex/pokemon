
<#ftl encoding="utf-8">
<head>
    <title>Inscription</title>
    <link rel="stylesheet" href="style.css">
</head>
    <h1>Inscription</h1>
    <form action="/register" method="POST">
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required>
        <br><br>
        <label for="prenom">Prenom:</label>
        <input type="text" id="prenom" name="prenom" required>
        <br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br><br>
        <button type="submit">Register</button>
    </form>

