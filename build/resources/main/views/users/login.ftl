<#ftl encoding="utf-8">


<head>
	<title>Connexion</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="container">
		<h1>Connexion</h1>
		<form class="login" method="post" action="/login">
			<label for="username">E-mail</label>
			<input type="text" id="email" name="email" placeholder="Enter e-mail">

			<label for="password">Password</label>
			<input type="password" id="password" name="password" placeholder="Enter password">

			<button type="submit">Login</button>
		</form>
	</div>
</body>


