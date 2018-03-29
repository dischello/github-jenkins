@NonCPS
def call(){
  def causes = currentBuild.rawBuild.getCauses()
  def specificCause = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause)
  echo "${specificCause}"
}
