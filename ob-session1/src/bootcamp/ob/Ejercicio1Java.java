package bootcamp.ob;

/*
Para este primer ejercicio tendréis que realizar lo siguiente:

Crea un proyecto de Java desde 0

Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */

public class Ejercicio1Java {

    public static void main(String[] args) {

        //clases numeros enteros
        byte number1 = 1; // 1 byte
        short number2 = 10; // 2 bytes
        int number3 = 50; // 4 bytes
        long number4 = 100; // 8 bytes

        System.out.println("Numeros enteros : " + number1 + number2 + number3 + number4);

        //clases de numeros decimales

        float decimal1 = 4.9f;
        double decimal2 = 9.99d;
        System.out.println("Numeros decimales" + decimal1 + decimal2);

        //cadenas de textos

        String nombre = "Florencia";
        String apellido = "Pereyra";

        //caracter

        char caracter1 = 'a';

        System.out.println("Cadena de texto : " + nombre + apellido + caracter1);

        //booleanos

        boolean verdadero = true;
        boolean falso = false;
    }
}
