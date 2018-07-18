#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR/..

EXISTS_CONSUL=$(docker ps -q -a --filter name=consul-server)

if [ -n $EXISTS_CONSUL ]; then
	docker rm -f $EXISTS_CONSUL
fi

docker run -d --name=consul-server \
	--net devfintech \
	-p 0.0.0.0:8500:8500 \
	-e CONSUL_BIND_INTERFACE=eth0 \
	-e CONSUL_LOCAL_CONFIG='{
		"datacenter":"devdc",
		"server":true,
		"enable_debug":true
	}' \
	consul:1.2.0



cd - > /dev/null
