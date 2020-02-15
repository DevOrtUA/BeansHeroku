<html>
<head>
    <title>Elimina</title>
</head>
<body>
<h1>Elimina:</h1>
    <jsp:useBean id="newCostruttore" class="servlet.Update" />
    <jsp:setProperty name="newCostruttore" property="termine" param="termine" />
    <jsp:setProperty name="newCostruttore" property="sinonimo" param="sinonimo" />
    <jsp:setProperty name="newCostruttore" property="contrario" param="contrario" />
    <jsp:getProperty name="newCostruttore" property="update"/>
    <br><br>
    <a href="index.html">Torna alla Home</a>
</body>
</html>
