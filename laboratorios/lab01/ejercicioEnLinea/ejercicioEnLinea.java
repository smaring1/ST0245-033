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

    public static boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

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
