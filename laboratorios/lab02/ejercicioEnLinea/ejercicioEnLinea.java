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
        maxMirrorTest();
        linearInTest();
        seriesUpTest();
    }

    public static int countEvens(int[] nums) {
        int cont = 0;       // C1
        for (int i = 0; i < nums.length; i++) { // C2 + C3 * n 

            if ((nums[i]) % 2 == 0) {   // C4*n
                cont++; // C5*n
            }
        }
        return cont;// C6
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
        int cont = 0; // C_1
        for (int i = 0; i < nums.length; i++) { // C_2 + C_3*n
            if (nums[i] == 1 || nums[i] == 3) { // C_4 + C_5*n
                cont++; // C_6*n
            }
        }
        if (cont > 0) { // C_7
            return false;// C_8
        }
        return true; //C_9
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
        int cont = 0; // C_1
        for (int i = 0; i < nums.length; i++) { // C_2+C_3*n
            if (nums[i] == 4 || nums[i] == 1) { //C_3 + C_4*n
                cont++; // C_5*n
            }
        }
        if (cont == nums.length) { //C_6
            return true; //C_7
        }
        return false; //C_8
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
        int maximo = 0;//C_1
        for (int j =0; j < nums.length -1;j++) {//C_2+C_3*n
            if (nums[j] == 0) { //C_4 * n
                for (int i = j + 1; i <=nums.length -1;i++) { // (C_5 + C_6*n)*n
                    if ( nums[i] > maximo && nums[i] % 2 == 1 ) //C_7*n*n
                        maximo = nums[i]; //C_8*n*n
                }
                nums[j] = maximo; //C_9*n
                maximo = 0; //C_10*n
            }
        }
        return nums; //C_11
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
        int sum = 0; //C_1
        for (int i = 0; i < nums.length; i++) { //C_2+C_3*n
            if (nums[i] != 13) { // C_4*n
                sum += nums[i];// C_5*n
            } else if (nums[i] == 13 && i < nums.length - 1) { //C_6+C_7*n
                nums[i] = 0; //C_8*n
                nums[i+1] = 0;//C_9*n
            }
        }
        return sum;//C_10
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
            System.out.println("Para n: " + pruebas[i] + ", Run: " + Arrays.toString(squareUp(pruebas[i])));
        }
    }

    public static int maxMirror(int[] nums) {
        int longitud = nums.length;
        int cont= 0;
        int max = 0;
        for (int i = 0; i < longitud; i++){
            cont = 0;
            for (int j = longitud-1; i + cont < longitud && j > -1; j--){
                if(nums[i+cont] == nums[j]){
                    cont++;
                } else {
                    if (cont > 0){
                        max = Math.max(cont,max);
                        cont = 0;
                    }
                }
            }
            max = Math.max(cont,max);
        }
        return max;
    }

    public static void maxMirrorTest() {
        System.out.println("\nmaxMirror");
        int [][] pruebas = {{1,2,3,8,9,3,2},{1,2,1,4},{7,1,2,9,7,2},
                {21,22,9,8,7,6,23,24,6,7,8,9,25,7,8,9},
                {1,2,1,20,21,1,2,1,2,23,24,2,1,2,1,25},{1,2,3,2,1},
                {1,2,3,3,8},{1,2,7,8,1,7},{1,1,1},{1},{},{9,1,1,4,2,1,1,1},
                {5,9,9,4,5,4,9,9,2},{5,9,9,6,5,4,9,9,2},
                {5,9,1,6,5,4,1,9,5}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para " + Arrays.toString(pruebas[i]) + ", Run: " + maxMirror(pruebas[i]));
        }
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int encontrados = 0;
        if (inner.length == 0) {
            return true;
        }
        int pos = 0;
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[pos]) {
                encontrados++;
                pos++;
            } else if (outer[i] > inner[pos]) {
                return false;
            }
            if (encontrados == inner.length) {
                return true;
            }
        }
        return false;
    }

    public static void linearInTest() {
        System.out.println("\nlinearIn");
        int [][] pruebasOuter = {{1,2,4,6},{1,2,4,6},{1,2,4,6},{2,2,4,4,6,6},
                {2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,4},{1,2,3},{1,2,3},{1,2,3},
                {-1,0,3,3,3,10,12},{-1,0,3,3,3,10,12},{-1,0,3,3,3,10,12}};
        int [][] pruebasInner = {{2,4},{2,3,4},{2,4},{2,4},{2,2},{2,4},
                {2,4},{2},{-1},{},{-1,0,3,12},{0,3,12,14},{-1,10,11}};
        for (int i = 0; i < pruebasInner.length; i++) {
            System.out.println("Para outer: " + Arrays.toString(pruebasOuter[i])
                    + " e inner: " + Arrays.toString(pruebasInner[i]) + ", Run: " +
                    linearIn(pruebasOuter[i], pruebasInner[i]));
        }
    }

    public static int[] seriesUp(int n) {
        int[] arreglo = new int[n * (n + 1) / 2];
        int i = 0;
        for (int j = 1; j <= n; ++j) {
            for (int k = 1; k <= j; ++k) {
                arreglo[i++] = k;
            }
        }
        return arreglo;
    }

    public static void seriesUpTest() {
        System.out.println("\nseriesUp: ");
        int [] pruebas = {3,4,2,1,0,6};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Para n: " + pruebas[i] + ", Run: " +
                    Arrays.toString(seriesUp(pruebas[i])));
        }
    }
}
