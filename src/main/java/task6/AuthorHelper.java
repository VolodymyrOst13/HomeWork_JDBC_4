package task6;

import task6.entity.Author;
import hibernate.Criteria;
import hibernate.Session;
import hibernate.SessionFactory;

import java.util.List;


public class AuthorHelper {
    private SessionFactory sessionFactory;
    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList(){
        Session session = sessionFactory.openSession();

        Criteria cb = session.createCriteria(Author.class);/
        List<Author> authorList = cb.list();
        session.close();
        return authorList;
    }

    public Author getAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Author author = (Author) session.get(Author.class, id); // получение объекта по id
        session.close();
        return author;
    }

    public Author addAuthor(Author author){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(author); // сгенерит ID и вставит в объект

        session.getTransaction().commit();

        session.close();

        return author;

    }
}
