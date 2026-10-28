# Marcador de LP de Yu-Gi-Oh!

Aplicación de consola en Java para llevar los puntos de vida (LP) de dos jugadores durante un duelo de Yu-Gi-Oh!.

Proyecto realizado de forma individual durante el ciclo de Desarrollo de Aplicaciones Web (DAW).

## Funcionalidades

- Marcador de puntos de vida (LP) para dos jugadores.
- Menú interactivo en consola para elegir la acción a realizar.
- Actualización de los LP de cada jugador a partir de las cantidades introducidas por teclado.
- Muestra el marcador actualizado durante el duelo.

## Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Git y GitHub

## Conceptos aplicados

- Bucle `while` para mantener el menú activo mientras dura el duelo.
- Estructura `switch` para gestionar las opciones del menú.
- Lectura de datos por teclado con la clase `Scanner`.
- Variables y operaciones aritméticas para actualizar los LP.

## Cómo ejecutarlo

### Con IntelliJ IDEA

1. Clona el repositorio:
   ```
   git clone https://github.com/Juanttndaw/marcadorYu.git
   ```
2. Abre la carpeta del proyecto en IntelliJ IDEA.
3. Abre la clase principal del proyecto y pulsa **Run**.

### Desde la terminal

Necesitas tener instalado el JDK de Java. Desde la carpeta que contiene el código fuente:

```
javac *.java
java NombreDeLaClasePrincipal
```

## Mejoras previstas

- Impedir que los LP de un jugador bajen de 0.
- Validar las entradas para no aceptar cantidades negativas al restar LP.

## Autor

Juan Antonio Torregrosa Macia  
GitHub: [@Juanttndaw](https://github.com/Juanttndaw)
