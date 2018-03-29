@Library('test-libs@master') 
pipeline {
  agent any
  triggers {
        cron('* * * * *')
    }
  stages{
    stage ('Test::Build::Cause'){
      steps{
        echo "Build will be start with init"
        isJobStartedByTimer()
      }
    }
  }
}
/* check if the job was started by a timer
//@NonCPS
def isJobStartedByTimer() {
    def startedByTimer = false
    try {
        def buildCauses = currentBuild.rawBuild.getCauses()
        for ( buildCause in buildCauses ) {
            if (buildCause != null) {
                def causeDescription = buildCause.getShortDescription()
                echo "shortDescription: ${causeDescription}"
                if (causeDescription.contains("Started by timer")) {
                    startedByTimer = true
                }
            }
        }
    } catch(theError) {
        echo "Error getting build cause"
    }

    return startedByTimer
}
*/
