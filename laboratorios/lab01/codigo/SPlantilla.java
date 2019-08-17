/**
 * La siguiente clase contiene la solucion al punto #1 del
 * Laboratorio #1 del curso de estructura de datos y algoritmos 1
 * @author Mauricio Toro, Daniel Mesa
 * @version 1.0
 */
public class SPlantilla
{
    /**
         * Realiza el calculo de las formas en las cuales se pueden ubicar
         * los rectangulos 1x2 en otro 2xn ademas dibuja cada una de ellas
     * @param n es el largo del rectangulo que se debe de utilizar para calcular el numero de formas
     *           de ubicar el rectangulo 1x2
     * @return int retorna un entero que representa las formas en las que se puede llenar el rectangulo 2xn
     */
    /**
     *  C_2 + T(n-1) + T(n-2)
     */
    public static int nRectangulos(int n)
    {
        if (n <= 2) return n;   // C_1
        else return nRectangulos(n - 1) + nRectangulos(n - 2); //T(n) = T(n-1) + T(n-2)
    }


    /**
     * Metodo principal, el cual ejecuta el programa e imprime el resultado
     * @param args un array de argumentos
     */
    public static void main(String[] args)
    {
        int pruebas [] ={4,5,7,3,2,8,9};
        for(int i = 0; i < pruebas.length; i++)
        {
            System.out.println(nRectangulos(i));
        }
    }
}
