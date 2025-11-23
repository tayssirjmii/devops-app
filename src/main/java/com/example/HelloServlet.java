package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String nom = request.getParameter("nom");
        if (nom == null) {
            nom = "Étudiant ISETK";
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Bienvenue</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; margin: 40px; background: linear-gradient(135deg, #667eea, #764ba2); color: white; text-align: center; }");
        out.println("        .container { max-width: 600px; margin: 0 auto; padding: 40px; }");
        out.println("        h1 { font-size: 3em; margin-bottom: 20px; }");
        out.println("        .message { background: rgba(255,255,255,0.2); padding: 20px; border-radius: 10px; margin: 20px 0; }");
        out.println("        .btn { display: inline-block; background: white; color: #667eea; padding: 10px 20px; text-decoration: none; border-radius: 5px; margin: 10px; font-weight: bold; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class='container'>");
        out.println("        <h1>👋 Bonjour " + nom + " !</h1>");
        out.println("        <div class='message'>");
        out.println("            <p>Bienvenue dans votre application DevOps</p>");
        out.println("            <p>ISET Kairouan - Cours DevOps 2025/2026</p>");
        out.println("        </div>");
        out.println("        <a href='accueil' class='btn'>← Retour à l'accueil</a>");
        out.println("        <a href='hello?nom=Mohamed' class='btn'>Dire bonjour à Mohamed</a>");
        out.println("        <a href='hello?nom=Fatma' class='btn'>Dire bonjour à Fatma</a>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }
}