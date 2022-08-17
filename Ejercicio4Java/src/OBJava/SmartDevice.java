package OBJava;

/*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

        Agregaréis atributos tal cual tendrían esos objetos en la realidad.

        Crear constructor vacío y con todos los parámetros para cada clase.

        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola

 */

public class SmartDevice {


    String marca;
    String color;
    String año;

    public SmartDevice() {

    }

    public SmartDevice(String marca, String año, String color) {
        this.marca = marca;
        this.año = año;
        this.color = color;

    }


    public static class Smartfone extends SmartDevice {

        int ram;
        String sistema;

        public Smartfone() {
            super();
        }

        public Smartfone(String marca, String color, String año, String sistema, int ram) {
            super(marca, año, color);
            this.ram = ram;
            this.sistema = sistema;
        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", año=" + año +
                    ", color=" + color +
                    ", ram=" + ram +
                    ", sistema=" + sistema;

        }

    }

    public static class SmartWatch extends SmartDevice {

        double pulgadas;
        String conectividad;

        public SmartWatch() {
            super();

        }

        public SmartWatch(String marca, String año, String color, String conectividad, double pulgadas) {
            super(marca, año, color);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }


        @Override
        public String toString() {
            return "marca=" + marca +
                    ", año=" + año +
                    ", color=" + color +
                    ", pulgadas=" + pulgadas +
                    ", conectividad=" + conectividad;
        }

    }

    public static void main(String[] args) {

         Smartfone smartfone = new Smartfone("Samsung", "azul", "2020",
                "Android", 8);

        SmartWatch smartWatch = new SmartWatch("Xiaomi", "2021", "Negro",
                "Bluetooth", 4.5);


        System.out.println("El smartphone es: " + smartfone + "\nEl smartwatch es: " + smartWatch);

    }

}