package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order-pizza")
public class ValuesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//http://localhost:8080/order-pizza?addons=pieczarki&addons=ser&addons=sos
        String[] values = request.getParameterValues("addons");
        response.getWriter().append("<html>");
        for (String s:values
             ) {

            response.getWriter().append(s);
            response.getWriter().append(" <br> ");
        }

    }
}
