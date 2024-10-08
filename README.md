# Ejercicios de Programación en Java

---

## Nivel 1

### Ejercicio 1
Crea una clase llamada **`Producto`** con los atributos:
- `nombre`
- `precio`

Y otra clase llamada **`Venta`** con los atributos:
- `colección de productos`
- `precio total de la venta`

#### Instrucciones
- La clase **`Venta`** incluye un método `calcularTotal()`, el cual lanza la excepción personalizada **`VentaBuidaException`** si la colección de productos está vacía. Este método muestra en consola el mensaje:
  - `"Para hacer una venta primero debes añadir productos"`.

- Si la colección tiene productos, el método recorre la colección y suma los precios de todos los productos, guardando el total en el atributo `precio total` de la venta.

- La excepción personalizada **`VentaBuidaException`** debe ser hija de la clase `Exception`. En su constructor, recibe el mensaje `"Para hacer una venta primero debes añadir productos"`. Al capturar esta excepción, el mensaje se debe mostrar en consola utilizando el método `getMessage()`.

#### Adicional
Escribe el código necesario para generar y capturar una excepción de tipo **`IndexOutOfBoundsException`**.

---

## Nivel 2

### Ejercicio 1
Crea una clase llamada **`Entrada`** para manejar las distintas excepciones al introducir datos mediante teclado (usando `Scanner`).

#### Instrucciones
- Lo primero que se debe hacer es instanciar un objeto de la clase `Scanner`. A partir de ahí, crear **métodos estáticos** para leer diferentes tipos de datos del teclado.

#### Importante
- Si ocurre una excepción en algún método, esta debe ser tratada, solicitando al usuario que ingrese nuevamente el dato hasta que se introduzca correctamente.
- Ejemplo: Si el usuario introduce un `float` con un punto en lugar de una coma, se debe mostrar **“Error de formato”**. La solicitud se repetirá hasta que el dato sea introducido correctamente.

#### Métodos para Capturar Excepciones de la Clase `InputMismatchException`
- `public static byte leerByte(String mensaje)`
- `public static int leerInt(String mensaje)`
- `public static float leerFloat(String mensaje)`
- `public static double leerDouble(String mensaje)`

#### Métodos para Capturar una Excepción Personalizada de la Clase `Exception`
- `public static char leerChar(String mensaje)`
- `public static String leerString(String mensaje)`
- `public static boolean leerSiNo(String mensaje)`: Si el usuario introduce `"s"`, devuelve `true`; si introduce `"n"`, devuelve `false`.

---

## Nivel 3

### Ejercicio 1
Desarrolla una aplicación para la reserva de asientos en cines, que será utilizada por vendedores al vender entradas.

#### Funcionamiento
- Al iniciar la aplicación, se solicitarán al usuario los datos de la sala:
  - Número de filas
  - Número de asientos por fila

- Se mostrará un menú con las siguientes opciones:

    1. Mostrar todas las butacas reservadas.
    2. Mostrar las butacas reservadas por una persona.
    3. Reservar un sillón.
    4. Anular la reserva de un sillón.
    5. Anular todas las reservas de una persona.
    0. Salir.

#### Clases y Estructura

##### Clase Principal
- Contiene el **`main`** de la aplicación, donde se instancia un objeto de la clase **`Cine`** y se llama a su método `iniciar`.

##### Clase `Butaca`
- Representa un asiento en el cine con los atributos:
  - `Número de fila`
  - `Número de asiento`
  - `Persona que reserva el asiento`

- Métodos:
  - Constructor con todos sus parámetros.
  - Getters para todos los atributos.
  - `equals`: Verifica si dos butacas son iguales comparando `fila` y `asiento`.
  - `toString`: Devuelve un `String` con el formato:
    - `"Fila: 5, Asiento: 20, Persona: Maria Febrer"`

##### Clase `Cine`
- Atributos:
  - `Número de filas del cine`
  - `Número de asientos por cada fila`
  - Un objeto de la clase **`GestioButaques`**
  - Un objeto de la clase **`GestioCine`**

- Métodos:
  - Constructor sin parámetros que inicializa objetos de **`GestioButaques`** y **`GestioCine`**, y llama al método `pedirDatosIniciales`.
  - `iniciar`: Inicia la aplicación, llamando al método `menu` para ejecutar la opción seleccionada.
  - `pedirDatosIniciales`: Solicita al usuario el número de filas y asientos, guardándolos en los atributos correspondientes.

##### Clase `GestioCine`
- Lógica para la gestión de las operaciones del cine.

- Atributos:
  - Un objeto de la clase **`Cine`**

- Métodos:
  - Constructor: Recibe un objeto de la clase **`Cine`** y lo asigna al atributo correspondiente.
  - `menu`: Muestra las opciones del menú principal, solicita la selección del usuario y devuelve el número de la opción elegida.
  - `mostrarButacas`: Muestra todas las butacas reservadas.
  - `mostrarButacasPersona`: Solicita el nombre de la persona y muestra sus reservas.
 

---

## 💻 Tecnologías Utilizadas

- **Java**
- **Eclipse**

## 📋 Requisitos

- Tener Java instalado.

## 🛠️ Instalación

(Sin detalles específicos)

## ▶️ Ejecución

1. Abrir el proyecto en el IDE.
2. Compilar el proyecto.

## 🌐 Despliegue

(Sin detalles específicos)

## 🤝 Contribuciones

(Sin detalles específicos)

