package NOTAS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar información para la primera persona
        System.out.print("Ingrese el nombre de la primera persona: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la edad de la primera persona: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el teléfono de la primera persona: ");
        String telefono1 = scanner.nextLine();

        Persona persona1 = new Persona(nombre1, edad1, telefono1);

        Notas notasPersona1 = new Notas();
        System.out.println("Ingrese las notas para " + persona1.nombre + ":");
        notasPersona1.ingresarNotas();

        double promedioPersona1 = notasPersona1.calcular_promedio();
        persona1.setPromedio(promedioPersona1);

        System.out.print("\nIngrese el nombre de la segunda persona: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la edad de la segunda persona: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.print("Ingrese el teléfono de la segunda persona: ");
        String telefono2 = scanner.nextLine();


        Persona persona2 = new Persona(nombre2, edad2, telefono2);
        Notas notasPersona2 = new Notas();
        System.out.println("Ingrese las notas para " + persona2.nombre + ":");
        notasPersona2.ingresarNotas();
        double promedioPersona2 = notasPersona2.calcular_promedio();
        persona2.setPromedio(promedioPersona2);
        System.out.println("\nResultados:");
        persona1.mostrar();
        persona2.mostrar();
    }
}
