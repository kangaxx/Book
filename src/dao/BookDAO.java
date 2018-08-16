package dao;

import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements BookInterface{
     static List<Book> list=new ArrayList<>();
        static {
             list.add(new Book(1,"中国","李晓鸥",251));
            list.add(new Book(2,"美国","张晓东",441));
            list.add(new Book(3,"德国","发卡死",151));
            list.add(new Book(4,"日本","fsa gads",351));
            list.add(new Book(5,"中国","李晓鸥",451));
        }

    @Override
    public Book add(Book b) {
          if(selectById(b.getId())==null){
              list.add(b);
              return b;
          }
        return null;
    }

    @Override
    public boolean delete(int b) {
        for(Book book:list){
            if(book.getId()==b){
                list.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Book b) {
            for(Book book:list){
                if(book.getId()==b.getId()){
                    book.setAuthor(b.getAuthor());
                    book.setName(b.getName());
                    book.setPrice(b.getPrice());
                    return true;
                }
            }
        return false;
    }

    @Override
    public Book selectById(int b) {
            for (Book book:list){
                if(book.getId()==b){
                    return book;
                }
            }
        return null;
    }

    @Override
    public Book selectByName(Book b) {
        for (Book book:list){
            if(book.getName().toUpperCase()==b.getName().toUpperCase()){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> selectAll() {
        return list;
    }
}
