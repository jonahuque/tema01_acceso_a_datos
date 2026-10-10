package com.jonathanhuque.tema01;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/*Obtén las siguientes propiedades de un archivo que esté contenido dentro de la carpeta del ejercicio (el
que tú quieras):
 a) El nombre del archivo
 b) La ruta absoluta
 c) Si se trata de un archivo oculto
 d) Si se puede leer
 e) Si se puede escribir
 f) La fecha de la última modificación (ayúdate de DateTimeFormatter). Luego cambia la fecha de
modificación a la hora actual y vuélvela a comprobar.
 g) El tamaño en bytes, en K y en MB*/
import java.io.File;
public class Ejercicio4 {
    public static void main(String[] args) {
        File archivo = new File("/home/jonathan-huque/Escritorio/tema01/datos.txt");
        //a - nombre del archivo
        IO.println("Nombre de la carpeta: " + archivo.getName());
        // b - ruta absoluta
        IO.println("Ruta Absoluta " + archivo.getAbsolutePath());
        // c - si es oculto
        IO.println("¿Está oculto? " + archivo.isHidden());
        // d - se puede leer?
        IO.println("¿Se puede leer? " + archivo.canRead());
        // e - se puede escribir?
        IO.println("¿Se puede escribir? " + archivo.canWrite());
        // f - fecha de ulima modificacion
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        Instant fechaModificacion =
                Instant.ofEpochMilli(archivo.lastModified());
        IO.println("Última modificación: " + formato.format(fechaModificacion));
        // g - tamaño
        long bytes = archivo.length();

        double kb = bytes / 1024.0;
        double mb = bytes / (1024.0 * 1024.0);

        System.out.println("Tamaño en bytes: " + bytes + " bytes");
        System.out.println("Tamaño en KB: " + kb + " KB");
        System.out.println("Tamaño en MB: " + mb + " MB");
    }
}


