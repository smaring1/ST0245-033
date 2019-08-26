import java.util.Arrays;

public class ejercicioEnLinea {
    public static void main(String[] args) {
        System.out.println("Array-2: ");
        countEvensTest();
        lucky13Test();
        only14Test();
        zeroMaxTest();
        sum13Test();
        System.out.println("\n\nArray-3: ");
        maxSpanTest();
        squareUpTest();
    }

    public static int countEvens(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {

            if ((nums[i]) % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static void countEvensTest() {
        System.out.println("\ncountEvens: ");
        int [][] pruebas = {{2,1,2,3,4},{2,2,0},{1,3,5},{},
                {11,9,0,1},{2,11,9,0},{2},{2,5,12}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + countEvens(pruebas[i]));
        }
    }

    public static boolean lucky13(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                cont++;
            }
        }
        if (cont > 0) {
            return false;
        }
        return true;
    }

    public static void lucky13Test() {
        System.out.println("\nlucky13: ");
        int [][] pruebas = {{0,2,4},{1,2,3},{1,2,4},{2,7,2,8},
                {2,7,1,8},{3,7,2,8},{2,7,2,1},{1,2},{2,2},{2},{3},{}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + lucky13(pruebas[i]));
        }
    }

    public static boolean only14(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 || nums[i] == 1) {
                cont++;
            }
        }
        if (cont == nums.length) {
            return true;
        }
        return false;
    }

    public static void only14Test() {
        System.out.println("\nonly14: ");
        int [][] pruebas = {{1,4,1,4},{1,4,2,4},{1,1},{4,1},{2},{},
                {1,4,1,3},{3,1,3},{1},{4},{3,4},{1,3,4},
                {1,1,1},{1,1,1,5},{4,1,4,1}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + only14(pruebas[i]));
        }
    }

    public static int[] zeroMax(int[] nums) {
        int maximo = 0;
        for (int j =0; j < nums.length -1;j++) {
            if (nums[j] == 0) {
                for (int i = j + 1; i <=nums.length -1;i++) {
                    if ( nums[i] > maximo && nums[i] % 2 == 1 )
                        maximo = nums[i];
                }
                nums[j] = maximo;
                maximo = 0;
            }
        }
        return nums;
    }

    public static void zeroMaxTest() {
        System.out.println("\nzeroMax: ");
        int [][] pruebas = {{0,5,0,3},{0,4,0,3},{0,1,0},{0,1,5},
                {0,2,0},{1},{0},{},{7,0,4,3,0,2},
                {7,0,4,3,0,1},{7,0,4,3,0,0},{7,0,1,0,0,7}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + Arrays.toString(zeroMax(pruebas[i])));
        }
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else if (nums[i] == 13 && i < nums.length - 1) {
                nums[i] = 0;
                nums[i+1] = 0;
            }
        }
        return sum;
    }

    public static void sum13Test() {
        System.out.println("\nsum13: ");
        int [][] pruebas = {{1,2,2,1},{1,1},{1,2,2,1,13},{1,2,13,2,1,13},
                {13,1,2,13,2,1,13},{},{13},{13,13},{13,0,13},{13,1,13},{5,7,2},
                {5,13,2},{0},{13,0}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + sum13(pruebas[i]));
        }
    }

    public static int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums[0] == nums[nums.length-1]) {
            return nums.length;
        } else {
            return nums.length-1;
        }
    }

    public static void maxSpanTest() {
        System.out.println("\nmaxSpan: ");
        int [][] pruebas = {{1,2,1,1,3},{1,4,2,1,4,1,4},
                {1,4,2,1,4,4,4},{3,3,3},{3,9,3},{3,9,9},
                {3,9},{3,3},{},{1}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + maxSpan(pruebas[i]));
        }
    }

    public static int[] squareUp(int n) {
        int[] arreglo = new int[n * n];
        int paso = 1;
        int indice = 0;
        if(n == 0) {
            return arreglo;
        }
        for (int i = n-1; i < arreglo.length; i+=n) {
            indice = i;
            for (int j = 1; j <= paso; j++) {
                if (j == 0) {
                    break;
                }
                arreglo[indice] = j;
                indice--;
            }
            paso++;
        }
        return arreglo;
    }

    public static void squareUpTest() {
        System.out.println("\nsquareUp: ");
        int [] pruebas = {3,2,4,1,0,6};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + pruebas[i] + ", Run: " + Arrays.toString(squareUp(pruebas[i])));
        }
    }
}
