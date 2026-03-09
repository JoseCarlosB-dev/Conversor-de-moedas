# Conversor de Moedas em Java

Um projeto simples desenvolvido em **Java** que realiza conversões entre diferentes moedas utilizando uma **API de taxas de câmbio em tempo real**.

O objetivo deste projeto é praticar conceitos importantes de programação, como:

* Consumo de APIs
* Requisições HTTP
* Manipulação de JSON
* Interação com o usuário via console
* Organização e estruturação de projetos em Java

---

# Funcionalidades

* Conversão de valores entre moedas
* Menu interativo no terminal
* Consumo de API de taxas de câmbio
* Entrada de dados pelo usuário
* Exibição do valor convertido

---

# Tecnologias Utilizadas

* Java
* HttpClient
* Gson
* ExchangeRate API

---

# Estrutura do Projeto

```
src
 └── main
      └── java
           ├── Main.java
           ├── ApiClient.java
           ├── ConversorMoeda.java
           └── modelos
```

## Descrição dos Arquivos

| Arquivo               | Descrição                                            |
| --------------------- | ---------------------------------------------------- |
| `Main.java`           | Classe principal responsável por iniciar o programa  |
| `ApiClient.java`      | Responsável por realizar requisições HTTP para a API |
| `ConversorMoeda.java` | Contém a lógica de conversão das moedas              |
| `modelos`             | Classes que representam os dados retornados pela API |

---

# Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
```

## 2. Abrir o projeto

Abra o projeto em uma IDE Java, por exemplo:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

## 3. Executar o programa

Execute o arquivo:

```
Main.java
```

---

# Exemplo de Uso

Ao executar o programa, será exibido um menu semelhante a este:

```
**************************************
        Conversor de Moedas

1 - Dólar → Real
2 - Real → Dólar
3 - Euro → Real
4 - Real → Euro
5 - Sair

Escolha uma opção:
**************************************
```

Depois basta digitar o valor que deseja converter.

---

# API Utilizada

Este projeto utiliza uma API de taxas de câmbio para obter valores atualizados das moedas em tempo real.
