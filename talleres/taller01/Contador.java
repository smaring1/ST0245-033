import java.util.Scanner;

/**
 * La clase Contador tiene la intención de representar un contador.
 *
 * @author Mauricio Toro, Andres Paez, Daniel Mesa, Miguel Ramos,  Simón Mmarín
 * @version 2
 */

public class Contador {
    private int cantidad;
    private int cuenta;
    private final String id;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Contador(String id) {
        this.id = id;
        cuenta=0;
        cantidad = 0;
    }

    /**
     * El método incrementar incrementa el contador en una unidad.
     *
     *(opcional: se podria pasar un parametro "cantidad" para incrementar esa cantidad de unidades).
     */
    public void incrementar() {
        cuenta +=1;
    }
    
    public void descrementar() {
        cuenta-=1;
    }

    /**
     * El método incrementos nos muestra en que valor se encuentra la cuenta actualmente.
     * @return el numero actual de la cuenta
     */

    public int leerValorIcremento() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor a incrementar: ");
        cantidad = teclado.nextInt();
        return cantidad;
    }
    public int leerValorDecremento() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor a reducir: ");
        cantidad = teclado.nextInt();
        return cantidad;
    }


    /**
     * toString se encargará de convertir el contador en un tipo cadena
     * para su posterior visualización
     * se debe de mostrar el estado del contador y su id
     *
     * @return una cadena que contiene el id del contador y su cuenta
     */
    public String toString() {
        return " su valor es: "+cuenta;
    }
}
