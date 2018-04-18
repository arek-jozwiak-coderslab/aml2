package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet("/sess")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        sess.setAttribute("name", "Arek");
        sess.setAttribute("counter", 123);
        sess.setAttribute("addons", new int[]{1,2,3});
        sess.setAttribute("list", Arrays.asList(new String[]{"jeden", "dwa"}));
        response.getWriter().append("session");
    }
}
