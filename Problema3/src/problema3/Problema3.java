/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Declaramos las variables
        String not1;
        String not2;
        String not3;
        double prom;
        
        // Ingresamos las variables
        System.out.println("Ingrese la nota 1:");
        not1 = scan.nextLine();
        
        System.out.println("Ingrese la nota 2:");
        not2 = scan.nextLine();
        
        System.out.println("Ingrese la nota 3:");
        not3 = scan.nextLine();
        
        // Convertimos las variables en string a double
        double nota1 = Double.parseDouble(not1);
        double nota2 = Double.parseDouble(not2);
        double nota3 = Double.parseDouble(not3);
        // Calcualmos el promedio
        prom = (nota1 + nota2 + nota3)/3;
        // Comprobamos si el usuario aprobo o reprobo
        String aprovado = prom > 14 ? "Aprobado" : "Reprobado";
        //Imprimimos los resultados
        System.out.printf("Con las notas: %.2f, %.2f, %.2f, su promedio sera "
                + "de: %.2f. Usted ha %s el año.", nota1, nota2, nota3, prom, 
                aprovado);
    }
    
}
