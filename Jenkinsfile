pipeline {
    agent any

    tools {
        maven 'Maven_Home'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ymreddy8897/docker-jenkins-cicd.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t ymreddy8897/docker-jenkins-cicd:latest .'
            }
        }

        stage('Push Image to Docker Hub') {
    steps {
        withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
            bat """
                docker login -u ymreddy8897 -p %dockerhubpwd%
                docker push ymreddy8897/docker-jenkins-cicd:latest
            """
        }
    }
}
    }
}