package test;

import dao.BookDAO;

public class Main {
    public static void main(String[] args) {
        BookDAO dao=new BookDAO();
        System.out.println(dao.selectAll());
        System.out.println(dao.delete(6));
        System.out.println(dao.selectAll());
    }
}
