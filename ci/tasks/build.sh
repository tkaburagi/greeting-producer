#!/bin/sh
cd greeting-producer
./mvnw clean package

ls -l target

mv target/greeting-producer-0.0.1-SNAPSHOT.jar ../build/greeting-producer.jar
#mv target/*.jar ../build/greeting-producer.jar