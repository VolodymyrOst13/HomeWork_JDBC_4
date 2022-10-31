package task6;

import task6.entity.Book;
import hibernate.Criteria;
import hibernate.Session;
import hibernate.SessionFactory;


import java.util.List;

public class BookHelper {
    private SessionFactory sessionFactory;
    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    public List<Book> getBookList(){
        Session session = sessionFactory.openSession();
        Criteria cb = session.createCriteria(Book.class);
        List<Book> booksList = cb.list();
        session.close();
        return booksList;
    }

    public Book getBookById(long id) {
        Session session = sessionFactory.openSession();
        Book book_id = (Book) session.get(Book.class, id);
        session.close();
        return book_id;
    }

    public Book addBook(Book newBook){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(newBook);
        session.getTransaction().commit();
        session.close();
        System.out.println("_________нова книга добавлена_________");
        return newBook;
    }

}
