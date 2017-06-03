#!/bin/sh
cd demo-onlinestore-service
./mvnw clean package
mv target/*.jar ../build/demo-onlinestore-service.jar