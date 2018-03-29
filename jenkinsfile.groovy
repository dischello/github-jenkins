node {
  stage 'Stage Upload To Fabric'
  getLastBuildCause()
}

@NonCPS
def getLastBuildCause() {
    def causes = currentBuild.causes[0]
    return causes
}
