FROM centos:7

ARG VERSION

#RUN yum install -y epel-release
#RUN yum install -y ansible \
#        wget \
#        net-tools \
#        vim \
#        openssh-clients \
#        bind \
#        bind-utils \
RUN yum install -y unzip \
	zip \
	which

RUN curl -s "https://get.sdkman.io" | bash
RUN /bin/bash -c "source /root/.sdkman/bin/sdkman-init.sh ; sdk install java 10.0.0-openjdk ; sdk install scala 2.12.6"

