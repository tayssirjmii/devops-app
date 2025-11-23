pipeline {
    agent any

    stages {
        // Stage 1: Récupération du code
        stage('Checkout Git') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/tayssirjmii/devops-app.git',
                    credentialsId: 'github-credentials'
                echo '✅ Code récupéré depuis GitHub'
            }
        }

        // Stage 2: Build avec Maven
        stage('Build Maven') {
            steps {
                sh 'mvn clean compile'
                echo '✅ Build Maven réussi'
            }
        }

        // Stage 3: Tests unitaires
        stage('Tests') {
            steps {
                sh 'mvn test'
                echo '✅ Tests exécutés'
            }
        }

        // Stage 4: Packaging
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
                echo '✅ Application packagée en WAR'
            }
        }

        // Stage 5: Déploiement
        stage('Déploiement') {
            steps {
                echo '🚀 Application prête pour le déploiement'
                echo '📦 Fichier WAR: target/devops-app.war'
                echo '🌐 URL: http://localhost:8080/devops-app'
            }
        }
    }

    post {
        always {
            echo '🔚 Pipeline terminé'
        }
        success {
            echo '🎉 PIPELINE RÉUSSI !'
        }
        failure {
            echo '❌ Pipeline échoué'
        }
    }
}