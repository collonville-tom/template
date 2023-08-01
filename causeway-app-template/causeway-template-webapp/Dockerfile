FROM openjdk:11-slim-buster

RUN mkdir -p /app/config

ENV JAVA_OPTS="-DPROTOTYPING=false"
ENV JAR_NAME=""
ENV APP_YML_NAME=""

COPY ./target/${JAR_NAME} /app
COPY ./src/main/resources/${APP_YML_NAME} /app/config
COPY ./src/main/resources/log4j2-spring.xml /app/config

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dlogging.config=classpath:file:///app/config/log4j2-spring.xml -Dspring.config.location=file:///app/config/${APP_YML_NAME} -jar /app/${JAR_NAME}  "]