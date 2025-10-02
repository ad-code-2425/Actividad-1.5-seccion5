package edu.cdm.ud1.ejemplos.codigoplataforma52;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileEjemplo4 {
    public static void main(String args[]) {
        Path sourcePath = Paths.get("C:\\prueba\\origen");
        Path destinationPath = Paths.get("C:\\prueba\\destino");
        try {
             // aunque, los archivos dentro del directorio no se copian, por lo que el nuevo
            // directorio está vacío incluso cuando el directorio original contiene
            // archivos.
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            System.out.println("el destino existe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
