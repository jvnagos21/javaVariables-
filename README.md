# Java Variables

Projeto de estudo em **Java** sobre **variáveis e tipos de dados**: declaração, atribuição, concatenação de texto e uma condicional simples com `boolean`.

## Sobre o projeto

O programa declara variáveis dos principais tipos básicos do Java, imprime algumas delas no terminal e usa uma variável `boolean` para decidir qual mensagem exibir. É um projeto de aprendizado, criado com o IntelliJ IDEA.

## Conceitos abordados

| Tipo | Exemplo no código | Uso |
|------|-------------------|-----|
| `double` | `double price = 28.5;` | Números decimais |
| `int` | `int year = 2026;` | Números inteiros |
| `char` | `char currency = '$';` | Um único caractere |
| `String` | `String name = "John Doe";` | Texto |
| `boolean` | `boolean isValid = true;` | Verdadeiro ou falso |

Também aparecem:

- Concatenação de `String` com outras variáveis usando `+`
- Saída no terminal com `System.out.println`
- Estrutura condicional `if / else`

## Exemplo de saída

```
My name is John Doe
I like feijoada
my e-mail is johndoe67@mail.com
my favorite group is twice
this combo is available for $28.5
```

Se `isValid` for `false`, a última linha passa a ser `this combo is unavailable`.

## Tecnologias

- [Java](https://www.java.com/) (JDK 8 ou superior)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Estrutura do projeto

```
javaVariables-/
├── .idea/           # Configurações do IntelliJ IDEA
├── src/
│   └── Main.java    # Classe principal com as variáveis e a saída no terminal
├── .gitignore
└── Variables.iml    # Arquivo de módulo do IntelliJ
```

## Como executar

### Pré-requisitos

- JDK instalado (verifique com `java -version`)
- Git

### Passo a passo

1. Clone o repositório:

   ```bash
   git clone https://github.com/jvnagos21/javaVariables-.git
   ```

2. Entre na pasta do projeto:

   ```bash
   cd javaVariables-
   ```

3. **Pela IDE (recomendado):** abra a pasta no IntelliJ IDEA, abra `src/Main.java` e clique em **Run**.

4. **Pelo terminal:** compile e execute:

   ```bash
   javac -d out src/Main.java
   java -cp out Main
   ```

## Autor

**João Vitor Meira Vieira**

- GitHub: [@jvnagos21](https://github.com/jvnagos21)
