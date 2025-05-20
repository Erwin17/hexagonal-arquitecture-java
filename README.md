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
Definimos las principales capas que coponenten la arquitctura hexagonal que son:

* Hexagono de Dominio
* Hexagono de Aplicacion
* Hexagono de Framework/marco

Donde:

El hexágono de **dominio** es donde se representa el esfuerzo de comprender y modelar el problema real que estamos solucionando.
Dentro del hexágono Dominio, encontramos entidades que corresponden a datos y reglas empresariales críticos. Son críticos porque representan un modelo del problema real.

El hexágono de **aplicación** es donde abordamos de forma abstracta las tareas específicas de la aplicación. No depende de detalles técnicos ni frameworks,
se ubica en un punto intermedio entre los aspectos comerciales y tecnológicos. Se hacen uso de puertos y casos de uso para realizar sus funciones.

El hexágono **framework/marco** proporciona la interfaz externa. Ahí es donde podemos determinar cómo exponer las características de la aplicación: REST, gRPC, etc.
También es donde se consumen datos de fuentes externas como bases de datos, lectura de archivos o cualquier otra fuente externa de nuestra aplicación.
