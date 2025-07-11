pipeline {
    agent {
        label 'jenkins-slave'  
    }
    tools {
        jdk 'Jdk-21'             
        maven 'maven'
    }         
    stages {
        stage('Build') {
            steps {
                dir('/home/nagasaivardhan724/spring-petclinic'){
                  sh "mvn clean package"
                }
            }                    
        }
    }
}
