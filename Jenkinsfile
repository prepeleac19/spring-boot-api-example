pipeline {
    agent any
    triggers {
        pollScm "* * * * *"
    }
    stages {
        stage("Build") {
            steps {
                sh "./gradlew assemble"
            }
        }
        stage("Test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}