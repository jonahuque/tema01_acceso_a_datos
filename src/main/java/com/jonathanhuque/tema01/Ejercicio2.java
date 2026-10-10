package com.jonathanhuque.tema01;

import java.io.File;

/* Muestra los archivos y directorios que están en la carpeta del ejercicio. Solo los de primer nivel (no
recursivo).
*/
public class Ejercicio2 {
    public  void main(String[] args) {
        File file = new File("/home/jonathan-huque/Escritorio/proyectos/tema01");
        String mensaje = file.getName();
        IO.println(mensaje);


    }
}
