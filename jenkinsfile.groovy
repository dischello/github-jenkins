node {
  stage 'Stage Upload To Fabric'
  def Cause = getLastBuildCause()
  echo "${Cause}"
}

@NonCPS
def getLastBuildCause() {
    def specificCause = hudson.model.CauseAction.getCauses()
    return specificCause
}
