
/**
 *
 * @author Simon Marin, Miguel Fernando Ramos
 */
public class Ejercicio1_3Miguel {
    public static void main(String[] args) {
        BinaryTree yo = new BinaryTree("Simon Marin Giraldo");
        yo.getRoot().setPadre("Fabio Marin Ramirez");
        yo.getRoot().setMadre("Norfi Yamile Giraldo Gomez");
        Node papa = yo.getRoot().getPadre();
        Node mama = yo.getRoot().getMadre();
        papa.setPadre("Luis Milagros Marin Vahos");
        papa.setMadre("Maria Fabiola Ramirez Morales");
        mama.setPadre("Francisco Javier Giraldo Aristizabal");
        mama.setMadre("Maria Margarita Gomez Giraldo");
        Node abueloPaterno = papa.getPadre();
        Node abuelaPaterna = papa.getMadre();
        Node abueloMaterno = mama.getPadre();
        Node abuelaMaterna = mama.getMadre();
        abueloPaterno.setPadre("Sebulon Marin");
        abueloPaterno.setMadre("Anita Vahos");
        abuelaPaterna.setPadre("Senon Ramirez");
        abuelaPaterna.setMadre("Isabel Morales");
        abueloMaterno.setPadre("Jesus Pascual Giraldo Aristizabal");
        abueloMaterno.setMadre("Maria Dolores Aristizabal Duque");
        abuelaMaterna.setPadre("Jesus Maria Giraldo Giralo");
        abuelaMaterna.setMadre("Maria de Jesus Gomez De Giraldo");
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
