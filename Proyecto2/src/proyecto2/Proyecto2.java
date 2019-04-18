/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declaramos las variables
        String x;
        String y;
        String z;
        double m;
        // Le pedimos los datos al usuario
        System.out.println("Ingrese el valor de x:");
        x = scan.nextLine();
        
        System.out.println("Ingrese el valor de y:");
        y = scan.nextLine();
        
        System.out.println("Ingrese el valor de z:");
        z = scan.nextLine();
        // Transformamos los datos string a double
        double x1 = Double.parseDouble(x);
        double y1 = Double.parseDouble(y);
        double z1 = Double.parseDouble(z);
        // Calculamos el valor de m
        m = (x1+(y1/z1))/(x1-(y1/z1));
        // Imprimimos los resultados
        System.out.printf("El valor de m en base a las variables:\n x = "
                + "%.1f\n\ty = %.1f\n\t\tz = %.1f\nda como resultado:\n\t\t\tm "
                + "= %.1f", x1, y1, z1, m);
    }
    
}
