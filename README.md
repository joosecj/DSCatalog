<h1 align="center">DSCatalog</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot  V2.7.3-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
    <img src="https://img.shields.io/badge/JWT-F2F4F9?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=black"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
</p>    

Projeto desenvolvido teve o objetivo de criar um API Rest e-commerce, utilizando os padrões de arquitetura em camadas, onde e possível cadastrar um cliente  com nível de autorização, e esse cliente pode cadastrar produtos (caso seja administrador) e selecionar produtos para o carrinho para realizar a compra, e foi o tratamento de suas exceções personalizadas.

<h2>Veja o projeto</h2>

Experimente live demo:

<p align='center'> <img src="https://i.imgur.com/r7Giga8.gif1"/></p>



<h2>Como criar e executar o DSCatalog localmente</h2>

Criar e executar o projeto em seu ambiente de desenvolvimento local é muito fácil. Certifique-se de ter o Git e JDK17 instalados e siga as instruções abaixo. Precisa de informações adicionais? entre em contato no e-mail josecarloscjj@gmail.com 
(Estas instruções pressupõem que você esteja instalando como um usuário root.)

- Clone o código fonte

   ```bash
   git@github.com:joosecj/DSCatalog.git
   ```

- Em sua IDE de preferência(utilizei Intellij), importe a pasta **backend** e faça o update das dependências do **maven**.

- Ao executar o projeto, pode ser acessado um navegador da Web em http://localhost:8080/


- *Product By Id* - **GET**

   ```bash
   http://localhost:8080/products/1
   ```
   ##

- *Product By Pagead* - **GET**

   ```bash
   http://localhost:8080/products?size=10&page=0&sort=name,asc
   ```

   ##

   - *Category By Id* - **GET**

   ```bash
   http://localhost:8080/categories/1
   ```
   ##

- *Category By Pagead* - **GET**

   ```bash
   http://localhost:8080/categories?size=10&page=0&sort=name,asc
   ```

   ##

   <h2>Tecnologias utlizadas</h2>

   - [Java](https://docs.oracle.com/en/java/javase/17/)
   - [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
   - [JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
   - [Maven](https://maven.apache.org/guides/)
   - [H2 Database](https://www.h2database.com/html/main.html)
   - [PostgreSQL](https://www.postgresql.org/docs/)
   - [Spring Security](https://docs.spring.io/spring-security/reference/index.html)
   - Teste Automatizados com [JUnit](https://junit.org/junit5/docs/current/api/)
   - [JWI Auth](https://jwt.io/)
   - [Postman](https://www.postman.com/api-documentation-tool/)

   ##

   
   <div align="center">
   <h2>Autor: José Carlos</h2>
      <img align="center" alt="Jose-Js" height="190" width="190" src="https://avatars.githubusercontent.com/u/100246121?s=400&u=b15a545fb2c49f97f84e25aa0520b8b525631384&v=4"
   </div>
   </br> 
   </br>
   <div align="center">
      <a href="https://instagram.com/joosecj" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
      <a href = "mailto:josecarloscjj@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
      <a href="https://www.linkedin.com/in/jos%C3%A9-carlos-a79736a0/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
   </div>