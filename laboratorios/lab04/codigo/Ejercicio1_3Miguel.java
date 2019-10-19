
/**
 *
 * @author Simón Marín, Miguel Fernando Ramos
 */
public class Ejercicio1_3Miguel {
    public static void main(String[] args) {
        BinaryTree yo = new BinaryTree("Miguel Ramos Subero");
        yo.getRoot().setPadre("Migeul Ramos Garcia");
        yo.getRoot().setMadre("Helena García");
        Node papa = yo.getRoot().getPadre();
        Node mama = yo.getRoot().getMadre();
        papa.setPadre("Andres Ramos");
        papa.setMadre("Cristina Subero");
        mama.setPadre("Roberto Garcia");
        mama.setMadre("Ruth Mery Ramirez");
        Node abueloPaterno = papa.getPadre();
        Node abuelaPaterna = papa.getMadre();
        Node abueloMaterno = mama.getPadre();
        Node abuelaMaterna = mama.getMadre();
        abueloPaterno.setPadre("Jose Ramos");
        abueloPaterno.setMadre("Josefa Bermude");
        abuelaPaterna.setPadre("Gonzalo Garcia");
        abuelaPaterna.setMadre("Isabel Montoya");
        abueloMaterno.setPadre("Jesus Esteban Garcia Aristizabal");
        abueloMaterno.setMadre("Maria Cristina Henao");
        abuelaMaterna.setPadre("Jesus Maria Roldan");
        abuelaMaterna.setMadre("Carmenza Gomez Ramires");
    }
}

class BinaryTree {
    Node root;

    public BinaryTree(String name) {
        root = new Node(name);
    }

    public Node getRoot() {
        return root;
    }

    public String getAbuelaMaterna() {
        String nombre = this.root.getMadre().getMadre().nombre;
        if (nombre != null) return nombre;
        return "No esta definido este miembro.";
    }
}

class Node {
    String nombre;
    private Node mama;
    private Node papa;

    public Node (String nombre) {
        this.nombre = nombre;
    }

    public Node getPadre() {
        if (papa != null) return papa;
        else return null;
    }

    public Node getMadre() {
        if (mama != null) return mama;
        else return null;
    }

    public void setPadre(String padre) {
        papa = new Node(padre);
    }

    public void setMadre(String madre) {
        mama = new Node(madre);
    }
}
