package pl.coderslab.web;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HelloWorld.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int param1 = Integer.parseInt(request.getParameter("a"));

        //http://localhost:8080/hello?a=123

        //połączenie do bazy i pobranie artykułu

        logger.info("some info");
        response.getWriter().append("<h1>cvcvcv</h1>");
        response.getWriter().append("<p>"+param1+"</p>");

    }
}
