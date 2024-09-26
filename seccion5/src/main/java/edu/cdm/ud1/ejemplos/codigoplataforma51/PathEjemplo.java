package edu.cdm.ud1.ejemplos.codigoplataforma51;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEjemplo {
    public static void main(String args[]) {
        Path path = Paths.get("C:/prueba");
        System.out.println(" path = " + path);
        System.out.println(" is absoute ? = " + path.isAbsolute());
        System.out.println(" file short name = " + path.getFileName());
        System.out.println(" parent = " + path.getParent());
        System.out.println(" uri = " + path.toUri());
        path = Paths.get("/home/PathEjemplo");
        System.out.println(" path = " + path);
        System.out.println(" is absoute ? = " + path.isAbsolute());
        System.out.println(" file short name = " + path.getFileName());
        System.out.println(" parent = " + path.getParent());
        System.out.println(" uri = " + path.toUri());

    }
}
