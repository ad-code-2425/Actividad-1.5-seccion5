package edu.cdm.ud1.ejemplos.codigoplataforma53;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileEjemplo10 {
    public static void main(String args[]) {
        Path inputFile = Paths.get("C:\\prueba\\origen\\hola.txt");
        Path outputFile = Paths.get("C:\\prueba\\destino\\hola.txt");
        try {
            byte[] contents = Files.readAllBytes(inputFile);
            Files.write(outputFile, contents, StandardOpenOption.WRITE,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println(" ERROR : " + e);
            System.exit(1);
        }
    }
}
