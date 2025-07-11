pipeline {
    agent {
        label 'jenkins-slave'  
    }
    tools {
        jdk 'jdk'             
        maven 'maven'
    }         
    stages {
        stage('Build') {
            steps {
               sh "mvn clean"
            }                    
        }
    }
}
