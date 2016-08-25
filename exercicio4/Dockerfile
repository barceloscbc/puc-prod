FROM java:8u91-jdk

# Install maven
RUN apt-get update  && \
    apt-get install -y maven

WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml  
RUN ["mvn", "dependency:resolve"]  
RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD AmigoMicroService /code/AmigoMicroService  
ADD ClienteMicroService /code/ClienteMicroService
ADD comum /code/comum
ADD EmprestimoMicroService /code/EmprestimoMicroService
ADD PublicacaoMicroService /code/PublicacaoMicroService
 
ADD build.sh /code/build.sh
RUN sed -i 's/\r//' /code/build.sh

EXPOSE 8080
EXPOSE 8081
EXPOSE 8082
EXPOSE 8083  
CMD ["./build.sh"] 