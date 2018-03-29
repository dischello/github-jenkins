node {
  stage 'Stage Upload To Fabric'
  def Cause = getLastBuildCause()
  echo "${Cause}"
}

@NonCPS
def getLastBuildCause() {
    def specificCause = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause)
    return specificCause
}
