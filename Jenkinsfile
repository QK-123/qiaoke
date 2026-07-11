pipeline {

  agent { label 'maven' } 

  tools {
    maven 'M3-Local'
  }

  environment {
    IMAGE_NAME = 'qiaoke/spring-web-demo'
  }

  stages {

    stage('Checkout') {
      steps {
        echo '拉取代码'
      }
    }

    stage('Build jar') {
      steps {
        echo '编译代码'

        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('Build image') {
      steps {
        echo '构建镜像'

        sh 'docker build -t ${IMAGE_NAME}:${env.BUILD_NUMBER} .'
      }
    }

  }

}