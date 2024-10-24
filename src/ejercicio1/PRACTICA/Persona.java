package ejercicio1.PRACTICA;
import java.time.LocalDate;

public class Persona {
    int edad;

    public Persona(int anioNacimiento) {
        int anioActual = LocalDate.now().getYear();
        this.edad = anioActual - anioNacimiento;
    }

    public void imprimir_edad() {
        System.out.println("La edad de la persona es: " + edad);
    }

    public boolean mayor_de_edad() {
        return edad >= 18;
    }

    public void mostrar_resultado() {
        imprimir_edad();
        if (mayor_de_edad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}




















