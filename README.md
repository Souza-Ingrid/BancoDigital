# 💳 Banco Digital com Java (POO)

![Java](https://img.shields.io/badge/Java-17+-orange)
![Status](https://img.shields.io/badge/status-concluído-brightgreen)
![DIO](https://img.shields.io/badge/DIO-Desafio-blue)

---

## 📌 Descrição

Este projeto foi desenvolvido como parte de um desafio prático da plataforma **Digital Innovation One (DIO)**, com o objetivo de aplicar na prática os conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando Java.

A proposta consiste na criação de um sistema simples de banco digital, simulando operações bancárias reais como depósito, saque, transferência e emissão de extratos.

---

## 🎯 Objetivo do desafio

Reforçar conceitos essenciais de POO por meio da construção de um sistema bancário, explorando:

* Modelagem de domínio
* Organização de código
* Reutilização de lógica
* Boas práticas de desenvolvimento

---

## 🧠 Conceitos de POO aplicados

### 🔹 Abstração

* Classe `Conta` definida como abstrata
* Método abstrato `imprimirExtrato()`

### 🔹 Encapsulamento

* Atributos privados
* Acesso controlado via getters

### 🔹 Herança

* `ContaCorrente` e `ContaPoupanca` herdam de `Conta`

### 🔹 Polimorfismo

* Sobrescrita do método `imprimirExtrato()`
* Uso de referência genérica (`Conta`)

---

## ⚙️ Funcionalidades

✔️ Criar cliente
✔️ Criar contas bancárias
✔️ Depositar valores
✔️ Sacar valores
✔️ Transferir entre contas
✔️ Exibir extrato bancário

---

## 🏗️ Estrutura do projeto

```bash id="g9l8q1"
br.com.bancodigital
├── Cliente.java
├── Conta.java
├── ContaCorrente.java
├── ContaPoupanca.java
└── Main.java
```

---

## 🔄 Fluxo da aplicação

1. Criação de um cliente
2. Criação de contas (corrente e poupança)
3. Depósito em conta corrente
4. Transferência para conta poupança
5. Impressão dos extratos

---

## 💻 Tecnologias utilizadas

* Java
* IntelliJ IDEA
* Paradigma Orientado a Objetos (POO)

---

## ▶️ Como executar o projeto

### 1. Clone o repositório

```bash id="k12v0p"
git clone https://github.com/Souza-Ingrid/BancoDigital.git
```

### 2. Acesse a pasta do projeto

```bash id="ydq7xk"
cd banco-digital
```

### 3. Abra no IntelliJ IDEA

### 4. Execute a classe `Main`

---

## 📌 Exemplo de saída

```bash id="l7j4s2"
=== Extrato Conta Corrente ===
Cliente: Ingrid
Agencia: 1
Conta: 1001
Saldo: 300.0

=== Extrato Conta Poupança ===
Cliente: Ingrid
Agencia: 1
Conta: 2001
Saldo: 200.0
```

---

## 🧩 Diagrama conceitual (simplificado)

```bash id="7mw4od"
Cliente
   │
   ▼
 Conta (abstract)
   ▲
   │
 ├───────────────┐
 │               │
ContaCorrente  ContaPoupanca
```

---

## 🚀 Melhorias futuras

* [ ] Criar classe `Banco`
* [ ] Gerar número de conta automaticamente
* [ ] Implementar histórico de transações
* [ ] Adicionar tratamento de exceções
* [ ] Criar interface gráfica (GUI)
* [ ] Persistência de dados (arquivo ou banco)

---

## 📚 Sobre o desafio

Este projeto foi proposto pela **Digital Innovation One (DIO)** como prática para consolidação dos conceitos de Programação Orientada a Objetos em Java, utilizando um contexto próximo do mundo real (sistema bancário).

---

## 👩‍💻 Autora

**Ingrid Souza**

---

## 📎 Licença

Este projeto foi desenvolvido para fins educacionais.
