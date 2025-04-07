``` mermaid
---
title: Modelo IPhone
---
classDiagram
    class IPhone
    class ReprodutorMusical{
    <<interface>>
    tocar() void
    pausar() void
    selecionarMusica(String musica) void
    }
    class AparelhoTelefonico{
    <<interface>>
    ligar(String numero) void
    atender() void
    iniciarCorreioVoz() void
    }
    class NavegadorInternet{
    <<interface>>
    exibirPagina(String url) void
    adicionarNovaAba() void
    atualizarPagina() void
    }
    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet
```
