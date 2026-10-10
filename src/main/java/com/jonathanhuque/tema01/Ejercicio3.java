package com.jonathanhuque.tema01;
import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/* Obtén las siguientes propiedades de la carpeta del ejercicio:
 a) El nombre de la carpeta
 b) La ruta absoluta
 c) Si se puede leer
 d) Si se puede escribir*/
public class Ejercicio3 {
     public static void main() {
        File carpeta = new File("/home/jonathan-huque/Escritorio/proyectos/tema01");
        IO.println("Nombre de la carpeta: " + carpeta.getName());
        IO.println("Ruta Absoluta " + carpeta.getAbsolutePath());
        IO.println("¿Se puede leer? " + carpeta.canRead());
        IO.println("¿Se puede escribir? " + carpeta.canWrite());
    }
}
