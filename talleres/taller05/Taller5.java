/**
 * La clase Taller5 tiene la intención de resolver el taller número 5.
 *
 * @author Simon Marin, Miguel Fernando Ramos, Mauricio Toro, Andres Paez
 * @version 1
 */

public class Taller5 {



    /**
     * @param array es una arreglo de numeros enteros.
     * El método suma tiene la intención de hacer el proceso de suma
     * mediante una funcion cíclica (while/for/...)
     * @return la suma de todos los numeros sumados.
     *    T(n) = c1 + c2 + 3n + n
     *      O(c1+c2+3n+n)
     *      O(3n)
     *      O(n)
     */
    public static int suma (int[]array){
        int resultado = 0; // c1
        for (int i = 0; i < array.length ; i++) { // 3n
            resultado += array[i]; // n
        }
        return resultado; // c2
    }
 

    /**
     * @param num es el numero el cual se utiliza para ser multiplicado.
     * El método mul tiene la intención de hacer la multiplicación
     * de 1 a n por el numero mul
     * mediante una funcion cíclica (while/for/...)
     *
     */
    public static void mul (int num) {
        for (int i = 0; i <= 10; i++) { // 3n
            System.out.println(num + " x " + i + " = " + (num * i)); //n
        }
    }
    // T(n) = 3n+n
    //O(3n+n)
    //O(3n)
    //O(n)

    /**
     * @param array es un arreglo de números desordenados
     * El método insertionSort tiene la intención ordenar los números
     * del arreglo array por el método insertion:
     * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
     * mediante la anidación de funciones cíclicas (while/for/...)
     *
     * Complejidad...
     *
     * O(2n+1+1*n+n+2*n^2+(n^2)*2)+n^2+n+n)
     * O(2*n^2)
     * O(n^2)
     *
     */
    public static int[] insertionSort (int[] array){
        for (int i = 1; i < array.length; i++) {  //2n+1
            int key = array[i];     //1*n
            int j = i-1;    // n
            while(j>=0 && array[j]>key){ //2*n^2
                array[j+1]=array[j];  //(n^2)*2
                j--;    //n^2
            }
            array[j+1]=key; //n
        }
        return array; //n
    }
}
