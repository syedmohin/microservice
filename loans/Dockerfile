FROM openjdk:17-slim
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY target/loans.jar loans.jar
EXPOSE 8081
CMD ["java","-jar","accounts.jar"]