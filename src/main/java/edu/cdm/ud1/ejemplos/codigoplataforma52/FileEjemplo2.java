package edu.cdm.ud1.ejemplos.codigoplataforma52;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

// Crea un nuevo fichero o directorio o lo borra si ya existe
public class FileEjemplo2 {
    public static void main(String args[]) {
        Path path = Paths.get("C:\\prueba\\b");
        try {
            if (Files.exists(path)) {
                System.out.println("Existe el path: " + path + " Se procederá a su eliminación");
                Files.delete(path);
            } 
            else {
                System.out.println("NO existe el path: " + path + " Se procederá a su creación");

                //OJO, si no existe el fichero crea  los directorios intermedios
                Files.createDirectories(path.getParent());
                //Finalmente, se crea el fichero
                Files.createFile(path);
            }
            // ++ añadidas las posibles excepciones al llamar al delete
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", path);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
            System.exit(1);
        }
    }
}
