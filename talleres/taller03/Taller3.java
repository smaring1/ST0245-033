
/**
 * La clase Taller3 tiene como objtivo dar solución a los puntos del taller 3
 *
 * @author Simon Marin, Miguel Fernando Ramos, Mauricio Toro, Andrés Páez
 * @version 1
 */


public class Taller3 {

    /**
     * El método torresDeHannoi es un auxiliar del proceso
     *
     * @param n numero de discos
     */

    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n, 1, 2, 3);
    }

    /**
     * El método torresDeHannoi es un auxiliar del proceso
     *
     * @param n          numero de discos
     * @param origen     la torre número uno donde se posicionan todos los discos inicialmente
     * @param destino    la torre donde deben posicionarse todos los discos terminado el proceso
     * @param intermedio torre auxiliar para que el cambio de torres se haga efectivo
     *                   <p>
     *                   debe devolver la secuencia de pasos en consola de esta manera:
     *                   System.out.println("Disk "+ n + " from "+ origen + " to "+ destino);
     * @see <a href="http://www.uterra.com/juegos/torre_hanoi.php"> Simulación del funcionamiento</a>
     * @see <a href="https://es.wikipedia.org/wiki/Torres_de_Han%C3%B3i"> Un poco de historia </a>
     */

    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
        if (n == 1) {
            System.out.println("Disk " + n + " from " + origen + " to " + destino);
        } else {
            torresDeHannoiAux(n - 1, origen, destino, intermedio);
            System.out.println("Disk " + n + " from " + origen + " to " + destino);
            torresDeHannoiAux(n - 1, intermedio, origen, destino);
        }
    }


    /**
     * El método combinations es un auxiliar del proceso
     *
     * @param s es la cadena a permutar
     */
    public static void combinations(String s) {
        combinationsAux("", s);
    }

    /**
     * El método combinationsAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena s
     *
     * @param s      es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *               <p>
     *               Las cadenas de salida tienes una longitud desde 0 hasta el lenght de la cadena s
     *               por simplicidad del ejercicio no se repiten letras y el orden de la secuencia
     *               no supone importancia, es decir, la cadena AB es igual a la cadena BA.
     *               Ej: para la cadena ABC se tiene la salida: { A, AB, ABC, AC, B, BC, C}
     */
    private static void combinationsAux(String prefix, String s) {
        if (s.length() > 0) {
            System.out.println(prefix + s.charAt(0));
            combinationsAux(prefix + s.charAt(0), s.substring(1));
            combinationsAux(prefix, s.substring(1));
        }
    }


    /**
     * El método permutation es un auxiliar del proceso
     *
     * @param str es la cadena a permutar
     */

    public static void permutation(String str) {
        permutationAux("", str);
    }


    /**
     * El método permutationAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena str
     *
     * @param str    es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *               <p>
     *               Las cadenas de salida tienes una longitud de lenght de la cadena s
     *               Ej: para la cadena AB se tiene la salida: { ABC,ACB,BAC,BCA,CAB,CBA }
     *               donde los caracteres no se repiten pero el orden tiene un papel importante.
     */
    private static void permutationAux(String prefix, String str) {
        int n = str.length();
        if (n > 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i <= n; i++) {
                String aux = str.substring(0,i)+str.substring(i,n);
                permutationAux(prefix,aux);
            }
        }
    }
}
