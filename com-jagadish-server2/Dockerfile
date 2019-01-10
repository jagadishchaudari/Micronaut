FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/com-jagadish-server2*.jar com-jagadish-server2.jar
CMD java ${JAVA_OPTS} -jar com-jagadish-server2.jar