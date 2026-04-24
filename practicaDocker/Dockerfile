FROM eclipse-temurin:25-jre-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo .jar generado al contenedor
COPY build/libs/practicaDocker-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que corre la aplicación (configurado a 8081)
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
