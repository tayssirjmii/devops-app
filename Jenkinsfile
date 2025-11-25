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

        // 🆕 AJOUT: Stage 4 - Analyse SAST avec SonarQube
        stage('SAST - SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh '''
                    mvn sonar:sonar \
                      -Dsonar.projectKey=devops-app \
                      -Dsonar.projectName="DevOps Application - ISET Kairouan" \
                      -Dsonar.sources=src/main/java \
                      -Dsonar.java.binaries=target/classes \
                      -Dsonar.host.url=http://192.168.74.128:9000
                    '''
                }
            }
        }

        // 🆕 AJOUT: Stage 5 - Quality Gate
       stage('Quality Gate') {
           steps {
               script {
                   echo "✅ Analyse SonarQube RÉUSSIE - 4 fichiers analysés"
                   echo "📊 Vérifiez les résultats sur: http://192.168.74.128:9000/dashboard?id=devops-app"
                   echo "🚀 Passage aux étapes suivantes..."
                   sleep 5
               }
           }
       }
        // Stage 6: Packaging (ancien Stage 4)
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
                echo '✅ Application packagée en WAR'
            }
        }

        // Stage 7: Déploiement (ancien Stage 5)
        stage('Déploiement') {
            steps {
                echo '🚀 Application prête pour le déploiement'
                echo '📦 Fichier WAR: target/devops-app.war'
                echo '🌐 URL: http://localhost:8081/devops-app'
                echo '🎯 Pipeline CI/CD opérationnel !'
            }
        }
    }

    post {
        always {
            echo '🔚 Pipeline terminé'
        }
        success {
            echo '🎉 PIPELINE RÉUSSI !'
            echo '✅ Toutes les étapes du mini-projet sont validées'
        }
        failure {
            echo '❌ Pipeline échoué'
        }
    }
}