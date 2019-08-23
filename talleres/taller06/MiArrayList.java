
/**
 * La clase MiArrayList tiene la intención de representar un objeto que simule el comportamiento
 * de la clase ya implementada "ArrayList"
 * es claro que no se puede utilizar dicha estructura ya utilizada dentro de este ejercicio. 
 * Para más información de la clase ArrayList:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 *
 *
 * @author Mauricio Toro, Andres Paez, Miguel Fernando Ramos, Simón marín
 * @version 1
 */

public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MiArrayList() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }


    /**
     * Tiene la intención de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return this.size;
    }

    /**
     * @param e el elemento a guardar
     * Agrega un elemento e a la última posición de la lista
     *
     */
    public void add1(int e) {
        if (size == elements.length) { // C1 = 2      O(1)
            int[] nuevo = new int[elements.length*2]; // C2 = 3   O(1)
            for (int i = 0; i < elements.length; i++) // C3 + C4n O(n)
                nuevo[i] = elements[i];  // C5n             O(n)
            elements = nuevo;    //C6         O(1)
        }
        elements[size] = e; // C7        O(1)
        size++; // C8
    }


    /**
     * @param i es un íncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posición i de la lista.
     *
     */
    public int get(int i) {
        if (i < size && i >= 0)   // C1

            return elements[i];   // C2
        else
            throw new ArrayIndexOutOfBoundsException(); // C3

    }


    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posición index de la lista
     *
     */
    public void add(int index, int e) {
        if (size == elements.length) {
            int [] nuevo = new int [elements.length*2];
            for (int i = 0; i < elements.length; i++) {
                nuevo[i] = elements[i];
            }
            elements = nuevo;

        }
        int [] nuevo1;
        nuevo1 = elements;
        for (int i = index+1; i < elements.length; i++) {
            nuevo1[i] = elements[i-1];
        }
        elements = nuevo1;
        elements[size] = e;
        size++;
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     *
     * ELimina el elemento  en la posición index de la lista
     *
     */
    public void del(int index){
        int [] nuevo1;
        nuevo1=elements;
        for (int i = index; i < elements.length-1; i++) {
            nuevo1[i] = elements[i+1];
        }
        elements = nuevo1;
        size--;
    }
    public static void main (String[] args){
        MiArrayList prueba= new MiArrayList();
        prueba.add1('1');
        System.out.println(prueba.size());
        prueba.add('2',1);
        System.out.println(prueba.size());
        prueba.del(0);
        System.out.println(prueba.size());
    }
}
