/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Estudiante
 */
public class BaseDatos {

    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("Game_PacmanPU"); 
 
   /*
    public boolean insertarPersona(Jugador p)
    {
        boolean retorno=false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        retorno=true;
        return retorno;
    }
     public List<Jugador> leerJugador()
    {
        List<Jugador> retorno=null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno=em.createQuery("SELECT p FROM Jugador p ORDER BY p.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    
    }
    /*
     public boolean insertarAuto(Auto p)
    {
        boolean retorno=false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        retorno=true;
        return retorno;
    }
      public boolean insertarPrueba(Prueba p)
    {
        boolean retorno=false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        retorno=true;
        return retorno;
    }
         public boolean insertarPrueba2(prueba2 p)
    {
        boolean retorno=false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        retorno=true;
        return retorno;
    }
    
    public List<Persona> leerPersona()
    {
        List<Persona> retorno=null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno=em.createQuery("SELECT p FROM Persona p ORDER BY p.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    
    }
     public List<Auto> leerAuto()
    {
        List<Auto> retorno=null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno=em.createQuery("SELECT p FROM Auto p ORDER BY p.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    
    }
     
       public List<Prueba> leerPrueba()
    {
        List<Prueba> retorno=null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno=em.createQuery("SELECT p FROM Prueba p ORDER BY p.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    
    }
         public List<prueba2> leerPrueba2()
    {
        List<prueba2> retorno=null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno=em.createQuery("SELECT p FROM prueba2 p ORDER BY p.id").getResultList();
        em.getTransaction().commit();
        return retorno;
    
    }
    
    */
    
}
