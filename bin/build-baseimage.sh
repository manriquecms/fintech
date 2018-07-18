#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
CURRENT="$(pwd)"
cd $DIR/../baseimage

VERSION=$(cat VERSION)

docker build --build-arg VERSION="$VERSION" -t "fintechbase:$VERSION" .


cd $CURRENT > /dev/null
