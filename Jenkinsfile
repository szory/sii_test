pipeline {
  agent any
  stages {
    stage('setup') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('cucumberTest') {
      parallel {
        stage('restassured') {
          steps {
            bat 'mvn test -Dcucumber.filter.tags="@restassured1"'
            junit 'target/surefire-reports/**/*.xml'
          }
        }
		stage('cucumberTest') {
          steps {
            script {
              for (int i = 0; i < 1; i++) {
                bat 'mvn test -Dcucumber.filter.tags="@datepicker"'
              }
            }
            junit 'target/surefire-reports/**/*.xml'
          }
        }
      }
    }
  }
  post {
    always {
      junit 'target/surefire-reports/**/*.xml'
    }
  }
}