package pl.mk.servlets;

import pl.mk.entities.Product;
import pl.mk.hibernate.ProductHibernateRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
@WebServlet(value = "/all")
public class ShowAllProducts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductHibernateRepository phr = new ProductHibernateRepository();
        List<Product> all = phr.findAll();
        getServletContext().setAttribute("products", all);
        resp.sendRedirect("index.jsp");

    }
}
