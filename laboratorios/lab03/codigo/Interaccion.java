import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Scanner;

public class MarcoDeDatos {
    public static LinkedList<Estudiantes> readFile(int course) {

        String fileName = "";
        if (course == 1) {
            fileName = "NOTAS ST0242";
        }
        if (course == 2) {
            fileName = "NOTAS ST0245";
        }
        if (course == 3) {
            fileName = "NOTAS ST0247";
        }
        LinkedList<Estudiantes> listStudent = eliminar(leer(fileName));
        LinkedList<Estudiantes> listStudent1 = purify(listStudent);

        return listStudent1;
    }
    public static LinkedList<String> leer(String Filename) {
        LinkedList<String> datos = new LinkedList<>();
        try {
            String ruta = "" + Filename + ".csv";
            File file = new File(ruta);
            Scanner teclado = new Scanner(file);

            int cont = 0; //Contador para determinar cantidad de datos

            while (teclado.hasNext()) {
                String line = teclado.nextLine();
                datos.add(line);
                cont++;
            }
        }catch (FileNotFoundException e){
            System.err.println("File no encontrado "+e.getMessage());
        }
        return datos;
    }
    public static LinkedList<Estudiantes> eliminar(LinkedList<String> list) {
        LinkedList<Estudiantes> listStudent = new LinkedList<>();
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0).equals("")) {
                list.remove(0);
            }
            String nombre, curso, semestre;
            int nota;
            String lineas = list.get(0);
            String[] arrayTemp = lineas.split(",");
            nombre = limpiarAcentos(arrayTemp[0]);
            curso = arrayTemp[10];
            semestre = arrayTemp[3];
            if (arrayTemp.length == 15) {
                nota = (int) Float.parseFloat(arrayTemp[14]);
            } else {
                nota = (int) Float.parseFloat(arrayTemp[13]);
            }
            list.remove(0);
            Estudiantes estudiante = new Estudiantes(nombre, curso, semestre, nota);
            listStudent.add(estudiante);
            i--;
        }
        return listStudent;
    }
    public static LinkedList<Estudiantes> purify(LinkedList<Estudiantes> listaEstudiantes) {
        int tam = listaEstudiantes.size() - 1;
        for (int i = 0; i < tam; i++) {
            boolean c = listaEstudiantes.get(i).getNombre().equals(listaEstudiantes.get(i + 1).getNombre());
            if (c) {
                listaEstudiantes.remove(i);
                i--;
                tam--;
            }
        }
        return listaEstudiantes;
    }

    public static void printCourses(String nameStudent, String semester) {
        LinkedList<Estudiantes> listStudent1 = readFile(1);
        LinkedList<Estudiantes> listStudent2 = readFile(2);
        LinkedList<Estudiantes> listStudent3 = readFile(3);
        System.out.println(nameStudent + " ha realizado los siguientes cursos: ");
        search(listStudent1, nameStudent);
        search(listStudent2, nameStudent);
        search(listStudent3, nameStudent);
    }

    public static void search(LinkedList<Estudiantes> listStudent, String nameStudent) {
        int tam = listStudent.size();
        for (int i = 0; i < tam; i++) {
            if (listStudent.get(0).getNombre().equals(nameStudent)) {
                System.out.println(listStudent.get(0).getCurso() + ": " + listStudent.get(0).getNota());
                break;
            } else {
                listStudent.remove();
                i--;
                tam--;
            }
        }
    }
    public static void filter(LinkedList<Estudiantes> listStudent, String semester) {
        int tam = listStudent.size();
        System.out.println("\nLos estudiantes del semestre " + semester + " del curso de "
                + listStudent.get(0).getCurso() + " son: ");
        System.out.println("Estudiante: Nota Definitiva");
        for (int i = 0; i < tam; i++) {
            if (listStudent.get(i).getSemestre().equals(semester)) {
                System.out.println(listStudent.get(i).getNombre() + ": " + listStudent.get(i).getNota());
            } else {
                listStudent.remove();
                i--;
                tam--;
            }
        }
    }

    /**
     *autor: ventur
     * fechq: 1/11/2016
     * https://es.stackoverflow.com/questions/31178/c%C3%B3mo-limpiar-string-de-tildes-en-java
     *
     */
    public static String limpiarAcentos(String cadena) {
        String limpio =null;
        if (cadena !=null) {
            String valor = cadena;
            //valor = valor.toUpperCase();
            // Normalizar texto para eliminar acentos, dieresis, cedillas y tildes
            limpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
            // Quitar caracteres no ASCII excepto la enie, interrogacion que abre, exclamacion que abre, grados, U con dieresis.
            limpio = limpio.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");
            // Regresar a la forma compuesta, para poder comparar la enie con la tabla de valores
            limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC);
        }
        return limpio;
    }
}
class Estudiantes{
    private String nombre, curso, semestre;
    private float nota;


    public Estudiantes(String nombre, String curso, String semestre, float nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.semestre = semestre;
        this.nota = nota;
    }

 
    public String getNombre() {
        return nombre;
    }

 
    public String getCurso() {
        return curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public float getNota() {
        return nota;
    }


    @Override
    public String toString() {
        return "Estudiante{" + "name=" + nombre + ", course=" + curso + ", semester=" + semestre + ", grade=" + nota + '}';
    }
}
