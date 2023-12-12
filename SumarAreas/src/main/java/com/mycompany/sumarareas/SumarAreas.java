/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumarareas;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class SumarAreas {
    //
    public static void main(String[] args) {
        int n, op;
        double lado1, lado2, lado3;

        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("________________________________");
            System.out.println(" ");
            System.out.println("1. Sumar areas de Triangulos");
            System.out.println("2. Salir");
            System.out.println(" ");
            System.out.println("________________________________");
            System.out.println(" ");
            System.out.print("Seleccione una opción: ");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println(" ");
                    System.out.print("Ingrese el número de triángulos: ");
                    n = leer.nextInt();
                    Triangulo[] obj1 = new Triangulo[n];
                    double sumaAreas = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.println(" ");
                        System.out.println("_________________________");
                        System.out.println(" ");
                        System.out.println("Triangulo N°" + i);
                        System.out.println(" ");
                        System.out.print("Ingrese el valor del lado a: ");
                        lado1 = leer.nextDouble();
                        System.out.print("Ingrese el valor del lado b: ");
                        lado2 = leer.nextDouble();
                        System.out.print("Ingrese el valor del lado c: ");
                        lado3 = leer.nextDouble();
                        obj1[i] = new Triangulo(lado1, lado2, lado3);
                        sumaAreas += obj1[i].area(); 
                    }
                    System.out.println(" ");
                    System.out.println("La suma total de áreas de los triángulos es: " + sumaAreas);
                    System.out.println(" ");
                    break;
                    
                    case 2:
                    break;
                default: System.out.println(" Seleccione una opcion correcta ");
            }
        } while (op != 2);
    }
}
