package pl.mk.servlets;

import pl.mk.entities.Product;
import pl.mk.hibernate.ProductHibernateRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Mariusz Kowalczuk
 */
@WebServlet(value = "/details")
public class ShowProductDetails extends HttpServlet {
    ProductHibernateRepository phr = new ProductHibernateRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer product_id = Integer.valueOf(req.getParameter("product_id"));
        Product byId = phr.findById(product_id);
        System.out.println(byId);
        getServletContext().setAttribute("product", byId);
        resp.sendRedirect("details.jsp");

    }

}
