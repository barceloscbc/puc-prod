# Laboratório PUC - Oferta 5 - PPDS - Aula 02

Implementação de uma boa API
04. Considere um SEBO virtual, i.e., um local onde pessoas podem
compartilhar livros e revistas para empréstimo. Uma pessoa pode indicar que
tem livros disponíveis para empréstimo, solicitar empréstimos de outras
pessoas ou confirmar o empréstimo de um livro de sua propriedade. As
pessoas também poderão estabelecer vínculos com outras pessoas da rede,
similar a uma rede social e estabelecer grupos de amigos que compartilhem
interesses comuns como livros de ficção científica ou quadrinhos da Marvel.
A interface de consulta de livros deve ser bem flexível, como por exemplo
suporte de pesquisas por título, autor, editora, entre outros atributos de um
livro.
Os requisitos primários da sua aplicação estão abaixo.
- Inserir um novo cliente
- Alterar os dados de um novo cliente
- Remover um novo cliente
- Pesquisar clientes já existentes
- Inserir uma novo revista/livro para empréstimo
- Alterar os dados de um revista/livro
- Remover uma revista/livro
- Pesquisar revista/livros
- Adicionar um novo amigo
- Remover um amigo
- Confirmar um empréstimo
- Finalizar um empréstimo

Você deve projetar esta aplicação como um conjunto de micro-serviços.
Cada micro-serviço deve ter um tema específico, ser organizado em um
projeto independente no Eclipse e poder ser disparado ou parado de forma
independente. É esperado que cada micro-serviço forneça uma API REST
para consumo.

## Docker
- docker pull barceloscbc/puc-prod
- docker run -d --name puc-prod -p  9090:8080 -p 9091:8081 -p 9092:8082 -p 9093:8083 of05/aswdb

## Acessado Amigo Micro Service
  - http://< ip docker >:9090/
  
## Acessado Cliente Micro Service
  - http://< ip docker >:9091/  
  
## Acessado Empréstimo Micro Service
  - http://< ip docker >:9092/   
  
## Acessado Publicação Micro Service
  - http://< ip docker >:9093/    
