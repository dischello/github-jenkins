node {
  stage 'Stage Upload To Fabric'
  def Cause = getLastBuildCause()
  echo "${Cause}"
}

@NonCPS
def getLastBuildCause() {
    def causes = currentBuild.rawBuild.getCauses()
    return causes.last()
}
