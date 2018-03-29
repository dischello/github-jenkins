node {
  stage('Stage Upload To Fabric'){
  def buildLog = currentBuild.rawBuild.log
  echo "currentBuild.rawBuild.log"
  cause = "${buildLog}"
  println buildlog
  
  }
}

@NonCPS
def getLastBuildCause() {
    def causes = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause).properties
    return causes
}
