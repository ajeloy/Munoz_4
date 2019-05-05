
package Lanzador;

import Controlador.ManejoArchivo;
import java.io.IOException;

/**
 *
 * @author ALEX
 */
public class Main {
    public static void main (String [] args) throws IOException{
        ManejoArchivo interac = new ManejoArchivo("src\\main\\java\\Archivos\\listado.csv", "algodon,XL,false");
    }

    
}
