# 🦖 Parque Turístico de Dinosaurios

## 📌 Descripción

Este proyecto consiste en una simulación de un parque turístico de dinosaurios desarrollada en Java.
El sistema permite administrar dinosaurios, turistas, zonas del parque, eventos aleatorios y recursos como energía e ingresos económicos.

El objetivo principal es representar el funcionamiento básico de un parque temático mediante programación orientada a objetos, simulación por ciclos y manejo de eventos.

---

# ⚙️ Tecnologías utilizadas

* Java 17
* Maven
* MySQL
* JUnit 5
* JaCoCo

---

# 📂 Estructura del proyecto

```plaintext
src/main/java/com/dinosaurpark

├── model
├── service
├── repository
├── event
├── monitor
├── config
```

### 📌 Descripción de paquetes

| Paquete    | Función                            |
| ---------- | ---------------------------------- |
| model      | Clases principales del sistema     |
| service    | Lógica de simulación               |
| repository | Conexión y manejo de base de datos |
| event      | Eventos aleatorios del parque      |
| monitor    | Monitoreo del estado del parque    |
| config     | Configuración del sistema          |

---

# 🦕 Funcionalidades principales

* Simulación por ciclos
* Administración de dinosaurios
* Flujo de turistas
* Compra de boletos
* Manejo de energía
* Eventos aleatorios
* Monitoreo del parque
* Conexión a MySQL
* Pruebas unitarias con JUnit
* Cobertura de código con JaCoCo

---

# 🏞️ Zonas del parque

El parque cuenta con las siguientes zonas:

* Lugar de Arribo
* Recinto Central
* Baños
* Planta de Energía
* Recintos de Observación

---

# 🎫 Flujo de turistas

Los turistas pueden:

1. Ingresar al parque
2. Comprar boletos
3. Acceder a distintas zonas
4. Recorrer el parque durante la simulación

---

# ⚡ Eventos aleatorios

Durante la simulación pueden ocurrir eventos como:

* Escape de dinosaurio
* Apagón masivo
* Tormenta torrencial

---

# ▶️ Ejecución del proyecto

## Compilar proyecto

```bash
mvn compile
```

## Ejecutar pruebas

```bash
mvn test
```

## Generar reporte de cobertura

```bash
mvn jacoco:report
```

---

# 📊 Cobertura de pruebas

El proyecto incluye pruebas unitarias utilizando JUnit 5 y generación de cobertura mediante JaCoCo.

Cobertura alcanzada:

* 52% de cobertura total

---

# 🗄️ Base de datos

El proyecto utiliza MySQL para registrar:

* ingresos
* gastos
* operaciones básicas del parque

El script de creación de base de datos se encuentra en:

```plaintext
database.sql
```

---

# 👩‍💻 Autor

Maleny Dominguez Sarmiento

Proyecto académico desarrollado para el Laboratorio Bloque 4.