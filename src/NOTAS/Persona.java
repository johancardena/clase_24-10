package NOTAS;

public class Persona {
    String nombre;
    int edad;
    String telefono;
    double promedio;

    // Constructor
    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Promedio: " + promedio);
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
