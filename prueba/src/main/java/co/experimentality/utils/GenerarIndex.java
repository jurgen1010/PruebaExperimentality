package co.experimentality.utils;

public class GenerarIndex {

    public static String generarNumeroEnteroAleatorio (){
        int indexGenerado = (int)(Math.random()*10+1);
        return String.valueOf(indexGenerado);
    }
}
