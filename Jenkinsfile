pipeline {
  agent any
  stages {
    stage('setup') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('cucumberTest') {
      steps {
        bat 'mvn test -Dcucumber.filter.tags="@datepicker"'
      }
    }

    stage('Reports') {
      steps {
        junit 'target/surefire-reports/**/*.xml'
      }
    }

  }
}