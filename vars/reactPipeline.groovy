pipeline {
    agent any 
    stages {
        stage ('ReactApps') {
            steps {
                script {
                    echo "Executing React Pipeline"
                }
            }
        }
        stage ('Mailing') {
            steps {
                echo "Sending a mail !!!!!!!!!!!!"
            }
        }
    }
}