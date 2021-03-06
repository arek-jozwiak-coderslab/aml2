package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delcookie")
public class CookieDelServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean cookieNotExist = true;
        if (cookies!=null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("name")) {
                    c.setMaxAge(0);
                    response.addCookie(c);
                    cookieNotExist = false;
                    response.getWriter().append("deleted cookie");
                }
            }

            if (cookieNotExist) {
                response.getWriter().append("Nie istnieje");
            }
        }

    }
}
