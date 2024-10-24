package ejercicio1;

public class Operaciones {
    int numero1;
    int numero2;

    //metodo constructor
    public Operaciones(int numero1,int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public int sumar() {
        return numero1 + numero2;
    }
    public int resta(){
        return numero1-numero2;
    }

    public void imprimir(){
        System.out.println("La suma es: " + sumar());
        System.out.println("La resta es: " + resta());


    }

}











