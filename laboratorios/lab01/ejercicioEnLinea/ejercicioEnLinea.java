/**
 * @author Simon Marin, Miguel Fernando Ramos
 * Los códigos de Recursion-2 fueron tomados de solucionarios
 * de codingbat en internet. El progreso de lo demás
 * se puede verificar en codingbat
 * https://codingbat.com/done?user=simonmaring11@gmail.com&tag=6200951609
 */
public class ejercicioEnLinea {
    public static void main(String[] args) {
        System.out.println("Recursion-1: \n");
        System.out.println("factorial: ");
        factorialTest();
        System.out.println("bunnyEars2: ");
        bunnies2Test();
        System.out.println("powerN: ");
        powerNTest();
        System.out.println("triangle");
        triangleTest();
        System.out.println("fibonacci: ");
        fibonacciTest();
    }
                  //RECURSION-1

    /**
     * Este método saca el factorial de un número dado.
     * @param n Es el número al cual se le va
     * a sacar el factorial.
     * @return el factorial de n.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
    
    public static void factorialTest() {
        int pruebas [] = {1,2,3,4,5,6,7,8,12,13,200};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("El factorial de " + (pruebas[i]) + " es " + factorial(pruebas[i]));
        }
        System.out.println();
    }

    /**
     * Este método calcula la cantidad de orejas
     * que hay en una cantidad dada de conejos, siendo
     * los conejos en posiciones pares de tres orejas
     * y los conejos en posiciones impares de dos orejas.
     * @param bunnies la cantidad de conejos
     * @return la cantidad de orejas, teniendo
     * los conejos en posición par tres orejas y
     * los conejos en posición impar dos orejas.
     * Se retorna la suma total de orejas.
     */
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return bunnyEars2(bunnies - 1) + 3;
        } else {
            return bunnyEars2(bunnies-1) + 2;
        }
    }

    public static void bunnies2Test() {
        int pruebas [] = {0,1,2,3,4,5,6,10};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para Bunnies = " + pruebas[i] + " hay " + bunnyEars2(pruebas[i]) + " orejas.");
        }
        System.out.println();
    }

    /**
     * Este método calcula la potencia de un número elevado
     * a cierto exponente.
     * @param base el número a elevar a la potencia n
     * @param n la potencia a la cual se eleva el número 
     * dado en el parámetro base.
     * @return base elevado a la n potencia.
     */
    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return base;
        } else {
            return powerN(base, n-1) * base;
        }
    }

    public static void powerNTest() {
        int pruebasBase [] = {3,3,3,2,2,2,2,2,10,10,10};
        int pruebasN [] = {1,2,3,1,2,3,4,5,1,2,3};
        for (int i = 0; i < pruebasBase.length; i++) {
            System.out.println(pruebasBase[i] + " a la " + pruebasN[i] + " = " + powerN(pruebasBase[i], pruebasN[i]));
        }
        System.out.println();
    }

    /**
     * @param rows la cantidad de filas horizontales
     * que tiene el triángulo.
     * @return el número de bloques necesarios para 
     * construir dicho triángulo con las filas dadas.
     */
    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else if (rows == 1) {
            return 1;
        } else {
            return triangle(rows-1) + rows;
        }
    }

    public static void triangleTest() {
        int pruebas [] = {0,1,2,3,4,5,6,7};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para filas = " + pruebas[i] + ", bloques = " + triangle(pruebas[i]));
        }
        System.out.println();
    }

    /**
     * Este método calcula el número de Fibonacci en
     * la posición dada.
     * @param n la posición en la cual se desea conocer
     * el valor del número de fibonacci.
     * @return el valor de fibonacci en la posición n.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void fibonacciTest() {
        int pruebas [] = {0,1,2,3,4,5,6,7};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para n = " + pruebas[i] + " el valor en fibonacci es de: " + fibonacci(pruebas[i]));
        }
        System.out.println();
    }
                 //RECURSION-2

    /**
     * Este método determina si dado un arreglo de enteros,
     * es posible escoger un grupo de algunos enteros, de tal
     * manera que, la suma del grupo sea igual al entero objetivo (target).
     * @param start posición de comienzo del arreglo.
     * @param nums arreglo de enteros a considerar.
     * @param target valor esperado.
     * @return true si la suma del grupo es igual al
     * entero dado. De lo contrario, retorna false.
     */
    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum6(start + 1, nums, target);
    }

    /**
     * Este método determina si, dado un arreglo de enteros,
     * es posible escoger un grupo de algunos de los enteros,
     * comenzando por el índice de inicio (start), tal que la
     * suma de los elementos en el grupo sea igual al (entero dado)
     * objetivo (target). Sin embargo, con la restricción de que si 
     * un valor en el arreglo es incluído en el grupo, el valor
     * que sigue inmediatamente a este en el arreglo no puede
     * ser incluído.
     * @param start índice o posición de inicio.
     * @param nums arreglo de enteros a considerar.
     * @param target valor esperado.
     * @return true si se cumple. De lo contrario retorna false.
     */
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
        if (groupNoAdj(start+1, nums, target)) {
            return true;
        }
        if (groupNoAdj(start+2, nums, target-nums[start])) {
            return true;
        }
        return false;
    }

    /**
     * Este método determina si, dado un arreglo de enteros,
     * es posible tomar un grupo de algunos de los enteros,
     * comenzando por el índice o posición de inicio (start),
     * de tal manera que la suma de los elementos en el grupo
     * sea igual al entero objetivo dado (target). Sin embargo,
     * con la condición adicional de que si hay números en el
     * arreglo que son adyacentes y tienen ambos el mismo valor,
     * se abren dos posibilidades: La primera en la que se pueden
     * incluir a todos en el grupo, o la segunda, que es no incluir
     * a ninguno.
     * @param start índice o posición de inicio.
     * @param nums arreglo de enteros a considerar.
     * @param target valor esperado.
     * @return true si se cumple. De lo contrario retorna false.
     */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int i = start;
        int sum = 0;
        while (i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }
        if (groupSumClump(i, nums, target - sum)) {
            return true;
        }
        if (groupSumClump(i, nums, target)) {
            return true;
        }
        return false;
    }

    /**
     * Este método determina si, dado un arreglo de enteros,
     * se puede dividir el arreglo en dos nuevos arreglos,
     * de tal manera que, la suma de ambos grupos sea la misma.
     * Con la condición adicional de que todos los números que
     * sean múltiplos de 5 deben estar en un grupo, y todos los
     * que sean múltiplos de 3 (y solamente de 3, no de 5),
     * deberán estar en otro grupo.
     * En este método se trabaja con un auxiliar
     * que evalúa todos los condicionales y devuelve el
     * resultado al método split53
     * @param nums arreglo de enteros a considerar.
     * @return true si se cumple. De lo contrario retorna false.
     */
    public static boolean split53(int[] nums) {
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        return recArray(nums, index, sum1, sum2);
    }
    
    private static boolean recArray ( int[] nums, int index, int sum1, int sum2 ) {
        if ( index >= nums.length ) {
            return sum1 == sum2;
        }
        int value = nums[index];
        if (value%5 == 0) {
            return recArray(nums, index + 1, sum1 + value, sum2);
        } else if (value%3 == 0) {
            return recArray(nums, index + 1, sum1, sum2 + value);
        } else {
            return (recArray(nums, index + 1, sum1 + value, sum2) ||
                    recArray(nums, index + 1, sum1, sum2 + value));
        }
    }

    /**
     * Este método determina si, dado un arreglo de enteros,
     * es posible dividir el arreglo en dos nuevos arreglos,
     * de tal manera que la suma de los dos grupos sea la misma.
     * Cada entero debe estar en uno u otro grupo.
     * @param nums arreglo de enteros a considerar.
     * @return true si se cumple. De lo contrario retorna false.
     */
    public static boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

    /**
     * @param start
     * @param nums
     * @param group1
     * @param group2
     * @return
     */
    public static boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
        if (start >= nums.length) {
            return group1 == group2;
        }
        if (splitArrayHelper(start+1, nums, group1 + nums[start], group2)) {
            return true;
        }
        if (splitArrayHelper(start+1, nums, group1, group2 + nums[start])) {
            return true;
        }
        return false;
    }
}

