
public class Main {

    public static void main(String[] args) {
        int variable;
        Contador c = new Contador("Mauricio");
        System.out.println("Iniciamos el contador en 0");
        variable = c.leerValorIcremento();
        for (int i = 0; i < variable; ++i) {
            c.incrementar();
        }
        System.out.println("Hacemos aumento de "+ variable +" al contador,"+ c);
        variable = c.leerValorDecremento();
        for (int i = 0; i < variable ; i++) {
            c.descrementar();
        }
        System.out.println("Hacemos una disminución de "+ variable +" al contador,"+ c);
        System.out.println("\nAl final,"+c);

        System.out.println();

        Punto p = new Punto(20, 10);
        System.out.printf("Punto: {%f, %f}\n", p.x(), p.y());
        System.out.println("Radio Polar: " + p.radioPolar());
        System.out.println("Angulo Polar: " + Math.toDegrees(p.anguloPolar()));
        System.out.println("Angulo Polar: " + p.distanciaEuclidiana(new Punto(0, 0)));

        System.out.println();

        Fecha f1 = new Fecha(26, 5, 2001);
        Fecha f2 = new Fecha(26, 5, 2001);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.comparar(f2));
    }
}
