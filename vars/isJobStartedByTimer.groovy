@NonCPS
def call(){
  //def causes = currentBuild.rawBuild.getCauses()
  //echo "${causes}"
  def specificCause = currentBuild.rawBuild.getCause(hudson.triggers.TimerTrigger.TimerTriggerCause).toString() != null
  echo "Cron trigger ${specificCause}"
}
