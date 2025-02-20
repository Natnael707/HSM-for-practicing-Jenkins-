pipeline {
    agent any

    environment {
        ITCH_USER = 'Natty50'             // Your itch.io username
        ITCH_GAME = 'HMS' // The game name on itch.io
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub
                git branch: 'main', url: 'https://github.com/Natnael707/HSM-for-practicing-Jenkins-.git'
            }
        }

        stage('Build') {
            steps {
                // Build the application with Maven (Make sure your project is a Maven project)
                sh 'mvn clean package'  // This will generate the JAR file
            }
        }

        stage('Package') {
            steps {
                // Create a dist directory to store the packaged file
                sh 'mkdir -p dist'

                // Copy the generated JAR file to the dist folder
                sh 'cp target/*.jar dist/'

                // Package everything in the dist folder into a ZIP file
                sh 'zip -r dist/your-app.zip dist/*'
            }
        }

        stage('Deploy to itch.io') {
            steps {
                // Use Jenkins credentials for Butler API key
                withCredentials([string(credentialsId: 'itch.io', variable: 'BUTLER_API_KEY')]) {
                    // Deploy the ZIP file to itch.io using Butler
                    sh 'butler push dist/your-app.zip $ITCH_USER/$ITCH_GAME:windows --userversion 1.0.0 --apikey $BUTLER_API_KEY'
                }
            }
        }
    }

    post {
        success {
            echo 'Deployment to itch.io was successful!'
        }

        failure {
            echo 'Deployment to itch.io failed.'
        }
    }
}
