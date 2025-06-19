pipeline {
    agent any
    environment {
        course = 'docker and gcp'
        name = 'sai'
    } 
    stages {
        stage ('classtoday') {
            steps {
                echo "welcome to class $name"
                echo "you enrolled into $course"
            }
        }
    }
}
