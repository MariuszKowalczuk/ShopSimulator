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
@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        UserHibernateRepository uhr = new UserHibernateRepository();
        List<User> all = uhr.findAll();
        for (User user : all) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                request.getSession().setAttribute("login", login);
            }

        }
        response.sendRedirect("index.jsp");


    }
}
