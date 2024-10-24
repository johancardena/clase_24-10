package ejercicio1.PRACTICA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año de nacimiento de la persona: ");
        int anioNacimiento = scanner.nextInt();
        Persona persona = new Persona(anioNacimiento);
        persona.mostrar_resultado();
    }
}
