pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
      args '-v /Users/pszarlowski/.m2:/root/.m2'
    }

  }
  stages {
    stage('setup') {
      steps {
        sh 'mvn clean'
      }
    }

    stage('cucumberTest') {
      steps {
        sh 'mvn test -Dcucumber.filter.tags="@datepicker"'
      }
    }

    stage('Reports') {
      steps {
        junit 'target/surefire-reports/**/*.xml'
      }
    }

  }
}