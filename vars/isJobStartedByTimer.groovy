@NonCPS
def call(){
  def causes = currentBuild.rawBuild.getCauses()
  echo "${causes}"
  def specificCause = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause) != null
  echo "${specificCause}"
}
