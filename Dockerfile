FROM openjdk:20-ea-7-jdk-slim-bullseye
EXPOSE 9091
ADD /target/cowin-0.0.1-SNAPSHOT.jar cowin-backend.jar
ENTRYPOINT ["java","-jar","cowin-backend.jar"]]