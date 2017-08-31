FROM openjdk:8
RUN mkdir -p /opt/geolocation
ADD target/SpringBootGeolocation-0.0.1.jar /opt/geolocation/geolocation.jar
EXPOSE 8080
CMD ["java", "-jar", "/opt/geolocation/geolocation.jar"]