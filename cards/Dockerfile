FROM openjdk:17-slim
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY target/cards.jar cards.jar
EXPOSE 8080
CMD ["java","-jar","accounts.jar"]