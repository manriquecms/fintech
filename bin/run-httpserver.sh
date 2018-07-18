#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
CURRENT="$(pwd)"
cd $DIR/..

VERSION=$(mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec)

docker rm -f $(docker ps -q -a --filter name=fintech-httpserver)

docker run -d --name fintech-httpserver -p 0.0.0.0:8090:8090 --net devfintech "httpserver:$VERSION"
#docker run -d --name fintech-httpserver -p 8090 --net host "httpserver:$VERSION"


cd $CURRENT > /dev/null
