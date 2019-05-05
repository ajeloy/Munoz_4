
package Lanzador;

import  Controlador.ManejoArchivo;
import  Controlador.ManejoArchivo;
import java.io.IOException;

/**
 *
 * @author ALEX
 */
public class Main {
    public static void main (String[] args) throws IOException{
        String direccion = "src\\main\\java\\Archivos\\texto.txt";
        ManejoArchivo man = new ManejoArchivo();
        System.out.println(man.leerTexto (direccion));
        man.agregarTexto("The first man who stepped on the moon.",direccion);
        System.out.println(man.leerTexto (direccion));
    }
}
