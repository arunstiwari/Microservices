1. Build it by running mvn clean package spring-boot:run

2. Test it by running following command 
	
	curl -H "Content-Type: application/json" -X POST -d '{"timestamp": 1468203975, "userId": "f1196aac-470e-11e6-beb8-9e71128cae77", "latitude": 41.803488, "longitude": -88.144040}' http://localhost:8080/geolocation

	Output should be : {"latitude":	41.803488,"longitude":-88.14404,"userId":"f1196aac-470e-11e6-beb8-9e71128cae77","timestamp":1468203975}

3. Test the GET endpoint by running following command

	curl -X GET http://localhost:8080/geolocation
	
	Output should be : {"latitude":	41.803488,"longitude":-88.14404,"userId":"f1196aac-470e-11e6-beb8-9e71128cae77","timestamp":1468203975}