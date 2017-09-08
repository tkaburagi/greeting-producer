#!/bin/sh

set -e
cd repo
rm -rf ~/.m2
ln -fs $(pwd)/m2 ~/.m2

cd ../greeting-producer
ls -laR ~/.m2
sleep 5
# ./mvnw test -Dtest=GreetingProducerApplicationTests

# ls -laR ~/.m2