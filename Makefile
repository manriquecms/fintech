#Compile
compile-fintech:
	bin/compile-fintech.sh
compile-httpserver:
	bin/compile-httpserver.sh
compile-openfintech:
	bin/compile-openfintech.sh


#Build images
build-httpserver:
	bin/build-httpserver.sh
build-baseimage: 
	bin/build-baseimage.sh


#Run modules
run-httpserver:
	bin/run-httpserver.sh


#Run dependencies
run-consul:
	bin/run-consul.sh

#All
all-httpserver: compile-httpserver build-httpserver run-httpserver	
