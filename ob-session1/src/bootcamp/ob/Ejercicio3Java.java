package bootcamp.ob;


/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
 */

public class Ejercicio3Java {

    public static void main(String[] args) {

        String [] nombres = new String[]{"Florencia","Daniela","Andrea","Camila"};

        for (int i= 0 ; i < nombres.length;i ++ ){
            System.out.println(nombres[i]);
        }
    }
}
