FROM amazoncorretto:17

# Definir directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY target/pr2-0.0.1-SNAPSHOT.jar /app/pr2-0.0.1-SNAPSHOT.jar

# Exponer el puerto
EXPOSE 8080

# Establecer el punto de entrada
ENTRYPOINT ["java", "-jar", "pr2-0.0.1-SNAPSHOT.jar"]
