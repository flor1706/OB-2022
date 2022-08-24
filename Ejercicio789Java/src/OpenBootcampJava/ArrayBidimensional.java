package OpenBootcampJava;
/*
 Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
        en ambas dimensiones.
 */

public class ArrayBidimensional {

    public static void main(String[] args) {

        System.out.println(" Array Bidimensional\n-*-*-*-*-*-*-*-*-*-*-*-*");

        Integer[][] numeros = {
                {1, 2, 3},
                {10, 20, 30}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int y = 0; y < numeros[i].length; y++) {

                System.out.println("Fila: " + (i + 1) +  "\nColumna: " + (y + 1) +
                        "\nEl valor es: " + numeros[i][y] + "\n");
            }
        }
    }
}
