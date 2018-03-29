node {
  stage 'Stage Upload To Fabric'
  printCausesRecursively()
}

@NonCPS
def printCausesRecursively(cause) {
     if (cause.class.toString().contains("UpstreamCause")) {
         println "This job was caused by " + cause.toString()
         for (upCause in cause.upstreamCauses) {
             printCausesRecursively(upCause)
         }
     } else {
         println "Root cause : " + cause.toString()
     }
}

for (cause in manager.build.causes)
{
    printCausesRecursively(cause)
}
