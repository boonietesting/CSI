pipeline {
  agent any
  stages {
    stage('Code') {
      steps {
        git(url: 'https://github.com/boonietesting/CSI.git', branch: 'main', changelog: true, poll: true)
      }
    }

    stage('Env Deploy') {
      parallel {
        stage('Env Deploy') {
          steps {
            echo 'Environment deployment start'
          }
        }

        stage('Masking Status Check') {
          steps {
            httpRequest(url: 'https://partner.testinsights.io/api/apikey/e2Ep6tf9uAnutPyp2kfONK63N/job/137094', acceptType: 'APPLICATION_JSON', contentType: 'APPLICATION_JSON', httpMode: 'GET', responseHandle: 'STRING', requestBody: '$ECHO', consoleLogResponseBody: true)
          }
        }

        stage('Shell') {
          steps {
            sh 'curl --location --request GET \'https://partner.testinsights.io/api/apikey/e2Ep6tf9uAnutPyp2kfONK63N/job/137123\''
          }
        }

      }
    }

  }
}