package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/getsession")
public class SessionGetServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        String name = (String) sess.getAttribute("name");
        int counter = (int) sess.getAttribute("counter");
        List<String> list = (List<String>) sess.getAttribute("list");
        response.getWriter().append(name);
        response.getWriter().append(counter+"");
        response.getWriter().append(list.toString());
    }
}
