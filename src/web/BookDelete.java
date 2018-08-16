package web;

import dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BookDelete")
public class BookDelete extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BookDAO bookDAO=new BookDAO();
        response.getWriter().print(bookDAO.delete(Integer.parseInt(request.getParameter("id"))));
    }
}
