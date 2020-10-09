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
        script {
          for (int i = 0; i < 1; i++) {
            bat 'mvn test -Dcucumber.filter.tags="@datepicker"'
          }
        }

      }
    }

    stage('Reports') {
      steps {
        junit 'target/surefire-reports/**/*.xml'
      }
    }

    stage('Report_Cluecumber') {
      steps {
        bat 'mvn cluecumber-report:reporting'
      }
    }

  }
}