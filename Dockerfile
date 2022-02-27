FROM openjdk:8
ADD target/springboot-docket.jar springboot-docket.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","springboot-docket.jar"]