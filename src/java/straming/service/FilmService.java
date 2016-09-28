/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straming.service;

import java.util.List;
import straming.dao.FilmDAO;
import straming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {
    
    public List<Film> lister (){
        
       return new FilmDAO().listerFilms();
        
    }
    
}
