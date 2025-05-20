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
Como un claro ejemplo, podemos imaginar que necesitamos obtener una lista de productos por categoria, esto requiere capturar la entrada del usuario, aplicar reglas de negocio para validar entradas y datos externos y si todo va bien, devolver dicha lista de productos. Todas esas tareas se agrupan en **casos de usos, puertos de entradas y puertos de salida** que es la forma en la que se compone el hexagono de aplicación.

El hexágono **framework/marco** proporciona la interfaz externa. Ahí es donde podemos determinar cómo exponer las características de la aplicación: REST, gRPC, etc.
También es donde se consumen datos de fuentes externas como bases de datos, lectura de archivos o cualquier otra fuente externa de nuestra aplicación.

## Requerimientos para corrar la aplicacion
```
SO: Window/MacOs/Linux
Java: JDK 17
Maven: 3.9 
```

## router-inventory
Es un ejemplo muy basico donde implementamos lo anteriomente explicado en una aplicacion para inveentario de red.

En hexagono de dominio puede encontrar Entidades y Object de valor. 

En el Hexagono de aplicacion definimos las abtracciones de las operaciones que realizamos. 

Y en el hexagono del Framework hacemos uso de los adapter de entrada para recibir la informacion del cliente y el adaprter de salida donde detenemos la operacion de lectura de un archivo externo, que pudo haber sido una solicitud HTTP hacia una fuente externa de informacion.
