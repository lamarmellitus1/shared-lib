#!/usr/bin/env groovy
library identifier: 'jenkins-shared-library@main', retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://github.com/lamarmellitus1/shared-lib.git',
         credentialsId: 'github'
        ]
)


def gv
pipeline{
    agent any
    tools{
        maven 'm3'

    }
    stages{
        stage('init'){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
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
