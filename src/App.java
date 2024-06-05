import Materia.Models.Pantallas;
import Materia.Pilas.PilaGenerica;
import Materia.Pilas.Pilas;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Hola, Mundo!");
        // -----------------------------------
        Pilas pila = new Pilas();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60);
        pila.push(70);
        // ---------------------------------------------------------------------
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        //----------------------------------------------------------------------
        System.out.println();
        //Implementacion de pila generica.
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantallas("Home Page","/home"));
        pilaPantallas.push(new Pantallas("Menu Page","/home/menu"));
        pilaPantallas.push(new Pantallas("Settings Page","/home/menu/settings"));
        //-----------------------------------------------------------------------------------
        System.out.println("Estoy en la pantalla: \n\t ----> "+ pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla: \n\t ----> "+ pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla: \n\t ----> "+ pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantallas("User Page","/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t ----> "+ pilaPantallas.peek().getNombre());

    }
}
