pipeline {
    agent any

    stages {
        stage('Clone B') {
            steps {
                echo 'Clone B'
                
                dir('scripts') {
                    git branch: 'main', credentialsId: 'cf3d6d86-2ff7-465a-8767-58e572a16539', url: 'https://github.com/Anju-Alexander/Trial.git'
                }
                
            }
            
        
            
        }
        stage('Build') {
            steps {
                dir('scripts') {
                    echo 'Build'
                    sh 'mvn clean install'
                    sh 'java -jar target/Trial-1.0-SNAPSHOT.jar'
                }
            }
        }
    }
}

