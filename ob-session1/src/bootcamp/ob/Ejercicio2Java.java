package bootcamp.ob;

/*
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */
import java.util.Scanner;

public class Ejercicio2Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un precio: ");

        int numero = scanner.nextInt();

        double iva = numero * 0.21;

        double suma = numero + iva;

        System.out.println("El resultado del precio mas IVA es: " + suma);
    }
}
