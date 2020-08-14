#HSDP-IAM

This is a project to test using Spring5 OAuth2 libraries with HSDP's IAM OAuth clients.  Change the properties in the application.yml to your IAM setting and then run it like a normal spring boot application
```
./gradlew clean build bootRun
```
or
```
./gradlew clean build;java -jar build build/libs/hsdp-iam-0.0.1-SNAPSHOT.jar
```

Then browse to http://localhost:8080