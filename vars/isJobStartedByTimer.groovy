@NonCPS
def call(){
  def build = manager.build   // "manager" for Groovy Postbuild plugin, only
  def usercause=build.getCause(hudson.model.Cause$UserCause)
  def thename=usercause.userName
  println thename
}
