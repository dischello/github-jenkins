@NonCPS
def call(){
  def build = hudson.model.Cause.toString()   // "manager" for Groovy Postbuild plugin, only
  //def usercause=build.getCause(hudson.model.Cause$UserCause)
  //def thename=usercause.userName
  echo "${build}"
  println build
}
