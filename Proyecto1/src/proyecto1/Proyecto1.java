/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // Declaramos las variables
        int costoh;
        double horas;
        double paga;
        double descuento;
        // Le pedimos los datos al usuario
        System.out.println("Por favor ingrese el numero de horas trabajadas.");
        horas = scan.nextInt();
        
        System.out.println("Por favor ingrese el costo por horas de trabajo.");
        costoh = scan.nextInt();
        // Calculamos su sueldo
        paga = costoh * horas;
        // Calculamos el descuento del seguro social
        descuento = paga/10;
        // Imprimimos los resultados
        System.out.printf("Por trabajar %.2f horas, usted recibira: %.2f "
                + "dolares este mes.\nEl descuento de seguro social será de: "
                + "%.2f dolares.", horas, paga, descuento);
    }   
}
