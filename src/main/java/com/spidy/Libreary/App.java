package com.spidy.Libreary;

import java.util.ArrayList;
import java.util.List;

import com.spidy.Libreary.Dao.AgrigationDao;
import com.spidy.Libreary.entity.Author;
import com.spidy.Libreary.entity.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book();
        book.setBookName("Vampire Daries");
        book.setBookLanguage("English");
        book.setPrice(560.66);
        
        Book book1 = new Book();
        book1.setBookName("The Originals");
        book1.setBookLanguage("Spanish");
        book1.setPrice(790.54);
        
        List<Book> list=new ArrayList<Book>();
        list.add(book);
        list.add(book1);
        
        Author author = new Author();
        author.setAuthorName("Aravind");
        author.setAuthorCountry("India");
        author.setAuthorAge(24);
        
        book.setAuthor(author);
        book1.setAuthor(author);
        
        AgrigationDao dao = new AgrigationDao();
        dao.saveBooks(list);
    }
}
