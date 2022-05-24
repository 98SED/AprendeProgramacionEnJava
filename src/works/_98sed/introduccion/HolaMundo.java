package works._98sed.introduccion;

import javax.swing.*;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        // Declaración e inicialización de variables:
        int entero = 48;
        float flotante = 19.01f;
        double doble = 48.98;
        char caracter = 'R';
        boolean bool = true;
        String cadena = "Rodrigo";

        // Instancia de la clase Scanner para leer datos ingresados en consola:
        Scanner entrada = new Scanner(System.in);

        // Salida de datos en consola con printf:
        System.out.printf("¡Hola Mundo, esto es Java! y mi nombre es %s\n¿Cuál es tu nombre? ", cadena);

        // Entrada de datos utilizando una instancia de la clase Scanner:
        cadena = entrada.nextLine();

        // Salida de datos con println
        System.out.println("¡Hola " + cadena + "!");

        // Entrada de datos desde JOptionPanes:
        entero = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos años tienes?"));

        // Salida de datos desde JOptionPanes:
        JOptionPane.showMessageDialog(null, "Edad almacenada: " + entero);

    }
}
