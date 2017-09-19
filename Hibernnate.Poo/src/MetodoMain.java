

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Metila
 */
public class MetodoMain {
    
    public static void main(String[] args) {
       Session tio= NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t =tio.beginTransaction();
        Pessoa p=new Pessoa();
      
        p.setNome("aa");
        p.setNaturalidade("maputo");
        p.setDataNascimento("21/07/1995");
    }
   
      
    
}
