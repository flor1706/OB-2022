
    public class Main {

        public static void main(String[] args) {
            Cliente cliente = new Cliente();
            Trabajador trabajador = new Trabajador();
            cliente.nombre = "Florencia";
            cliente.edad = 33;
            cliente.telefono = 6946407;
            cliente.credito = 255.93;
            System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                    + " y mi credito disponible es " + "u$" + " " + cliente.credito );

            trabajador.nombre = "Mirko";
            trabajador.edad = 36;
            trabajador.telefono = 5856963;
            trabajador.salario =5000.15;
            System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                    + " y mi salario es de " + "u$"  + " "  + trabajador.salario );

        }
    }

    class Persona{
        int edad;
        int telefono;
        String nombre;
    }

    class Cliente extends Persona{
        double credito;
    }

    class Trabajador extends Persona {
        double salario;
    }