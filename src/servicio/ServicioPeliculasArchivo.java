package servicio;

import Dominio.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivo implements IServicioPeliculas{

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    public ServicioPeliculasArchivo() {
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            if (archivo.exists()){
                System.out.println("El archivo ya existe!");
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha crado el archivo!");
            }
        }catch (Exception e){
            System.out.println("Occurrio un error al abrir el archivo: " + e.getMessage());
        }

    }

    @Override
    public void listarPeliculas() {
        //Volvemos a abrir el Archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            System.out.println("Listado de Peliculas");
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea
            String linea;
            linea = entrada.readLine();
            while (linea != null){
                var pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                linea = entrada.readLine();
            }
            //Cerar el Archivo
            entrada.close();

        }catch (Exception e) {
            System.out.println("Ocurrio un error al leer el archivo: " + e);
        }

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Se agrego el archivo: " + pelicula);
        }catch (Exception e) {
            System.out.println("Ocurrio un error al agregar pelicula: " + e.getMessage());
        }

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            //Abrimos el archivo para lectura linea a linea
            var entrada = new BufferedReader(new FileReader(archivo));
            String lineaTexto;
            lineaTexto = entrada.readLine();
            var indice = 1;
            var encontrada = false;
            var peliculaBuscar = pelicula.getNombre();

            while(lineaTexto != null){
                if (peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                    encontrada = true;
                    break;
                }
                //Leemos la siguiente linea
                lineaTexto = entrada.readLine();
                indice++;
            } // fin while
            if (encontrada){
                System.out.println("Pelicula " + lineaTexto + " encontrada - linea "  + indice)  ;
            } else {
                System.out.println("No se encontro la pelicula: " + pelicula.getNombre());
            }
            entrada.close();

        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar en el archivo: " + e.getMessage());
        }

    }
}
