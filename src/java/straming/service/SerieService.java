/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straming.service;

import java.util.List;
import straming.dao.SerieDAO;
import straming.entity.Serie;

/**
 *
 * @author Sohayby
 */
public class SerieService {
    
    public List<Serie> lister (){
        return new  SerieDAO().ListerSeries();
    }
}
