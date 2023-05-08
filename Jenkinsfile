pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Hello World'
                git branch: 'main', credentialsId: 'cf3d6d86-2ff7-465a-8767-58e572a16539', url: 'https://github.com/Anju-Alexander/HelloWorld.git'
            }
        }
    }
}
