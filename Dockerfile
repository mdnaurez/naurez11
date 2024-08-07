FROM openjdk:11.0
COPY target/naurez11-0.0.1-SNAPSHOT.jar naurez11-0.0.1-SNAPSHOT.jar
CMD java -jar naurez11-0.0.1-SNAPSHOT.jar
