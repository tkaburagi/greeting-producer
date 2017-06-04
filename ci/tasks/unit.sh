#!/bin/sh
cd greeting-producer
./mvnw test -Dtest=GreetingProducerApplicationTests

 ls -ltR