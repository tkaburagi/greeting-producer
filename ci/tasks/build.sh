#!/bin/sh
cd greeting-producer
./mvnw clean package
mv target/*.jar ../build/greeting-producer.jar
#mv target/*.jar ../build/greeting-producer.jar