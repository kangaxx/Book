package dao;

import entity.Book;

import java.util.List;

public interface BookInterface {
    Book add(Book b);
    boolean delete(int b);
    boolean update(Book b);
    Book selectById(int b);
    Book selectByName(Book b);
    List<Book> selectAll();
}
