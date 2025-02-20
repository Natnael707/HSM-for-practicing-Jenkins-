

pipeline {
    agent any

    environment {
           BUTLER_API_KEY = credentials('UjK7oTtEmTeQHUXO067E0R28GBlP2QhpqN6AzwMj')
            ITCH_USER = 'Natty50'
            ITCH_GAME = 'Hospital Management System'
        }

    stages {
        stage('Checkout') { // Fetches source code from GitHub
            steps {
                git branch: 'main', url: 'https://github.com/ShonLibo/HospitalManagmentSystem.git'
            }
        }

       // stage('sonarQube inspection') {
        //    steps {
       //         withSonarQubeEnv('sonarQ') {
                  //  sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
       //         }
         //   }
       // }

        stage('Build') { // Compiles the source code
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Unit Tests') { // Runs unit tests
            steps {
                sh 'mvn test'
            }
        }

        stage('Integration Tests') { // Runs integration tests
            steps {
                sh 'mvn verify'
            }
        }


       }


        stage('Package') {
                    steps {
                        sh 'mkdir -p dist'
                        sh 'cp target/your-app.jar dist/' // Copy the JAR file to a dist folder
                        sh 'zip -r dist/your-app.zip dist/*' // Package the application into a ZIP file
                    }
                }


            stage('Deploy to itch.io') {
                        steps {
                            sh 'butler push dist/your-app.zip your-itchio-Natty50/Hospital Management System:windows --userversion 1.0.0'
                        }

        }
    }
}