# Catálogo de Películas

Este proyecto es una aplicación de consola que permite gestionar un catálogo de películas. La aplicación permite agregar, listar y buscar películas en el catálogo.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Scanner**: Utilizado para la entrada de datos desde la consola.
- **Servicios de Películas**: Interfaz y dos implementaciones (`ServicioPeliculasArchivo` y `ServicioPeliculasLista`) para la gestión de las películas.

## Descripción del Código

El código principal se encuentra en la clase `CatalogoPeliculasApp` dentro del paquete `presentacion`. 

### Clases Principales

- **CatalogoPeliculasApp**: Clase principal que ejecuta la aplicación.
- **IServicioPeliculas**: Interfaz para los servicios de películas.
- **ServicioPeliculasArchivo**: Implementación de `IServicioPeliculas` que gestiona las películas utilizando archivos.
- **ServicioPeliculasLista**: Implementación de `IServicioPeliculas` que gestiona las películas utilizando una lista en memoria.
- **Pelicula**: Clase que representa una película.

### Funcionamiento

1. **Menú Principal**: La aplicación muestra un menú con las opciones:
   - Agregar Película
   - Listar Películas
   - Buscar Película
   - Salir
2. **Agregar Película**: Permite al usuario introducir el nombre de una película y agregarla al catálogo.
3. **Listar Películas**: Muestra todas las películas en el catálogo.
4. **Buscar Película**: Permite buscar una película por nombre en el catálogo.
5. **Salir**: Termina la ejecución de la aplicación.

### Ejecución

La aplicación se ejecuta en un bucle `while` que muestra el menú y ejecuta las opciones seleccionadas por el usuario hasta que decida salir.

## Vista
![image](https://github.com/user-attachments/assets/aa9012c9-d92d-4fcd-a1f3-52ac9ee748f2)



