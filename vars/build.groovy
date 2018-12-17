#!/usr/bin/groovy
def call(body) {
    // evaluate the body block, and collect configuration into the object
	// configParameters(artifactType,artifactTypeZip)
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    def msg = pipelineParams.get("msg", "Hello World")
	try{
if(msg.equals("Gradle")) {
    stage('GRADLE_BUILD') {
	  
      	bat 'gradle clean build'

	}
   }
else if(msg.equals("Maven")) {
	 stage('MAVEN_BUILD') {
			bat 'echo "Hello, ${WORKSPACE}."'
           	bat 'mvn -f C:\Users\670334\.jenkins\workspace\pipeline-project\pom.xml clean install'
    }
} catch(Exception e) {
     e.printStackTrace()
	}
}
