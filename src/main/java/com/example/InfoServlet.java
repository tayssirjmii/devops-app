package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Informations Techniques</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; margin: 40px; background: #2c3e50; color: white; }");
        out.println("        .container { max-width: 800px; margin: 0 auto; }");
        out.println("        .card { background: #34495e; padding: 20px; border-radius: 8px; margin: 15px 0; }");
        out.println("        h1, h2 { color: #3498db; }");
        out.println("        .info-item { margin: 10px 0; }");
        out.println("        .btn { display: inline-block; background: #3498db; color: white; padding: 10px 15px; text-decoration: none; border-radius: 5px; margin: 5px; }");
        out.println("        table { width: 100%; border-collapse: collapse; margin: 15px 0; }");
        out.println("        th, td { padding: 10px; text-align: left; border-bottom: 1px solid #7f8c8d; }");
        out.println("        th { background: #3498db; color: white; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class='container'>");
        out.println("        <h1>🔧 Informations Techniques</h1>");
        out.println("        <a href='accueil' class='btn'>← Accueil</a>");
        out.println("        <a href='hello' class='btn'>👋 Bienvenue</a>");

        out.println("        <div class='card'>");
        out.println("            <h2>Informations de la requête</h2>");
        out.println("            <div class='info-item'><strong>Méthode HTTP:</strong> " + request.getMethod() + "</div>");
        out.println("            <div class='info-item'><strong>URL:</strong> " + request.getRequestURL() + "</div>");
        out.println("            <div class='info-item'><strong>Protocole:</strong> " + request.getProtocol() + "</div>");
        out.println("            <div class='info-item'><strong>Adresse IP:</strong> " + request.getRemoteAddr() + "</div>");
        out.println("        </div>");

        out.println("        <div class='card'>");
        out.println("            <h2>En-têtes HTTP</h2>");
        out.println("            <table>");
        out.println("                <tr><th>Nom</th><th>Valeur</th></tr>");
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String headerName = headers.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("                <tr><td>" + headerName + "</td><td>" + headerValue + "</td></tr>");
        }
        out.println("            </table>");
        out.println("        </div>");

        out.println("        <div class='card'>");
        out.println("            <h2>Environnement serveur</h2>");
        out.println("            <div class='info-item'><strong>Java Version:</strong> " + System.getProperty("java.version") + "</div>");
        out.println("            <div class='info-item'><strong>OS:</strong> " + System.getProperty("os.name") + "</div>");
        out.println("            <div class='info-item'><strong>Temps actuel:</strong> " + new java.util.Date() + "</div>");
        out.println("        </div>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }
}