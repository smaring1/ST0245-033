public class ejercicioEnLinea {
    public static void main(String[] args) {
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
}
