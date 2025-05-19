# hexagonal-arquitecture-java

Esto es un ejemplo de como implementar arquitectura hexagonal en java.

Se presenta la siguinte estrucutra del proyecto:

```
└── my-app
    ├── pom.xml
    ├── src
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── app
        │   │           ├── application
        │   │           │   ├── ports
        │   │           │   │   ├── input
        │   │           │   │   └── output
        │   │           │   └── usecases
        │   │           ├── domain
        │   │           ├── framework
        │   │           │   └── adapters
        │   │           │       ├── input
        │   │           │       └── output
        │   │           └── Main.java
        │   └── resources
        │       └── routers.txt
        └── test
            └── java
```
