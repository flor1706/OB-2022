package OpenBootcampJava;
/*
  Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayString {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Florencia");
        lista.add("Daniela");
        lista.add("Andrea");
        lista.add("Camila");

        LinkedList<String> linkedlist = new LinkedList<String>();

        for (int i = 0; i < lista.size(); i++) {
            linkedlist.add(i, lista.get(i));
        }

        System.out.println("Elementos del Array:");
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nElementos de la LinkedList:");
        for (String elementos : linkedlist) {
            System.out.print(elementos + " ");
        }
    }
}

