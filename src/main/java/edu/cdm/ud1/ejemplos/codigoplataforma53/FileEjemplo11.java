package edu.cdm.ud1.ejemplos.codigoplataforma53;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

public class FileEjemplo11 {

    public static void main(String args[]) {
        Path input = Paths.get("C:\\prueba\\origen\\hola.txt");
        Path output = Paths.get("C:\\prueba\\destino\\hola.txt");
        try {
            BufferedReader inputReader = Files.newBufferedReader(input, Charset.defaultCharset());
            BufferedWriter outputWriter = Files.newBufferedWriter(output, Charset.defaultCharset(),
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            String line;
            while ((line = inputReader.readLine()) != null) {
                outputWriter.write(line, 0, line.length());
                outputWriter.newLine();
            }
            inputReader.close();
            outputWriter.close();
        } catch (IOException e) {
            System.err.println(" ERROR : " + e);
            System.exit(1);
        }
    }
}
