FROM gradle:7.0-jdk11 AS BUILDER
WORKDIR /BUILD/
COPY . .
RUN gradle bootJar -x test



FROM openjdk:11-jdk-slim
LABEL maintainer="farsheedM"

RUN groupadd -r backend-demo && \
    useradd --no-log-init -r -g backend-demo backend-demo && \
    mkdir -p /app

COPY --from=BUILDER /BUILD/build/libs/demo-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]