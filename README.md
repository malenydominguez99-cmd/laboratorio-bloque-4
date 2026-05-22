# 🦖 Simulación de Parque de Dinosaurios

## 📌 Descripción del proyecto

Este proyecto fue desarrollado en Java como parte del Laboratorio Bloque 4.  

El sistema simula la administración y monitoreo de un parque de dinosaurios, permitiendo gestionar dinosaurios, eventos aleatorios, ingresos, gastos y monitoreo general del parque.

Durante la simulación pueden ocurrir diferentes eventos que afectan el estado del parque, como escapes de dinosaurios, apagones o tormentas.

Además, el sistema registra eventos en archivos de texto y almacena información en una base de datos MySQL.

---

# 🎯 Funcionalidades implementadas

- Gestión de dinosaurios
- Simulación por ciclos
- Eventos aleatorios
- Monitoreo del parque
- Registro de ingresos
- Registro de gastos
- Persistencia de datos en MySQL
- Registro de eventos en archivo `.txt`
- Configuración externa mediante `config.properties`

---

# 🛠️ Tecnologías utilizadas

- Java
- Maven
- MySQL
- JDBC
- Git y GitHub

---

# 📂 Estructura del proyecto

```plaintext
src/main/java/com/dinosaurpark
│
├── config
├── event
├── logger
├── model
├── monitor
├── repository
└── service
```

---

# ⚙️ Configuración

El proyecto utiliza un archivo `config.properties` para manejar configuraciones generales del sistema.

Ejemplo:

```properties
tourists=50
initialEnergy=100
dinosaurs=2
cycles=5

db.url=jdbc:mysql://localhost:3306/dinosaur_park
db.user=root
db.password=******
```

---

# 🎲 Eventos implementados

Actualmente el sistema cuenta con los siguientes eventos aleatorios:

- Escape de dinosaurio
- Apagón masivo
- Tormenta torrencial

---

# 🗄️ Base de datos

## Crear base de datos

```sql
CREATE DATABASE dinosaur_park;
```

---

## Tabla de ingresos

```sql
CREATE TABLE income (
    id INT AUTO_INCREMENT PRIMARY KEY,
    concept VARCHAR(100),
    amount DOUBLE
);
```

---

## Tabla de gastos

```sql
CREATE TABLE expense (
    id INT AUTO_INCREMENT PRIMARY KEY,
    concept VARCHAR(100),
    amount DOUBLE
);
```

---

# 📝 Registro de eventos

Todos los eventos generados durante la simulación se almacenan automáticamente en el archivo:

```plaintext
events.txt
```

---

# 🧠 Patrones de diseño utilizados

## Strategy

Utilizado en el sistema de eventos:

- Event
- EscapeEvent
- BlackoutEvent
- StormEvent

## Singleton

Utilizado en la clase:

- DatabaseConnection

---

# ▶️ Ejecución del proyecto

El proyecto puede ejecutarse desde:

```plaintext
Main.java
```

o mediante Maven:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.dinosaurpark.Main"
``` 

---

# 👩‍💻 Autor
Maleny Dominguez Sarmiento

Proyecto académico desarrollado para el Laboratorio Bloque 4.