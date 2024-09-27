package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        System.out.println("Escribe cualquier número entero:");
        Scanner scanner = new Scanner(System.in);
        try {
            int prueba = scanner.nextInt();
            System.out.println("Num escrito: " + prueba);
        } catch (Exception e) {
            System.err.println("Error. Debes ingresar un número entero.");
        }
    }
}
