package pl.mk.servlets;

import pl.mk.entities.Position;
import pl.mk.entities.Product;
import pl.mk.hibernate.PositionHibernateRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Mariusz Kowalczuk
 */
@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object quantity1 = getServletContext().getAttribute("quantity");
        Object product_id1 = getServletContext().getAttribute("product_id");
        String quantity = req.getParameter("quantity");
        String product_id = req.getParameter("product_id");
        Product product = new Product();
        product.setId((Integer) product_id1);
        Position position = new Position();
        position.setProduct(product);
        position.setQuantity((Integer) quantity1);
        PositionHibernateRepository phr = new PositionHibernateRepository();
        phr.save(position);


    }
}
