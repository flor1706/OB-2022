package OpenBootcampJava;
/*
Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valore
 */

public class ArrayUnidimensional {


    public static void main(String[] args) {


        System.out.println("----- \n Array Unidimensional Harry Potter\n-----");

        String textos[] = {"Reliquias ", "De la ", "Muerte "};

        for (String texto : textos) {
            System.out.print(texto);
        }
    }
}
