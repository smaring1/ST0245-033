public class Codigo {

    public static void main(String[] args) {
        System.out.println("Este es es por ordenamiento Merge Sort");
        positiveTest();
        System.out.println("\nEste es por ordenamiento Insertion Sort");
        insertionTest();
    }

    private static int[] actual = {}; //Poner en este arreglo los elementos de prueba

    public static void insertionSort (int[] array) {
        for (int i = 1; i < array.length; i++) {  //2n+1
            int key = array[i];     //1*n
            int j = i-1;    // n
            while(j >= 0 && array[j] > key){ //2*n^2
                array[j+1] = array[j];  //(n^2)*2
                j--;    //n^2
            }
            array[j+1] = key; //n
        }
    }

   public static void mergeSort(int[] a, int n) {
       if (n < 2) {
           return;
       }
       int mid = n / 2;
       int[] l = new int[mid];
       int[] r = new int[n - mid];

       for (int i = 0; i < mid; i++) {
           l[i] = a[i];
       }
       for (int i = mid; i < n; i++) {
           r[i - mid] = a[i];
       }
       mergeSort(l, mid);
       mergeSort(r, n - mid);

       merge(a, l, r, mid, n - mid);
   }

    /**
     * Código tomado de internet
     * https://www.baeldung.com/java-merge-sort
     */
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void insertionTest() {
        long inicio = System.currentTimeMillis();
        insertionSort(actual);
        long terminar = System.currentTimeMillis();
        long total = terminar - inicio;
        System.out.println();
        System.out.println("insertionSort:");
        System.out.println("Para longitud " + actual.length + " tiempo: " + total + " milisegundos");
        for (int a : actual) {
            System.out.print(a+"\t");
        }
    }

    public static void positiveTest() {
        long inicio = System.currentTimeMillis();
        mergeSort(actual, actual.length);
        long terminar = System.currentTimeMillis();
        long total = terminar - inicio;
        System.out.println();
        System.out.println("mergeSort:");
        System.out.println("Para longitud " + actual.length + " tiempo: " + total + " milisegundos");
        for (int a : actual) {
            System.out.print(a+"\t");
        }
    }
}
