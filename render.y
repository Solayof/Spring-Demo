services:
  - type: web
    name: solayof
    env: java
    buildCommand: "./mvnw clean package"
    startCommand: "java -jar target/*.jar"
    envVars:
      - key: JAVA_HOME
        value: /opt/render/project/java
