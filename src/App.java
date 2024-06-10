import java.util.Stack;

import Materia.Cola;
import Materia.ColaGenerica;
import Materia.Ejercicio_01_sign.SignValidator;
import Materia.Ejercicio_02_sorting.StackSorte;
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


        //IMPLEMENTACION DE LA COLA GENERICA TIPO PANTALLA
        Cola queue=new Cola();
        
        //AÑADIR ELEMENTOS A LA COLA
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        //MOSTRAR EL ELEMENTO DE LA COLA
        System.out.println("Elemento en el frente: "+queue.peek());//10

        //RETIRAR ELEMENTOS DE LA COLA
        System.out.println("Elemento retirado: "+queue.remove());//10
        System.out.println("Elemento en el frente: "+queue.peek());//10

        System.out.println("Elemento retirado: "+queue.remove());//20
        System.out.println("Elemento en el frente: "+queue.peek());//10

        //VERIFICAR SI LA COLA ESTA VACIA
        System.out.println("¿Cola vacia?: "+(queue.isEmpty()? "Si":"No"));//false
        
        //IMPLEMENTACION DE LA COLA GENERICA TIPO PANTALLA
        ColaGenerica<Pantallas>queueGeneric=new ColaGenerica<>();
        queueGeneric.addNode(new Pantallas("1","home page"));
        queueGeneric.addNode(new Pantallas("2","Menu page"));
        queueGeneric.addNode(new Pantallas("3","Setting"));
        
        System.out.println("Estoy en la pantalla: "+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida: "+queueGeneric.remove().getNombre());
        queueGeneric.addNode(new Pantallas("4", "User page"));
        System.out.println("Estoy en la pantalla: "+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida: "+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla"+queueGeneric.peek().getNombre());
        System.out.println("El tamaño es: " + queueGeneric.size());


         //EJERCICIO 1:

        //Ejemplo1
        SignValidator validador = new SignValidator();
        String input = "([]){}";
        boolean result1=  validador.isValid(input);
        System.out.println("INPUT 1: " + input + "\n"+"The sign validator returns:  " + result1);

        //Ejemplo2
        String input2="({)}";
        boolean result2=validador.isValid(input2);
        System.out.println("INPUT 2: "+input2+ "\n"+"The sign validator returns: "+result2);

        //EJERCICIO 2:

        //Ejemplo1
       
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("INPUT (tope): " + stack);
        StackSorte.sortStack(stack);
        System.out.println("La Pila Ordenado es: " + stack);
        System.out.print("OUTPUT(tope) is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

    

