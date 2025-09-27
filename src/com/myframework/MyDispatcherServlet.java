package com.myframework;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class MyDispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Récupérer la route (chemin demandé)
        String path = req.getRequestURI();

        // Log dans la console Tomcat
        System.out.println("➡ Nouvelle requête : " + path);

        // Afficher dans le navigateur
        resp.setContentType("text/plain");
        resp.getWriter().println("Route appelée : " + path);
    }
}
