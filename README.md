# API GATEWAY (PRUEBA TECNICA)

Este repositorio tiene la implementación completa del API GateWay para la ejecución de servicios y gestion de la autenticación, basado en una arquitectura de microservicios

## Descarga y ejecución del proyecto

Primero Clonar los siguientes repositorios que hacen parte del proyecto completo (las instrucciones de ejecucón se encuentran en cada repositorio respectivamente):
  * [Servidor Eureka]
  * [Payment service]
  * [user Service]
  * [FCM Service]

Despues, Clonar este repositorio
```bash
git clone https://github.com/MrForero/toListo-test-API_GateWay
```

Correr los siguientes contenedores en Docker, que corresponden a hostear KeyCloak, Kafka y la base de datos personalizada para el proyecto:

```bash
docker run --name to_listo_test -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=test -p 3306:3306 -d mysql:latest
docker run -p 8080:8080 -e KC_BOOTSTRAP_ADMIN_USERNAME=admin -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:latest start-dev
```

Una vez en ejecución estos contenedores, se ejecuta el API GateWay, se recomienda primero aver iniciado el servidor de Eureka

```bash
mvn spring-boot:run
```

O se puede ejecutar abriendo directamente en IntelliJ
