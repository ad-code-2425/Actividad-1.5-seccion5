package edu.cdm.ud1.ejemplos.codigoplataforma52;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEjemplo {
    public static void main(String args[]) {
        Path path = Paths.get("C:\\prueba\\a.txt");
        System.out.println(" path = " + path);
        System.out.println(" exists = " + Files.exists(path));
        System.out.println(" readable = " + Files.isReadable(path));
        System.out.println(" writeable = " + Files.isWritable(path));
        System.out.println(" executeable = " + Files.isExecutable(path));
    }
}