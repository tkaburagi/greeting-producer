#!/bin/sh
cd greeting-producer
./mvnw clean package

ls -l target

mv target/*.jar ../build/greeting-producer.jar
#mv target/*.jar ../build/greeting-producer.jar