package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int param1 = Integer.parseInt(request.getParameter("a"));

        //http://localhost:8080/hello?a=123

        //połączenie do bazy i pobranie artykułu


        response.getWriter().append("<h1>Hello World !!!!</h1>");
        response.getWriter().append("<p>"+param1+"</p>");

    }
}
