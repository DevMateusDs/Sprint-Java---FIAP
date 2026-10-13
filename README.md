# 🛡️ Sprint 4 (Backend) - Metaindústria: API REST de Riscos Industriais

API REST desenvolvida em Spring Boot para o gerenciamento de alertas de segurança industrial gerados por sistemas de visão computacional. O sistema gerencia o ciclo completo de CRUD para os registros de risco.

---

## 👥 Integrantes da Equipe & RMs (FIAP)
* **Mateus de Souza Santos** - RM559118
* **Arthur Bergamaço Alves** - RM556207
* **Breno Barbosa Pereira** - RM555348
* **Leonardo Medeiros da Silva** - RM559220
* **Renan Melo Rosemberg** - RM558535
* **Pietro Rodriguez Medeiros** - RM555899

---

## 🔗 Repositórios do Projeto
* **Repositório Frontend (React Native):** [https://github.com/DevMateusDs/Sprint2-ReactNative](https://github.com/DevMateusDs/Sprint2-ReactNative)
* **Repositório Backend (Spring Boot):** [https://github.com/DevMateusDs/Sprint-Java---FIAP](https://github.com/DevMateusDs/Sprint-Java---FIAP)

---

## 🚀 Tecnologias Utilizadas
* **Java 17**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **Banco H2** (Persistência em arquivo)
* **Maven**

---

## 🔌 Endpoints Disponíveis
* `GET /alertas` - Lista todos os registros de alertas.
* `GET /alertas/{id}` - Busca um alerta específico por ID.
* `POST /alertas` - Cadastra um novo alerta de risco industrial.
* `PUT /alertas/{id}` - Atualiza um registro existente.
* `DELETE /alertas/{id}` - Remove um registro do sistema.

---

## ⚙️ Como Executar o Backend
1. Clone este repositório e abra o projeto em sua IDE (IntelliJ, Eclipse, VS Code).
2. Certifique-se de que a porta `8080` está livre.
3. Execute a classe principal da aplicação Spring Boot.
4. O servidor estará rodando em: `http://localhost:8080`
5. Console H2 disponível em: `http://localhost:8080/h2-console`