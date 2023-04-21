<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

    <form action="/login" method="GET">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username"><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Submit">
    </form>

    <#if params.error?exists && params.error == "1">
        <p style="color: red;">Invalid username and/or password.</p>
    </#if>

</body>

</html>