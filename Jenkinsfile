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
                // Maven build for Windows
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Skipping test execution as no tests exist currently.'
                // If you add tests later, replace the above line with:
                // bat 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                echo 'Archiving HTML or other reports if available...'
                // Example for Selenium HTML reports (update path if different)
                archiveArtifacts artifacts: '**\\target\\html-reports\\*.html', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            echo 'Cleaning up workspace...'
            cleanWs()
        }
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
