pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout...'
            }
        }
        stage('Prepare') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }
        stage('BuildAndInstall') {
            steps {
                echo 'Building...'
            }
        }
        stage('Unit Tests') {
            steps {
                echo 'Testing...'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                echo 'SonarQube...'
                withSonarQubeEnv('My SonarQube Server') {
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
        stage('Artifactory Deploy') {
            steps {
                echo "Artifactory Deploy..."
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }

    post {
        always {
            echo 'This will always run...'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
            mail to: 'shubhajit.sahoo@gmail.com',
                 subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}