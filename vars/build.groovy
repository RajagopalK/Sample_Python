#!/usr/bin/groovy
def call(body) {
    // evaluate the body block, and collect configuration into the object
	// configParameters(artifactType,artifactTypeZip)
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    def msg = pipelineParams.get("msg", "Hello World")
	
if(msg.equals("Gradle")) {
    stage('GRADLE_BUILD') {
	     try{
	    node{
      		bat 'gradle clean build'
	    }
	     }
	    catch(Exception e)
{
     e.printStackTrace()
}
}
   }
else if(msg.equals("Maven")) {
	 stage('MAVEN_BUILD') {
           	bat 'mvn clean install'
    }
 }
}
