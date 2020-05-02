FROM openjdk:8
EXPOSE 8081
ADD target/security-jwt-0.0.1-SNAPSHOT.jar security-jwt-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/security-jwt-0.0.1-SNAPSHOT.jar"]