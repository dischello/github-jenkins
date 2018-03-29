@NonCPS
def call() {
//def startedByTimer = false
def isStartedByUser = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause).properties
println isStartedByUser "{$isStartedByUser}"
return isStartedByUser
/*
try {
        def buildCauses = currentBuild.rawBuild.getCauses(hudson.model.Cause$UserIdCause)
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
    */
}

