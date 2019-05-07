package pl.mk.servlets;

import pl.mk.entities.CartSingleton;
import pl.mk.entities.PostitionNoDB;

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
@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        using position and DB
//        Object quantity1 = getServletContext().getAttribute("quantity");
//        Object product_id1 = getServletContext().getAttribute("product_id");
//        String quantity = req.getParameter("quantity");
//        String product_id = req.getParameter("product_id");
//        Integer product_id2 = (Integer) getServletContext().getAttribute("product_id");
//        Product product = new Product();
////        product.setId(product_id2);
//        product.setId(Integer.valueOf(product_id));
//        Position position = new Position();
//        position.setProduct(product);
//        position.setQuantity(Integer.valueOf(quantity));
//        PositionHibernateRepository phr = new PositionHibernateRepository();
//        phr.save(position);
        CartSingleton cartSingleton = CartSingleton.getInstance();
        Integer quantity = Integer.valueOf(req.getParameter("quantity"));
        Integer product_id = Integer.valueOf(req.getParameter("product_id"));
        cartSingleton.addItem(product_id, quantity);
        getServletContext().setAttribute("cart", cartSingleton);
        List<PostitionNoDB> positions = cartSingleton.getPositions();
        getServletContext().setAttribute("positions", positions);




    }
}
