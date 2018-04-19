package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToSession")
public class Sess03Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        HttpSession session = request.getSession();
        session.setAttribute(key, value);

        List<String> keys = (List<String>) session.getAttribute("keys");

        if(keys == null){
            keys = new ArrayList<>();
        }
        keys.add(key);
        session.setAttribute("keys", keys);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String form = "<form action='' method='POST'>" +
                "<label>Klucz:<input type='text' name='key'></label>" +
                "<label> Wartość:<input type='text' name='value'> </label>" +
                "<input type='submit'></form>";
        response.setContentType("text/html");
        response.getWriter().append(form);
    }
}
