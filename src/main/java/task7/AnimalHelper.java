package task7;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AnimalHelper {

    EntityManagerFactory emf;
    EntityManager em;
    public AnimalHelper() {
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    public void add(AnimalA a) {
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
        emf.close();
    }

    public AnimalA getById(int id) {
        em.getTransaction().begin();
        AnimalA animalA = em.find(AnimalA.class, id);
        em.getTransaction().commit();
        emf.close();
        return animalA;
    }

    public void removeAnimal(AnimalA a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
        emf.close();
    }


    public List<AnimalA> getAllAnimal() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT animals FROM AnimalA animals");
        List<AnimalA> animalA = query.getResultList();
        em.getTransaction().commit();
        emf.close();
        return animalA;
    }


}