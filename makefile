deploy:
	mvn install org.codehaus.sonar:sonar-dev-maven-plugin::start-war -Dsonar.runtimeVersion=3.3

run:
	mvn sonar:sonar