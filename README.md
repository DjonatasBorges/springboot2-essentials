# Spring Boot 2 Essentials By DevDojo

Este projeto trata da execução da prática das aulas do Curso do DevDojo.
[Spring Boot 2 Essentials](https://www.youtube.com/watch?v=bCzsSXE4Jzg&list=PL62G310vn6nFBIxp6ZwGnm8xMcGE3VA5H)

Decidi colocar o projeto em git e github após um bom tempo do início do curso. A partir de hoje este projeto receberá 
commits a cada aula nova assistida.

Caso queira clonar e executar o projeto seguirão alguns passos abaixo.

Sugiro a instalação do SDKMAN para gerenciar versões paralelas de vários kits de desenvolvimento de software.
Para mais informações e uso dele, clique no link que redirecionará para o site [SDKMAN](https://sdkman.io/).


1. Clone o projeto para seu computador.
2. Abra seu projeto na IDE de sua preferência. (Minha Preferência é IntelliJ)
3. Abra o terminal na raiz do projeto e digite o seguinte comando: `mvn install`
4. Após devemos subir o docker-compose para que o banco de dados fique disponível para uso. 
No caso desse projeto estou usando MySQL. Use o comando `docker-compose up` ou `docker-compose up -d` 
caso queira utilizar o mesmo terminal.
5. Agora é só rodar o projeto. Vá para `/src/main/java/academy/devdojo/springboot2/Springboot2EssentialsApplication.java`
 e clique em `run`.
6. Após esse comando o projeto já esta de pé e pronto para uso.