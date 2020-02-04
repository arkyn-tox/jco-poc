Prerequities:
* Create instance of the Connectivity-service called `jco_poc_connection_service`
* Create instance of the Destination-service called `jco_poc_destination_service`

Building and deploying
* Build package: `mvn clean compile package`
* Push to CF: `cf push -f manifest.yml -p target/jco-poc-1.0-SNAPSHOT.jar`
