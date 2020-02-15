<html>
<head>
    <title>Inserisci</title>
</head>
<body>
<h1>Inserisci:</h1>
    <jsp:useBean id="newCostruttore" class="servlet.Insert" />
    <jsp:setProperty name="newCostruttore" property="termine" param="termine" />
    <jsp:setProperty name="newCostruttore" property="sinonimo" param="sinonimo" />
    <jsp:setProperty name="newCostruttore" property="contrario" param="contrario" />
    <jsp:getProperty name="newCostruttore" property="insert"/>
    <br><br>
    <a href="index.html">Torna alla Home</a>
</body>
</html>
