package edu.cdm.ud1.ejemplos.codigoplataforma52;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileEjemplo6 {
    public static void main(String args[]) {
        Path sourcePath = Paths.get("C:\\prueba\\origen\\a.txt");
        Path destinationPath = Paths.get("C:\\prueba\\destino\\OtroNombre.txt");
        try {

            //a.txt desaparece del origen
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            System.out.println("el destino existe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
