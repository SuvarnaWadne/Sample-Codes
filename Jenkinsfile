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
        always {
            echo 'Publishing TestNG Report'
            step([
                $class: 'Publisher',
                reportFilenamePattern: 'testng-results.xml',
                reportPath: 'target/surefire-reports',
                escapeTestDescription: false,
                escapeExceptionMessages: false,
                showFailedBuilds: true,
                showFailedTests: true
            ])
        }
    }
}
