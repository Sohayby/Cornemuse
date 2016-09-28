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
import straming.entity.Serie;
import straming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListeSeriesServlet", urlPatterns = {"/ListeSeriesServlet"})
public class ListeSeriesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    List<Serie> series = new SerieService().lister();
    
    req.setAttribute("titre", "TEST LISTE SERIES");
    req.setAttribute("mesSeries", series);
     req.setAttribute("piedDepage","Copyright 2006");
    req.getRequestDispatcher("lister_series.jsp").forward(req, resp);
    
        
}
}