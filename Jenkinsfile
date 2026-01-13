pipeline {
    agent any

    tools {
        jdk 'JDK-17'
        maven 'Maven-3.9.6'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/SuvarnaWadne/Sample-Codes.git',
                    branch: 'feature',
                    credentialsId: 'github-pat'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Tests passed'
        }
        failure {
            echo 'Tests failed'
        }
    }
}
