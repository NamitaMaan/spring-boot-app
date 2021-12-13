FROM adoptopenjdk:11-jre-hotspot-bionic
ADD /target/order-0.0.1-SNAPSHOT.jar order.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar" , "order.jar"]
