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
                    branch: 'QA',
                    credentialsId: 'github-pat'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
