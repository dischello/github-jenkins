node {
  stage 'Stage Upload To Fabric'
  def getLastBuildCause = def getLastBuildCause()
  echo "${getLastBuildCause}"
}

@NonCPS
def getLastBuildCause() {
    def causes = currentBuild.rawBuild.getCauses()
    return causes.last()
}
