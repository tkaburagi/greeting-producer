#!/bin/sh
cd greeting-producer
 
 ln -s `pwd`/../maven-cache ~/.m2/repository

./mvnw test -Dtest=GreetingProducerApplicationTests