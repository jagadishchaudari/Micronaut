FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/com-jagadish-server1*.jar com-jagadish-server1.jar
CMD java ${JAVA_OPTS} -jar com-jagadish-server1.jar