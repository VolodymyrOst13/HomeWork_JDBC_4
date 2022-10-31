package task6;

import task6.entity.Book;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Создаем объект Helper для работы с сущностью БД
        BookHelper bH = new BookHelper();

        // Создаем книгу, устанавливаем ему имя и автора добавляем в БД
        Book newBook = new Book();
        newBook.setName("Тополь");
        newBook.setAuthor_id(1);
        bH.addBook(newBook);

        // Получение книгу по айди
        Book book_id = bH.getBookById(1);
        System.out.println(book_id);

        // Получение списка Books
        List<Book> books = bH.getBookList();
        for (Book a : books) {
            System.out.println("id = " + a.getId() + " " + "Книга " + a.getName());
        }
    }
}
