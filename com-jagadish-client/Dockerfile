FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/com-jagadish-client*.jar com-jagadish-client.jar
CMD java ${JAVA_OPTS} -jar com-jagadish-client.jar