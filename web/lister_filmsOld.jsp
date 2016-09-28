<%-- 
    Document   : lister_films
    Created on : 28 sept. 2016, 11:52:09
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
         <a href="index.html">Home< </a>
        <a href="lister_films.html">  Liste des films </a>
         <a href="liste_series.html">  Liste des series </a>
          <a href="ajouter_films.html">  Ajouter des films </a>
           <a href="ajouter_series.html">  Ajouter des series </a>
        <h1>${titre} </h1>
        
        Dracula 1991
        Kung-fu Panda 2000
        
        <div>
            <c:forEach items="${mesFilms}" var="monFilm">
                ${monFilm.titre}
                <br>
            </c:forEach>
        </div>
        
        <div>${piedDepage}</div>
    </body>
    
</html>
