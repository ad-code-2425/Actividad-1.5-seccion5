package edu.cdm.ud1.ejemplos.codigoplataforma51;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

 public class EjemploPath2 {
    public static void main(String args[]) {
    FileSystem sistemaFicheros = FileSystems.getDefault();
    Path rutaFichero = sistemaFicheros.getPath("C:\\prueba\\b");
    System.out.println(rutaFichero.getFileName());
    System.out.println(rutaFichero.getParent().getFileName());
    Path rutaDirectorio = sistemaFicheros.getPath("C:\\prueba\\b\\c");
    Iterator<Path> it = rutaDirectorio.iterator();
    while (it.hasNext()) {
         System.out.println(it.next().getFileName());
         }
    }
}
