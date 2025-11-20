/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Proyecto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String mensaje_final = "";
        String nombre;
        int dias;
        double costo_dia;
        double valor_cancelar;
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Ingrese nombre de empleado");
            nombre = entrada.nextLine();

            System.out.println("Ingrese dias trabajados");
            dias = entrada.nextInt();

            System.out.println("Ingrese valor de costo dia");
            costo_dia = entrada.nextDouble();

            valor_cancelar = dias * costo_dia;
            mensaje_final = String.format("%sNombre %s: dias %d, costo por dia"
                    + " $%.2f, total $%.2f\n", mensaje_final, nombre, dias,
                    costo_dia, valor_cancelar);

            entrada.nextLine();
            contador = contador + 1;
        }

        System.out.printf("%s\n", mensaje_final);

    }
}

    
