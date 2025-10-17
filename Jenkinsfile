pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/RajeshKadali-1999/devops-script-demo.git'
            }
        }
        stage('Build') {
            steps {
            
                sh 'chmod +x ./mvnw'
                sh './mvnw clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
    }
}
