package com.company;


public class Main {

    public static void main(String[] args) {

        suma(5, 10, 15);

        Auto miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);

    }

}    public static void suma(int a,int b,int c) {
       int Resultado;
       Resultado= a + b + c,
       System.out.println(Resultado);
     }
}


  class Auto {
    public int numeroDePuertas = 4;
    public void sumarPuertas() {
        this numeroDePuertas ++;
    }

  }



