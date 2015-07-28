#!/bin/bash
export DISPLAY=:0
java -jar selenium-creator.jar "$1"
mvn clean test -fae