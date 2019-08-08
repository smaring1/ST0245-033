/**
 *La clase Taller5 dos tiene como objetivo dar solución al taller5
 *
 *@autor Simon Marin, Miguel Fernando Ramos, Mauricio Toro, Camilo Paez
 *@version 1
 */
public class Taller5 {


    /**
     * @param array es un arreglo de numeros enteros
     * @param n la longitud del array anterior
     *
     *en este método se busca hacer la suma de los numeros en un
     *arreglo de forma recursiva.
     *
     * @return la suma
     */
    public static int arrayMax(int[] array, int n) {
        int max, temp;
        max = array[n];
        if(n != 0) {
            temp = arrayMax(array, n-1); //T(n) = T(n-1) + c2
            if(temp >= max)
            max = temp;
        }
        return max;
    }
    //c_2 = T(n) - T(n-1)

    /**
     * @param start es un contador, nos sirve para saber cuando debemos parar
     * @param nums es un arreglo de numeros enteros, representan volumen
     * @param target es la meta, el numero que debe alacanzar la suma
     *
     * en este método se busca hacer la suma de los volumnes posibles
     * de modo que se acomode de tal forma que se alcance el valor target
     * pista: la clave esta en el numero de elementos y que no siempre se toman
     * los elementos, en ocaciones pasan por ejemplo en un conjuntos [5,6,7,8] para un
     * target 12 se toman el 5 y el 7 pasando por 6 sin cogerlo.
     *
     *
     * @return verdadero si hay una combinación que suponga el valor target, falso de lo contrario
     */
     public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) { //C_1
            return (target == 0);  //C_2
        }
        return (groupSum(start + 1, nums, target - nums[start])) || (groupSum(start + 1, nums, target)); // T(n) = T(n-1 ) + T(n-1 )
        //T(n) = C_1*2^(n-1)
     }
    
    /**
     * @param n numero entero, hasta que numero se hace la serie
     *
     * el metodo se encarga de devolvernos el valor fibonacci en la enesima posicion
     * @see <a href="https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci"> fibonnaci <a/>
     * @return el valor encontrado en long dada la posible cantidad de bits
     */
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    //T(n) = T(n-1) + T(n-2) + c_2
    //c_2 + T(n) - 2T(n-1)
}
