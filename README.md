Spring Boot with Spring Security
========================================
Java 8 is needed to run this.
Maven & H2 database

Clone
--------

```sh
git clone https://github.com/domaframework/spring-boot-sample.git
```

Run
--------

```sh
cd product
```

```sh
mvn spring-boot:run
```

Access
--------

### Select

```
http://localhost:8080/
```
JSON Response:
For http://localhost:8080/api/getproductdetails
```json
[{"id":1,"name":"Books","quantity":"2","price":"100"},{"id":2,"name":"Pencils","quantity":"3","price":"5"}]
```
For http://localhost:8080/api/getconfigdetails
```json
{"h2Path":"/h2","dataSourceURL":"jdbc:h2:file:C:/temp/test","dielect":"org.hibernate.dialect.H2Dialect","serverPort":"8080","applicationName":"productservice"}
```

Use Eclipse 4.4 or above.

[spring-boot]: https://github.com/spring-projects/spring-boot

