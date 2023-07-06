FROM openjdk:20-jdk-alpine
WORKDIR /app

COPY . .

RUN ./mvnw install --also-make -DskipTests --batch-mode --no-transfer-progress

EXPOSE 5000
CMD ./mvnw  -am spring-boot:run