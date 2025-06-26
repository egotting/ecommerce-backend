# backend-ecommerce

**Projeto de e-commerce desenvolvido para fins didáticos, com foco na venda de teclados e componentes para teclados.
Utiliza arquitetura Hexagonal, DDD**

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- PostgreSQL

## Arquitetura

O projeto segue a arquitetura Hexagonal (Ports & Adapters) e os princípios do DDD (Domain-Driven Design), promovendo
separação de responsabilidades, testabilidade e flexibilidade.

## Objetivo

Proporcionar um ambiente de aprendizado prático sobre:

- Desenvolvimento de APIs RESTful
- Autenticação JWT
- Integração com banco de dados relacional
- Comunicação assíncrona entre microservices (RabbitMQ)
- Boas práticas de desenvolvimento backend

## Como executar

1. **Clone o repositório**
2. **Gere as chaves JWT**  
   Siga as instruções em `src/main/resources/keys/generate-ur-keys.md` para gerar as chaves pública e privada.
3. **Configure o banco de dados**  
   Renomeie o arquivo `src/main/resources/application-example.yml` para `application.yml` e coloque as
   credenciais do seu banco PostgreSQL.
5. **Instale as dependências e execute o projeto**
   ```bash
   ./mvnw spring-boot:run
   ```

## Estrutura do Projeto

- `src/main/java` — Código fonte da aplicação
- `src/main/resources` — Configurações e recursos (chaves, properties)
- `src/main/resources/keys` — Chaves para autenticação JWT

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções ou sugestões.

---

Projeto para fins didáticos.

```
