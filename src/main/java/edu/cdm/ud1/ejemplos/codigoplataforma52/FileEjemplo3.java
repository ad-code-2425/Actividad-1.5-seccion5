package edu.cdm.ud1.ejemplos.codigoplataforma52;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.io.IOException;

// crea una nueva carpeta 
public class FileEjemplo3 {
    public static void main(String args[]) {
        Path path = Paths.get("C:\\prueba\\newdir");
        try {
            Path newDir = Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            // el directorio ya existe
            System.out.println("El directorio ya existe");
        } catch (IOException e) {
            // error I/O
            e.printStackTrace();
        }
    }
}
