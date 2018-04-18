package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/getses")
public class GetSesServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        if(sess.getAttribute("counter")!=null) {
            int counter = (int) sess.getAttribute("counter");
            response.getWriter().append(counter + "");
            sess.setAttribute("counter", counter+1);
        }else {
            response.getWriter().append("Brak atrybutu");
        }

    }
}

