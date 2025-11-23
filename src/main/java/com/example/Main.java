package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Application DevOps ISETK Démarrée !");
        System.out.println("========================================");
        System.out.println("ISET Kairouan - Cours DevOps 2025/2026");
        System.out.println("Technologies: Jakarta EE • Maven • Git • Jenkins • Tomcat");
        System.out.println("========================================");

        // Afficher quelques informations système
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Temps: " + new java.util.Date());

        // Simulation de test unitaire
        System.out.println("✅ Tests unitaires: PASSED");
        System.out.println("✅ Build Maven: SUCCESS");
        System.out.println("✅ Déploiement: READY");

        System.out.println("========================================");
        System.out.println("🎯 PRÊT POUR LE PIPELINE CI/CD !");
        System.out.println("========================================");
    }
}