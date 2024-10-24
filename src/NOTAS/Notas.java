package NOTAS;

import java.util.Scanner;

public class Notas {
     double nota1;
    double nota2;

    public void ingresarNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        this.nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        this.nota2 = scanner.nextDouble();
    }

    public double calcular_promedio() {
        return (nota1 + nota2) / 2;
    }
}




