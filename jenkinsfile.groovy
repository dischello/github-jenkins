node {
  stage('Stage Upload To Fabric'){
  getLastBuildCause()
  }
}

@NonCPS
def getLastBuildCause() {
    def causes = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause).properties
    return causes
}
