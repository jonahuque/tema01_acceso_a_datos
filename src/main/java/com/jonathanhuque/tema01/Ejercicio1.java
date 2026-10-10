package com.jonathanhuque.tema01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Utilizando la clase File comprueba que la carpeta que has creado para este boletín de ejercicios existe y que
se trata de un directorio.*/
public class Ejercicio1 {
    public static void main(String[] args) {
        File file = new File("/home/jonathan-huque/Escritorio/proyectos/tema01");
        if(file.isDirectory()){
            IO.println("Es un directorio");
        }else{
            IO.println("El directorio no existe");
        }


    }
}
