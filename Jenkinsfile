pipeline {

  agent { label 'maven' } 

  tools {
    maven 'M3-Local'
  }

  stages {

    stage('Checkout') {
      steps {
        echo '拉取代码'
      }
    }

    stage('Build') {
      steps {
        echo '编译代码'

        sh 'mvn clean package'
      }
    }

  }

  post {
      always {
        echo '无论构建成功或失败都会执行'

        junit 'target/surefire-reports/*.xml'
      }
  }

}