<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list users as user>
        <li>${user.id} - ${user.nom} ${user.prenom} - ${user.email} ${user.pwd} </li>
    </#list>
</ul>

</body>

</html>
