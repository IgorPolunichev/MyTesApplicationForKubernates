FROM openjdk:17
LABEL authors="LRUNB"


WORKDIR /app
COPY build/libs/MyTesApplicationForKubernates-0.0.1-SNAPSHOT.jar /app
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "MyTesApplicationForKubernates-0.0.1-SNAPSHOT.jar"]