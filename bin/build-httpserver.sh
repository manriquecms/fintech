#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
CURRENT="$(pwd)"
cd $DIR/..

VERSION=$(mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec)

cd httpserver
docker build --build-arg VERSION="$VERSION" -t "httpserver:$VERSION" .


cd $CURRENT > /dev/null
