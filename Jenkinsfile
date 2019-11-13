pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /var/lib/.m2:/root/.m2 --privileged=true'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
				archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}