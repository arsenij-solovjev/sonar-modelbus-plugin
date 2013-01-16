URI = http://openstoryboards.org/test/SampleMetrics.smm
FILENAME = SampleMetrics.smm

install:
	mvn install assembly:single
	
checkin:
	java -jar target/sonar-modelbus-client-0.0.1-SNAPSHOT-jar-with-dependencies.jar checkin $(URI) $(FILENAME)
	
checkout:
	java -jar target/sonar-modelbus-client-0.0.1-SNAPSHOT-jar-with-dependencies.jar checkout $(URI) $(FILENAME)