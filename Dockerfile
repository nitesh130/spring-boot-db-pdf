FROM ubuntu
MAINTAINER Nitesh Kumar, tunujai@gmail.com
RUN apt-get update
RUN apt-get install -y wget
RUN apt install -y openjdk-8-jdk
VOLUME /apps

RUN mkdir -p /app/nitesh/data
ADD spring-boot-db-pdf-1.0.jar /apps/data/
#CMD java -jar /apps/data/test-boot-1.0.jar
EXPOSE 8080
ENTRYPOINT java -jar /apps/data/spring-boot-db-pdf-1.0.jar
