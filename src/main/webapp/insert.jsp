<html>
<head>
    <title>Ricerca</title>
</head>
<body>
<h1>Ricerca</h1>
    <jsp:useBean id="newCostruttore" class="servlet.Search" />
    <jsp:setProperty name="newCostruttore" property="search" param="ricerca" />
    <jsp:getProperty name="newCostruttore" property="search" />
    <jsp: name="newCostruttore" property="search" />
    <br><br>
    <a href="index.html">Torna alla Home</a>
</body>
</html>
