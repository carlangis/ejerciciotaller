package tallermecanico;

import java.util.Scanner;
import java.util.ArrayList;

public class Tallermecanico {

    private static int id = (-1);

    //funcion para registrar trabajos
    private static void registrartrabajos() {
        System.out.println("introduce la descripcion del trabjo: ");
        Scanner entrada = new Scanner(System.in);
        String descripcion = entrada.nextLine();
        id++;
        idtrabajo.add(id);
        descripciondeltrabajo.add(descripcion);
    }

    //funcion para actualizar los trabajos
    private static String actualizartrabajos() {
        System.out.println("introduce el id del trabajo realizado");
        Scanner entrada = new Scanner(System.in);
        int identificacion = entrada.nextInt();
        String mensaje = "";

        if (idtrabajo.contains(identificacion)) {

            return mensaje = "hola que ase cabron";

        } else {

            return mensaje = "nada de nada";
        }

    }

    //aqui los arralist que voy a necesitar
    static ArrayList<Integer> idtrabajo = new ArrayList<>();
    static ArrayList<Integer> numerohoras = new ArrayList<>();
    static ArrayList<Integer> preciomaterial = new ArrayList<>();
    static ArrayList<String> descripciondeltrabajo = new ArrayList<>();

    //enteros para el numero de horas y precio del material
    static ArrayList<trabajos> mistrabajos = new ArrayList<>();

    public static void main(String[] args) {

        registrartrabajos();
        registrartrabajos();
        registrartrabajos();
        System.out.println(idtrabajo.get(1));
        System.out.println(actualizartrabajos());

    }

}
