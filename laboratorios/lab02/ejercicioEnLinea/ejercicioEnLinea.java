public class ejercicioEnLinea {
    public static void main(String[] args) {
        System.out.println("Array-2: ");
        countEvensTest();
        lucky13Test();
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
        System.out.println("countEvens: ");
        int [][] pruebas = {{2,1,2,3,4},{2,2,0},{1,3,5},{},{11,9,0,1},{2,11,9,0},{2},{2,5,12}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Run: " + countEvens(pruebas[i]));
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
        System.out.println("lucky13: ");
        int [][] pruebas = {{0,2,4},{1,2,3},{1,2,4},{2,7,2,8},{2,7,1,8},{3,7,2,8},{2,7,2,1},{1,2},{2,2},{2},{3},{}};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Run: " + lucky13(pruebas[i]));
        }
    }
}
