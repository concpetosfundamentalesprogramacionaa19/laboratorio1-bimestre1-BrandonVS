/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
// Importamos las variables a la clase principal
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        // Comprobamos si es mayor o menor de edad
        String mayoria = MiClase1.edad >= 18 ? "y mayor de edad" : "y menor de "
                + "edad";
        // Imprimimos el nombre, apellido y la edad
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%s %s", 
                MiClase2.nombre, MiClase3.apellido, MiClase1.edad, mayoria);
    }
}
