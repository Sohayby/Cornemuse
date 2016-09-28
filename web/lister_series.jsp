<%-- 
    Document   : lister_series
    Created on : 28 sept. 2016, 16:45:38
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_HEAD.jsp"/>
    </head>
    <body>
        
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div> 
        
        <div class="titre">
           Liste des series
        </div> 
        
        <div class="contenu">
            <c:forEach items="${mesFilms}" var="monFilm">
                ${monFilm.titre}
                <br>
            </c:forEach>
        </div> 

        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div> 

    </body>
</html>
