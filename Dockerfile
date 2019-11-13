FROM java:8
EXPOSE 7001
MAINTAINER TZHENG@163.com
ADD /target/t-eureka-0.0.1-SNAPSHOT.jar eureka.jar
ENTRYPOINT ['java','-jar','eureka.jar']