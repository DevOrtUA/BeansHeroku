<html>
<head>
    <title>Elimina</title>
</head>
<body>
<h1>Elimina:</h1>
    <jsp:useBean id="newCostruttore" class="servlet.Delete" />
    <jsp:setProperty name="newCostruttore" property="termine" param="termine" />
    <jsp:getProperty name="newCostruttore" property="delete"/>
    <br><br>
    <a href="index.html">Torna alla Home</a>
</body>
</html>
