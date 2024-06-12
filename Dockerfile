FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_PetCare_Backend_Amogha_213 backend_PetCare_Backend_Amogha_213
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_PetCare_Backend_Amogha_213/target/PetCare_Backend_Amogha-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar PetCare_Backend_Amogha-0.0.1-SNAPSHOT.jar"]