#!/bin/sh
cd greeting-producer
ls -laR ~/.m2

./mvnw test -Dtest=GreetingProducerApplicationTests

ls -laR ~/.m2