
package dominio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.Test_Archivo;

/**
 *
 * @author JEAN_PIERRE
 */
public class Archivo {

    private String nombre;
    static private FileWriter archivo;
    static private PrintWriter salida;

    Scanner entrada = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void abrirArchivo(String n) throws IOException {
        archivo = new FileWriter(n + ".txt");
        salida = new PrintWriter(archivo);

    }

    public void insertarDatos(String e, int a, int m, int d) {

        salida.println("Nombre del empleado: " + e);
        salida.println("Fecha de nacimiento: " + a + "/" + m + "/" + d);
        salida.print("------------------------------------------------\n");
        salida.flush();
    }

    public void leerDatos(String e, int a, int m, int d) {
        salida.println("Nombre del empleado: " + e);
        salida.println("Años: " + a + " | Meses: " + m + " | Dias: " + d);
        salida.println("----------------------------------------------\n");
        salida.flush();

    }


      
   
    }


