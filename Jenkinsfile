pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Clone'
                git branch: 'main', credentialsId: 'cf3d6d86-2ff7-465a-8767-58e572a16539', url: 'https://github.com/Anju-Alexander/Trial.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Build'
                sh 'pwd'
            }
        }
    }
}
