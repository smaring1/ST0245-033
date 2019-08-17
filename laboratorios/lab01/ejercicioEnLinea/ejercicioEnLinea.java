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
        System.out.println("\nRecursion-2:\n");
        System.out.println("groupSum6: ");
        groupSum6Test();
        System.out.println("groupNoAdj: ");
        groupNoAdjTest();
    }

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

    public static void groupSum6Test() {
        int pruebaStart [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int pruebaNums [][] = {{5,6,2},{5,6,2},{5,6,2},{1},{9},{},{3,2,4,6},{6,2,4,3},{5,2,4,6},{6,2,4,5},{3,2,4,6},{1,6,2,6,4},{1,6,2,6,4},{1,6,2,6,4},{1,6,2,6,4},{1,6,2,6,5},{1,6,2,6,5},{1,6,2,6,5}};
        int pruebaTarget [] = {8,9,7,1,1,0,8,8,9,9,3,12,13,4,9,14,15,16};
        for (int i = 0; i < 12; i++) {
            System.out.println("Start en la posición "+i+": "+pruebaStart[i]);
        }
        System.out.println();
        int i = 0;
        do{
            System.out.println("Target en la posición "+i+": "+pruebaTarget[i]);
            i++;
        }while(i<pruebaTarget.length);
        System.out.println();
        for (int [] a: pruebaNums
        ) {
            for (int b: a
            ) {
                System.out.println("Matriz en la posicion: "+b);
            }
            System.out.println();
        }

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

    public static void groupNoAdjTest() {
        int pruebaStart [] = {0,0,0,0,0,0,0,0,0,0,0,0};
        int pruebaNums [][] = {{2,5,10,4},{2,5,10,4},{2,5,10,4},{2,5,10,4},{2,5,10,4},{10,2,2,3},{10,2,2,3},{},{1},{9},{9},{5,10,4,1}};
        int pruebaTarget [] = {12,14,7,7,9,15,7,0,1,1,0,11};
        for (int i = 0; i < 12; i++) {
            System.out.println("Start en la posición "+i+": "+pruebaStart[i]);
        }
        System.out.println();
        int i = 0;
        do{
            System.out.println("Target en la posición "+i+": "+pruebaTarget[i]);
            i++;
        }while(i<pruebaTarget.length);
        System.out.println();
        for (int [] a: pruebaNums
             ) {
            for (int b: a
                 ) {
                System.out.println("Matriz en la posicion: "+b);
            }
            System.out.println();
        }
    }
}
