@Library('test-libs@master') _

pipeline {
  agent any
  stages{
    stage ('Test::Build::Cause'){
      steps{
        echo "Build will be start with init"
        isJobStartedByTimer()
      }
    }
  }
}
