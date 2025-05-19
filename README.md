# hexagonal-arquitecture-java

Esto es un ejemplo de como implementar arquitectura hexagonal en java.

Se presenta la siguinte estrucutra del proyecto:

```
└── router-inventory
    ├── pom.xml
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── app
    │   │   │           ├── application
    │   │   │           │   ├── ports
    │   │   │           │   │   ├── input
    │   │   │           │   │   │   └── RouterViewInputPort.java
    │   │   │           │   │   └── output
    │   │   │           │   │       └── RouterViewOutputPort.java
    │   │   │           │   └── usecases
    │   │   │           │       └── RouterViewUseCase.java
    │   │   │           ├── domain
    │   │   │           │   ├── RouterId.java
    │   │   │           │   ├── Router.java
    │   │   │           │   └── RouterType.java
    │   │   │           ├── framework
    │   │   │           │   └── adapters
    │   │   │           │       ├── input
    │   │   │           │       │   └── stdin
    │   │   │           │       │       └── RouterViewCLIAdapter.java
    │   │   │           │       └── output
    │   │   │           │           └── file
    │   │   │           │               └── RouterViewFileAdapter.java
    │   │   │           └── Main.java
    │   │   └── resources
    │   │       └── routers.txt
    │   └── test
    │       └── java

```
