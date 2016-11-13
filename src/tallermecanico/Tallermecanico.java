package tallermecanico;

import java.util.Scanner;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeNumber;

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
        preciomaterial.add(1000);
        numerohoras.add(234);
    }

    //funcion para consultar los trabajos
    private static String actualizartrabajos() {
        System.out.println("introduce el id del trabajo realizado");
        Scanner entrada = new Scanner(System.in);
        int identificacion = entrada.nextInt();
        String mensaje = "";
        int horas;
        int material;
        String descripcion="";
        
        if (idtrabajo.contains(identificacion)) {
            horas=numerohoras.get(identificacion);
            material=preciomaterial.get(identificacion);
            descripcion=descripciondeltrabajo.get(identificacion);
            id=identificacion;
            String p =Integer.toString(material);
             String h =Integer.toString(horas);
            String i =Integer.toString(id);
            return h+" "+p+" "+i+" "+descripcion;
            
            
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
