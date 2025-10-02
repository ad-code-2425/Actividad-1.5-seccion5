package edu.cdm.ud1.ejemplos.codigoplataforma52;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.io.IOException;

//import java.nio.file.FileAlreadyExistsException; //en caso de querer sobrescribir el directorio destino
public class FileEjemplo5 {
    public static void main(String args[]) {
        Path sourcePath = Paths.get("C:\\prueba\\origen\\a.txt");
        Path destinationPath = Paths.get("C:\\prueba\\destino\\OtroNombre2.txt");
        try {
           //Tiene que existir la carpeta contenedora, sino, NoSuchFileException

            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            System.out.println("el fichero existe");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
