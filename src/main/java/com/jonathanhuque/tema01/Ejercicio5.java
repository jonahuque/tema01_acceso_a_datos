package com.jonathanhuque.tema01;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*Crea los siguientes métodos en una clase llamada GestionArchivos.
 a) boolean crearArchivo(String directorio, String archivo): creará un archivo con el nombre archivo.
 b) void listarDirectorio(String directorio): visualizará el contenido del directorio mostrando el tipo (fichero
“f” , directorio “d”), el tamaño y los permisos de lectura y escritura. Ejemplo:
hola.txt f 10 bytes rw
 c) void verInfo(String directorio, String archivo): visualizará el nombre, la ruta absoluta, si se puede escribir,
si se puede leer, el tamaño, si es un directorio y si es un archivo.
Los parámetros que necesitan los métodos serán solicitados al usuario desde el programa principal.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestionArchivos gestion = new GestionArchivos();

        IO.print("Introduce el directorio: ");
        String directorio = teclado.nextLine();

        IO.print("Introduce el nombre del archivo: ");
        String archivo = teclado.nextLine();

        boolean creado = gestion.crearArchivo(directorio, archivo);

        if (creado) {
            IO.println("Archivo creado correctamente.");
        } else {
            IO.println("El archivo no se ha creado (puede que ya exista).");
        }


        IO.println("\n=== LISTADO DEL DIRECTORIO ===");

        IO.print("Introduce el directorio que quieres listar: ");
        String directorioListado = teclado.nextLine();

        gestion.listarDirectorio(directorioListado);

        IO.println("\n=== INFORMACIÓN DEL ARCHIVO ===");

        IO.print("Introduce el directorio: ");
        String directorioInfo = teclado.nextLine();

        IO.println();print("Introduce el nombre del archivo: ");
        String archivoInfo = teclado.nextLine();

        gestion.verInfo(directorioInfo, archivoInfo);

        teclado.close();
    }
    public static class GestionArchivos {
        public  boolean crearArchivo(String directorio, String archivo) {
            File fichero = new File (directorio, archivo);
            try {
                return fichero.createNewFile();
            }catch (IOException ioe){
                return false;

            }
        }
        public  void listarDirectorio(String directorio) {
            File carpeta = new File (directorio);

            if(!carpeta.exists() || !carpeta.isDirectory()){
                IO.println("No existe el directorio");
            }

            File[] archivos = carpeta.listFiles();

            if(archivos==null){
                IO.println("No existe el directorio");
            }

            for(File archivo : archivos){
                IO.println(archivo.getName());

                if(archivo.isDirectory()){
                    IO.print("d ");

                }else{
                    IO.print("f ");
                }

                IO.print(archivo.length() + " bytes ");

                if(archivo.canRead()){
                    IO.println("r");
                }else{
                    IO.println("w");
                }


            }

        }

        public  void verInfo(String directorio,  String archivo) {
            File fichero = new File (directorio, archivo);

            if(!fichero.exists()){
                IO.println("El archivo o directorio no existe");
            }
            IO.println("Nombre: " + fichero.getName());
            IO.println("Ruta absoluta: " + fichero.getAbsolutePath());
            IO.println("¿Se puede escribir? " + fichero.canWrite());
            IO.println("¿Se puede leer?: " +  fichero.canRead());
            IO.println("Tamaño: " + fichero.length() + " bytes");
            IO.println("¿Es un directorio?: " + fichero.isDirectory());
            IO.println("¿Es un archivo?: " + fichero.isFile());

        }
    }



}
