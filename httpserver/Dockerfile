FROM fintechbase:0.1.0-SNAPSHOT

ARG VERSION

COPY target/httpserver-${VERSION}-jar-with-dependencies.jar /httpserver.jar

CMD ["/root/.sdkman/candidates/java/current/bin/java","-jar","/httpserver.jar"]
