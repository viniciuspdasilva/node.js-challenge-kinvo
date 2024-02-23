> ![Logo Kinvo](https://github.com/cbfranca/kinvo-front-end-test/blob/master/logo.svg)


# Kinvo - Desafio Back-end

## Instruções

- Utilize Typescript com Node;
- Desenvolva uma API REST ou GraphQL;
- Fique à vontade para escolher as libs, arquitetura, frameworks, banco de dados e etc.;
- Crie um arquivo README com instruções para executar seu projeto;
- Crie a collection do Insomnia ou Postman, salve com o nome "collection".

## Contexto

Um estudante a fim de poupar gastos e controlar suas finanças pessoais resolveu desenvolver um aplicativo para lhe ajudar nessa missão. Após um estudo de caso ele mapeou as seguintes funcionalidades:

- Criação da movimentação (receitas e despesas);
- Atualização da movimentação;
- Exclusão da movimentação;
- Listagem de movimentações;
- Exibição do saldo.

## Requisitos

### Desenvolvedor Júnior

- Filtro na listagem de movimentações por data (data inicial e data final);
- Paginação na listagem de movimentações.

### Desenvolvedor Pleno

- Todos os requisitos do Júnior;
- API Rest semântica (se escolheu desenvolver uma API Rest);
- Arquitetura minimamente escalável;
- Cobertura mínima de testes automatizados.

### Desenvolvedor Sênior

- Todos os requisitos do Pleno;
- Autenticação:
  - Cadastro de usuário;
  - Login;
  - Necessidade do usuário estar autenticado para a realização das atividades citadas no contexto.
- Dockerizar a aplicação;
- Boas práticas de POO (Exemplos: SOLID, Design Patterns, etc.).

### Diferenciais

- Cache;
- Segurança da aplicação;
- Deploy.

## Dicas

- Se optar por uma API REST, tenha cuidado ao definir as rotas e verbos HTTP: faça uso de boas práticas;
- Crie uma aplicação flexível, ou seja, que seja fácil incluir novas funcionalidades;
- Clean Code: o código deve ser fácil de entender;
- Atente-se a boas práticas de versionamento.

## Processo de submissão

1. Faça o fork deste repositório;
2. Faça seu projeto neste fork;
3. Suba as alterações para o seu fork;
4. Submeta uma PR para este repositório.

## Observações:

* O cumprimento dos requisitos solicitados para uma vaga em determinado nível não é garantia de aprovação. <strong>Focamos em avaliar a forma como os requisitos foram cumpridos.</strong>
* Apesar da listagem de requisitos mínimos acima, caso não tenha tido tempo suficiente ou tenha se esbarrado em alguma dificuldade, entregue o desafio ainda que incompleto e conte-nos na descrição do pull request quais foram as suas maiores dificuldades. Não se preocupe, avaliaremos ainda assim! :)
* Está com alguma dificuldade, encontrou algum problema no desafio ou tem alguma sugestão pra gente? Crie uma issue e descreva o que achar necessário ou entre em contato.

### Boa sorte! 🍀


# code-with-quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
