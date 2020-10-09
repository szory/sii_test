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
        stage('cucumberTest') {
          steps {
            script {
              for (int i = 0; i < 1; i++) {
                bat 'mvn test -Dcucumber.filter.tags="@datepicker"'
              }
            }

          }
        }

        stage('restassured') {
          steps {
            bat 'mvn test -Dcucumber.filter.tags="@restassured1"'
          }
        }

      }
    }
  }
  post {
		always {
			bat 'mvn cluecumber-report:reporting'
		}
	}
}