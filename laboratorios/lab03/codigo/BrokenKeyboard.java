/**
 * En esta clase se da solución al
 * ejercicio del teclado roto.
 *
 * @author Simón Marín, Miguel Fernando Ramos
 * @version Septiembre 4, 2019.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class BrokenKeyboard {
    public static void main(String[] args) {
        brokenKeyboardTest();
    }

    public static void brokenKeyboardTest() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presione 1 para ingresar su propia cadena de prueba\n" +
                "o bien, presione 2 para proceder con los tests predefinidos. \n" +
                "Recuerde que \"[\" presiona la tecla \"inicio\" y \n" +
                "\"]\" presiona la tecla \"fin\": ");
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese su cadena de prueba: ");
                        String prueba = teclado.nextLine();
                        System.out.println("\nPara la cadena ingresada: " +
                                prueba + "\nEl resultado es: ");
                        System.out.println(brokenKeyboard(prueba));
                        break;
                    case 2:
                        String [] tests = {"This_is_a_[Beiju]_text",
                                "[[]][][]Happy_Birthday_to_Tsinghua_University",
                                "asd[fgh[jkl","asd[fgh[jkl[",
                                "[[a[[d[f[[g[g[h[h[dgd[fgsfa[f",
                                "asd[gfh[[dfh]hgh]fdfhd[dfg[d]g[d]dg"};
                        for (int i = 0; i < tests.length; i++) {
                            System.out.println("Para la cadena: " + tests[i] +
                                    "\nEl resultado es: ");
                            System.out.println(brokenKeyboard(tests[i]));
                        }
                        break;
                    default:
                        opcion = 0;
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("El valor ingresado no es valido. \nIntente nuevamente.");
            }
        } while (opcion == 0);
    }

    public static String brokenKeyboard(String prueba) { //Falta terminarlo.
        LinkedList<String> lista = new LinkedList<>();
        boolean alFinal = true;
        int k = 0;
        for (int i = 0; i < prueba.length(); i++) {
            if (prueba.charAt(i) == '[') {
                if (alFinal) {
                    lista.addLast(prueba.substring(k,i));
                } else {
                    lista.addFirst(prueba.substring(k,i));
                }

                k = i + 1;
                alFinal = false;
            }

            if (prueba.charAt(i) == ']') {
                if (alFinal) {
                    lista.addLast(prueba.substring(k,i));
                } else {
                    lista.addFirst(prueba.substring(k,i));
                }

                k = i + 1;
                alFinal = true;
            }
        }

        if (alFinal) {
            lista.addLast(prueba.substring(k));
        } else {
            lista.addFirst(prueba.substring(k));
        }

        String resultado = "";
        for (String a:
             lista) {
            resultado += a;
        }
        return resultado;
    }
}
