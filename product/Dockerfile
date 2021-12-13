FROM adoptopenjdk:11-jre-hotspot-bionic
ADD /target/productsjpa-0.0.1-SNAPSHOT.jar products.jar
EXPOSE 8082
ENTRYPOINT [ "java", "-jar" , "products.jar"]
