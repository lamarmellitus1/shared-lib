#!/usr/bin/env groovy

def call(){
    echo 'building a docker image & deploying to dockerhub'
    withCredentials([string(credentialsId: 'passwds', variable: 'dockerwd')]){
        sh 'docker build -t mellitus/java-web-app:latest . '
        sh "docker login -u mellitus -p ${dockerwd}"
        sh "docker push mellitus/java-web-app:latest"
    }
}