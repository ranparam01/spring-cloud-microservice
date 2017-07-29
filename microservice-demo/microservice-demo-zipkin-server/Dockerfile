FROM ewolff/docker-java
ADD target/microservice-demo-zipkin-server-0.0.1-SNAPSHOT.jar .
CMD /usr/bin/java -Xmx100m -Xms100m -jar microservice-demo-zipkin-server-0.0.1-SNAPSHOT.jar
EXPOSE 9411
