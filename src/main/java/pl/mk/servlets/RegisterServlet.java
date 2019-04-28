package pl.mk.servlets;

import pl.mk.entities.User;
import pl.mk.hibernate.UserHibernateRepository;

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
@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String adress = req.getParameter("adress");
        UserHibernateRepository uhr = new UserHibernateRepository();
        List<User> all = uhr.findAll();
        for (User user : all) {
            if (user.getLogin().equals(login)) {
                resp.sendRedirect("index.jsp");
            }
        }
        User user = new User();
        user.setShippingAdress(adress);
        user.setLogin(login);
        user.setPassword(password);
        uhr.save(user);
    }
}
