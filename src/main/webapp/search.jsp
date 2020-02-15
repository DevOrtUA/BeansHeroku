<html>
<jsp:useBean id="term" class="servlet.Search"/>
<h1>GET</h1>
<body>
    <br>
    <jsp:setProperty name="term" property="termine" param="termine" />
    <jsp:getProperty name="term" property="risultato" />
    <br>

    <a href="index.html">Torna alla Home</a>

</body>
</html>
