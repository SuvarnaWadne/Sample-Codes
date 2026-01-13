pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/SuvarnaWadne/Sample-Codes.git',
                    branch: 'feature',
                    credentialsId: 'github-pat'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests executed successfully'
        }
        failure {
            echo 'Build or tests failed'
        }
    }
}
