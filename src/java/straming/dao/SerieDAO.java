/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import straming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {
    public List<Serie> ListerSeries () {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Serie> series = em.createQuery("SELECT s FROM Serie s ORDER BY s.id DESC").getResultList();
        return series;
    }
    
}
