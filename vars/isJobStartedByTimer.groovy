@NonCPS
def call(){
  //def causes = currentBuild.rawBuild.getCauses()
  //echo "${causes}"
  def specificCause = currentBuild.rawBuild.getCause(hudson.triggers.TimerTrigger.TimerTriggerCause).toString()
  echo "Cron trigger ${specificCause}"
}
