package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class App extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello from Jetty + Jenkins + Maven!</h2>");
        out.println("</body></html>");
    }
}
