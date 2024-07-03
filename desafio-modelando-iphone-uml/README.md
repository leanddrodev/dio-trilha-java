# Desafio - Modelagem e Diagramação de um Componente iPhone

Modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML (draw.io, mermaid.js.org). Em seguida, implementar as classes e interfaces no formato de arquivos `.java` (opcional).

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

### Instruções
1. Assistir ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilizar uma ferramenta UML para criar o diagrama das classes e interfaces. Pode-se utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, pode-se implementar as classes Java representadas no diagrama UML.
4. Submeter o repositório no GitHub conforme as orientações da plataforma DIO. Por exemplo:

```bash
https://github.com/glysns/trilha-java-basico/desafios/poo/README.md
``` 

## Resposta do Desafio - Diagrama UML (Mermaid) e Código em Java

- **Aluno**: [Leandro Silva](https://github.com/leanddrodev)

- **Diagrama de Classes**

```mermaid
---
title: Modelagem iPhone
---
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero) void
        +atender() void
        + iniciarCorreioVoz() void
    }

    class IPod {
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }

    class Phone {
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class Safari {
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class IPhone {
        -ReprodutorMusical ipod
        -AparelhoTelefonico phone
        -NavegadorInternet safari
        +IPhone()
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    ReprodutorMusical <|.. IPhone
    AparelhoTelefonico <|.. IPhone
    NavegadorInternet <|.. IPhone
    ReprodutorMusical <|.. IPod
    AparelhoTelefonico <|.. Phone
    NavegadorInternet <|.. Safari

style ReprodutorMusical fill:#ffff88,stroke:#36393d,stroke-width:2px
style AparelhoTelefonico fill:#ffff88,stroke:#36393d,stroke-width:2px
style NavegadorInternet fill:#ffff88,stroke:#36393d,stroke-width:2px
style IPod fill:#ffff88,stroke:#36393d,stroke-width:2px
style Phone fill:#ffff88,stroke:#36393d,stroke-width:2px
style Safari fill:#ffff88,stroke:#36393d,stroke-width:2px
style IPhone fill:#ffff88,stroke:#36393d,stroke-width:2px
```

- **Classes em Java**

[(Clique aqui).](https://github.com/leanddrodev/dio-trilha-java-basico/tree/main/desafio-modelando-iphone-uml/src)

