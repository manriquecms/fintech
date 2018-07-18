#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/../openfintech

mvn clean install -Ppackage

cd - > /dev/null
