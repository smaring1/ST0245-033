import java.util.Scanner;

/**
 *
 * @author Simón Marín, Miguel Fernando Ramos
 */
public class Laboratorio4 {

    public static void main(String[] args) {
        Print(Arbol());
    }

    public static Tree Arbol(){
        Scanner teclado = new Scanner(System.in);
        int[] elementos = new int[9];
        for(int i =0; i<elementos.length;i++){
            System.out.println("Ingrese el elemento "+(i+1)+" de 9");
            elementos[i] = teclado.nextInt();
        }
        Tree arbol = new Tree(elementos[0]);
        for(int i =1; i<elementos.length;i++){
            arbol.insert(arbol.node, elementos[i]);
        }
        return arbol;
    }

    public static void Print(Tree arbol) {
        PrintAux(arbol.node);
    }

    public static void PrintAux(Node nodo) {
        if( nodo!=null ) {
            PrintAux(nodo.left);
            PrintAux(nodo.right);
            System.out.print(nodo.value + "\t");
        }
    }

}
class Node {
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }

}
class Tree {
    Node node;
    Tree(int value){
        node = new Node(value);
    }

    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }else if(value < node.value){
            node.left = insert(node.left, value);
        }else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }
}
