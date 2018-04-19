package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAllSession")
public class Sess03AllServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<String> keys = (List<String>) session.getAttribute("keys");
        response.setContentType("text/html");
        for (String s: keys){
            response.getWriter().append(s).append(" : ");
            response.getWriter().append(session.getAttribute(s).toString()).append("<br>");
        }
    }
}
