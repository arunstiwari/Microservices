1. Build it by running mvn clean package

2. Run it by running java -jar target/maven-shade-0.0.1.jar 

3. Test it by running following command 
	
	curl -H "Content-Type: application/json" -X POST -d '{"timestamp": 1468203975, "userId": "f1196aac-470e-11e6-beb8-9e71128cae77", "latitude": 41.803488, "longitude": -88.144040}' http://localhost:4567/geolocation

	{"latitude":	41.803488,"longitude":-88.14404,"userId":"f1196aac-470e-11e6-beb8-9e71128cae77","timestamp":1468203975}
