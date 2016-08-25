8 lines (7 sloc)  469 Bytes
#!/bin/bash

mvn package
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -jar /code/AmigoMicroService/target/Amigo-0.0.1-SNAPSHOT.jar;
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -jar /code/ClienteMicroService/target/Cliente-0.0.1-SNAPSHOT.jar;
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -jar /code/EmprestimoMicroService/target/Emprestimo-0.0.1-SNAPSHOT.jar;
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -jar /code/PublicacaoMicroService/target/Publicacao-0.0.1-SNAPSHOT.jar;