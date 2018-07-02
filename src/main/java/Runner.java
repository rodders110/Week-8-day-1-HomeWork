import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

public class Runner {


    public static void main(String[] args) {
        Book book1 = new Book("The Twits", "Children", "Roald Dahl");
        DBBook.saveOrUpdate(book1);
        Book book2 = new Book("Famous Five", "Children", "Enid Blyton");
        DBBook.saveOrUpdate(book2);
        Book book3 = new Book("The Owl Service", "Teen", "Alan Bennett");


        Author author1 = new Author("Roald", "Dahl");
        DBAuthor.saveOrUpdate(author1);
        Author author2 = new Author("Enid", "Blyton");
        DBAuthor.saveOrUpdate(author2);
        Author author3 = new Author("Alan", "Bennett");
        DBAuthor.saveOrUpdate(author3);
    }


}