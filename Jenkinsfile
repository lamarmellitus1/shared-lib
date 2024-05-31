#!/usr/bin/env groovy
@Library("shared-library") _
pipeline{
    agent any
    tools{
        maven 'm3'

    }
    stages{
        stage('maven build'){
            steps{
                script{
                    buildjar()
            }
        }
        }
        stage('deploying to dockerhub'){
            steps{
                script{
                    buildImage()
                }

            }
        }
        stage('deploy'){
            steps{
             script{
                  gv.deploy()
            }
        }
        }
    }
}
