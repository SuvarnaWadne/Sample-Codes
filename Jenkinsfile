pipeline {
    agent any

    environment {
        BRANCH_NAME = 'feature'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out branch: ${BRANCH_NAME}"
                git branch: "${BRANCH_NAME}", url: 'https://github.com/SuvarnaWadne/Sample-Codes.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                // Example for Maven on Windows
                bat 'mvn clean compile'
                // If Gradle, replace with: bat 'gradle build'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running tests...'
                // Example for TestNG (adjust if not using TestNG)
                bat 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                echo 'Archiving test reports...'
                // Windows-style path
                archiveArtifacts artifacts: '**\\target\\surefire-reports\\*.xml', allowEmptyArchive: true
                junit '**\\target\\surefire-reports\\*.xml'
            }
        }
    }

    post {
        always {
            echo 'Cleaning up workspace...'
            cleanWs()
        }
        success {
            echo 'Build and tests successful!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
