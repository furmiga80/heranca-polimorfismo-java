# Herança e Polimorfismo em Java

Sistema em Java que aplique herança, reescrita de métodos, polimorfi smo e classes e métodos abstratos, conforme os Capítulos 9 (Herança, Reescrita e Polimorfi smo) e 10 (Classes Abstratas) da apostila Caelum FJ-11, aplicando também boas práticas de organização de código e versionamento com Git/GitHub..

## Estrutura

```
src
└── funcionarios
├── app
│ └── ProgramaFuncionario.java
│
├── model
│ ├── Funcionario.java
│ ├── Programador.java
│ ├── Gerente.java
│ ├── Diretor.java
│ └── Estagiario.java
│
└── service
└── ControleDeBonificacoes.java

```

## Classes

- **Funcionario**: classe abstrata com nome, CPF, salário e a porcentagem da bonificação.
- **Programador**: herda de Funcionario e tem a linguagem.
- **Gerente**: herda de Funcionario, tem senha e o método `autentica()`.
- **Diretor**: herda de Gerente.
- **Estagiario**: herda de Funcionario e tem a instituição.
- **ControledeBonificacao**: soma a bonificação de todos os funcionários.
- **ProgramaFuncionario**: classe com o `main`.

```
   Como executar o programa:

Necessário informar os cargos dos funcionários, nomes, cpfs, salários e qual a porcentagem de correção de salários (Bonificação).
Com essas informações o programa informa o quadro de funcionários, dados pessoais e salários.

Exemplo de entrada e saída

Programador | Ana | Salário: R$ 4000,00 | Bonificação: R$ 400,00 
Estagiário | Davi | Salário: R$ 1500,00 | Bonificação: R$ 200,00 
Gerente | Bruno | Salário: R$ 6000,00 | Bonificação: R$ 900,00 
Diretor | Carla | Salário: R$ 10000,00|Bonificação: R$ 2500,00  
Total de bonificações: R$ 4000,00




Tecnologia utilizada:

- Apache NetBeans 30
- JDK 26
- Projeto configurado em Java 17

Perguntas:

1 - Significa que diretor é uma classe filha de Gerente e gerente é uma classe filha de funcionário
2 - 

Aluno : Vladimir Modesto Teodoro - CEFET MG

