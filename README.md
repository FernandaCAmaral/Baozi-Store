# 🥟 Baozi Store - API de Gestão de Clientes

Este projeto é uma **API REST** desenvolvida para o Trabalho Desenvolvimento Web BackEnd. O sistema permite o gerenciamento completo (CRUD) de clientes para a loja **Baozi Store**, utilizando as melhores práticas de desenvolvimento Java.

## 🚀 Tecnologias Utilizadas
* **Java 21** 
* **Spring Boot**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória/arquivo)
* **Maven** (Gerenciador de dependências)
* **Postman** (Testes de endpoints)

## 🛠️ Funcionalidades
A API segue os padrões REST, oferecendo os seguintes recursos:

* Clientes
**POST /clientes:** Cadastra um novo cliente (incluindo Nome e RU para fins acadêmicos).

**GET /clientes:** Lista todos os clientes.

**GET /clientes/{id}:** Consulta um cliente por ID.

**DELETE /clientes/{id}:** Remove um cliente.

* Produtos
**POST /produtos:** Registra produtos com nome, preço e status de estoque.

**GET /produtos:** Lista o catálogo de produtos.

* Pedidos
**POST /pedidos:** Realiza um pedido vinculando o ID do Cliente ao ID do Produto.

**GET /pedidos:** Histórico geral de vendas.

## 📁 Estrutura do Projeto
* `src/main/java/com/uninter/demo`: Contém o código fonte (Controller, Model e Repository).
* `src/main/resources`: Configurações do banco de dados H2 (`application.properties`).
* `pom.xml`: Configurações do Maven e dependências.

## ⚙️ Como Executar
1. Clone o repositório:
   Bash
   git clone https://github.com/seu-usuario/baozi-store-api.git
2. Importe o projeto na sua IDE (Eclipse).
4. Execute a classe principal `DemoApplication.java.`
5. Acesse o console do banco de dados em: `http://localhost:8080/h2-console`
   -JDBC URL: jdbc:h2:file:./data/exemplo
   -User: sa | Pass: (vazio)


**Desenvolvido por:** Fernanda Cunha do Amaral
**Instituição:** Uninter - 2026


