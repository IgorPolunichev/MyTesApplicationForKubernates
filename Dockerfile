FROM openjdk:17
LABEL authors="LRUNB"


WORKDIR /app
COPY build/libs/MyTesApplicationForKubernates-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "MyTesApplicationForKubernates-0.0.1-SNAPSHOT.jar"]