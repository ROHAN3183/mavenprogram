pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t reverse-array-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d reverse-array-app'
            }
        }
    }
}