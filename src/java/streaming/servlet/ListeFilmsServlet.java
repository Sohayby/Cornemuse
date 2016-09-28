/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import straming.entity.Film;
import straming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListeFilmsServlet", urlPatterns = {"/lister_films"})
public class ListeFilmsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Film> films = new FilmService().lister(); 
        
        req.setAttribute("titre","TEST LISTE FILMS");
        req.setAttribute("mesFilms", films);
        req.setAttribute("piedDepage","Copyright 2006");
        req.getRequestDispatcher("lister_films.jsp").forward(req, resp);
          
    }

}


