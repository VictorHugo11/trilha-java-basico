# Programação Orientada a Objetos (POO) em Java

## Conceitos Básicos

Toda a estrutura de código na linguagem Java é distribuída em arquivos `.java`, chamados de **classes**.

As classes em nosso projeto são compostas por:

- **Classe (class)**: Define a estrutura para a criação de objetos.
- **Identificador (identity)**: Define um propósito existencial para os objetos.
- **Características (states)**: Também conhecido como atributos ou propriedades.
- **Comportamentos (behavior)**: Métodos que definem ações dos objetos.
- **Instanciar (`new`)**: Criar um objeto a partir de uma classe.

### **Exemplo de Classe e Objetos Criados**
#### Classe `Student`
```java
public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(String food){
        System.out.println(name + " está comendo " + food);
    }

    void drinking(String drink){
        System.out.println(name + " está bebendo " + drink);
    }

    void running(){
        System.out.println(name + " está correndo.");
    }
}
```

## Classificação das Classes
No desenvolvimento Java, as classes seguem convenções específicas:

- **Model (`model/`)**: Representam a estrutura da aplicação (ex: Cliente, Pedido).
- **Serviço (`service/`)**: Contêm regras de negócio.
- **Repositório (`repository/`)**: Responsáveis pela comunicação com o banco de dados.
- **Controle (`controller/`)**: Responsáveis por comunicação externa (ex: APIs).
- **Utilitária (`util/`)**: Contêm métodos comuns à aplicação.
