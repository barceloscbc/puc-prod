8 lines (7 sloc)  469 Bytes
#!/bin/bash

mvn package
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dserver.port=8080 -jar /code/AmigoMicroService/target/Amigo-0.0.1-SNAPSHOT.jar;
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dserver.port=8081 -jar /code/ClienteMicroService/target/Cliente-0.0.1-SNAPSHOT.jar;
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dserver.port=8082 -jar /code/EmprestimoMicroService/target/Emprestimo-0.0.1-SNAPSHOT.jar;
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dserver.port=8083 -jar /code/PublicacaoMicroService/target/Publicacao-0.0.1-SNAPSHOT.jar;