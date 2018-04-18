package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/get2")
public class Get2Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> paramsMap = request.getParameterMap();
        Set<String> keys = paramsMap.keySet();
        for (String key : keys){
            String[] values = paramsMap.get(key);
            response.getWriter().append("paramName = " + key);
            response.getWriter().append("paramValues = " + Arrays.toString(values));
//            response.getWriter()
        }
    }
}
