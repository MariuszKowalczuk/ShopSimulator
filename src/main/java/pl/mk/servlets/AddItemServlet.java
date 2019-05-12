package pl.mk.servlets;

import pl.mk.entities.Cart;
import pl.mk.entities.Product;
import pl.mk.hibernate.ProductHibernateRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Mariusz Kowalczuk
 */
@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {
    ProductHibernateRepository phr = new ProductHibernateRepository();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer quantity = Integer.valueOf(req.getParameter("quantity"));
        Integer product_id = Integer.valueOf(req.getParameter("product_id"));
        HttpSession session = req.getSession();
        Product product = phr.findById(product_id);
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }

        cart.addItem(product, quantity);

        //dodać ify, że jeśli nie ma, to utworzyć i że jeśli nie, to dcaodać


    }
}
