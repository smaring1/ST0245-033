/**
 * Clase donde se soluciona el problema
 * de la calculadora de notacion polaca inversa
 * @author Simon Marin Giraldo, Miguel Fernando Ramos Garcia
 * @version 20/9/19
 */
import java.util.*;
public class CalculadoraPolaca {

    public static void main(String[] args) {
        polacaTest();
    }

    public static int polaca  (String elString) {
        String [] elemento = elString.split(" ");
        Stack<Integer> pila = new Stack<>();

        for (int i=0;i<elemento.length;i++) {
            if (elemento[i].equals("+")) {
                int b = pila.peek();
                pila.pop();
                int a = pila.peek();
                pila.pop();
                pila.push(a + b);
            } else if (elemento[i].equals("*")) {
                int b = pila.peek();
                pila.pop();
                int a = pila.peek();
                pila.pop();
                pila.push(a * b);
            } else if (elemento[i].equals("-")) {
                int b = pila.peek();
                pila.pop();
                int a = pila.peek();
                pila.pop();
                pila.push(a - b);
            } else if(elemento[i].equals("/")) {
                int b = pila.peek();
                pila.pop();
                int a = pila.peek();
                pila.pop();
                pila.push(a / b);
            } else {
                pila.push(Integer.parseInt(elemento[i]));
            }
        }
        return (pila.pop());
    }

    public static void polacaTest() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una expresion a procesar");
        System.out.println("en la calculadora:");
        String prueba = teclado.nextLine();
        System.out.println("El resultado es: " + polaca(prueba));
    }
}
