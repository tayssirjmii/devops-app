package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Application Simple DevOps</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; margin: 40px; background: #f0f8ff; }");
        out.println("        .container { max-width: 800px; margin: 0 auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
        out.println("        h1 { color: #2c3e50; text-align: center; }");
        out.println("        .info { background: #e8f4fd; padding: 15px; border-radius: 5px; margin: 20px 0; }");
        out.println("        .btn { display: inline-block; background: #3498db; color: white; padding: 10px 20px; text-decoration: none; border-radius: 5px; margin: 5px; }");
        out.println("        .btn:hover { background: #2980b9; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class='container'>");
        out.println("        <h1>🚀 Application DevOps Simple</h1>");
        out.println("        <h2>ISET Kairouan - 2025/2026</h2>");

        out.println("        <div class='info'>");
        out.println("            <h3>Informations du serveur :</h3>");
        out.println("            <p><strong>Date et heure :</strong> " + LocalDateTime.now() + "</p>");
        out.println("            <p><strong>Technologie :</strong> Jakarta EE 10</p>");
        out.println("            <p><strong>Serveur :</strong> Apache Tomcat</p>");
        out.println("        </div>");

        out.println("        <div>");
        out.println("            <h3>Pages disponibles :</h3>");
        out.println("            <a href='hello' class='btn'>👋 Page de bienvenue</a>");
        out.println("            <a href='info' class='btn'>ℹ️ Informations techniques</a>");
        out.println("            <a href='index.jsp' class='btn'>🏠 Page JSP</a>");
        out.println("        </div>");

        out.println("        <div style='margin-top: 30px; padding: 15px; background: #d4edda; border-radius: 5px;'>");
        out.println("            <p>✅ Application déployée avec succès !</p>");
        out.println("            <p>Pipeline CI/CD : GitHub → Jenkins → Tomcat</p>");
        out.println("        </div>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }
}