/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Archivo;
import dominio.Empleado;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author JEAN_PIERRE
 */
public class Test_Archivo {

    static private FileWriter archivo;
    static private PrintWriter salida;

    public static void main(String[] args) {
        try {
            int opcion = 0;
            String e;
            Scanner entrada = new Scanner(System.in);
            Archivo archivos = new Archivo();
            Empleado empleados = new Empleado();
            int t = 0;

            do {
                System.out.println("|| MENU ||");
                System.out.println("\nPrimero abrir un archivo e insertar datos y luego leerlos y repetir el proceso si se quiere agregar mas empleados");
                System.out.println("\n1.Abrir Archivo\n2.Insertar datos\n3.Leer Datos\n4.Cerrar Archivo\n5.Salir");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        String n;
                        System.out.println("Nombre del archivo: ");
                        n = entrada.next();
                        archivos.abrirArchivo(n);
                        break;

                    case 2:
                         int m=0,a=0, d=0;
                        System.out.println("Nombre del empleado: ");
                        e = entrada.next();
                        System.out.println("Año de nacimiento: ");
                        a = entrada.nextInt();
                        System.out.println("Mes de nacimiento:");
                        m=entrada.nextInt();
                        System.out.println("Dia de nacimiento");
                        d=entrada.nextInt();
                        empleados.llenar(e, a, m, d);
                        archivos.insertarDatos(e, a, m, d);
                        break;

                    case 3:
                        empleados.calcularAnios();
                        empleados.calcularDia();
                        empleados.calcularMeses();


                        archivos.leerDatos(empleados.getNombre(),empleados.getAnioN(), empleados.getMesN(), empleados.getDiaN());
                        break;

                    case 4:
                        break;
                    case 5:
                        t = 100;
                        
                }
                t++;
            } while (t < 100);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Test_Archivo.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
