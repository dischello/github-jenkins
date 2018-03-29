node {
  stage('Stage Upload To Fabric'){
  def buildLog = currentBuild.rawBuild.log
  echo "currentBuild.rawBuild.log"
  cause = "${buildLog}"
    echo "${buildlog}
  echo cause
  }
}

