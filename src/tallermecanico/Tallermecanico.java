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
        System.out.println("introduce el precio del material: ");
        double precio = entrada.nextDouble();
        preciomaterial.add(precio);
        System.out.println("introduce las horas trabajadas");
        double horas = entrada.nextInt();
        numerohoras.add(234);
    }

    
    
    //funcion para actualizar los trabajos
    private static void actualizartrabajos(){
        System.out.println("introduce el numero e identificacion del trabajo a realizar:");
        Scanner entrada = new Scanner(System.in);
        int identificacion= entrada.nextInt();
        if (idtrabajo.contains(identificacion)) {
            System.out.println("Elige la opcion a actualizar: ");
            System.out.println("1 actualizar horas 2 actualizar precio material");
            int opcion_actualizar = entrada.nextInt();
            do{
            switch(opcion_actualizar){
                case 1:
                    System.out.println("Cuantas horas quieres actualizar");
                    int horasnuevas=entrada.nextInt();
                    int actualizar_horas = numerohoras.get(identificacion)+horasnuevas;
                    numerohoras.set(identificacion,actualizar_horas);
                    break;
                case 2:
                    System.out.println("material actualizar");
                    int materialnuevo=entrada.nextInt();
                    double actualizar_material = preciomaterial.get(identificacion)+materialnuevo;
                    preciomaterial.set(identificacion,actualizar_material);
            }       break;
            }
            while (opcion_actualizar!=1&&opcion_actualizar!=2);                
                
            
            
        }
    
    
    }
    
    
    
   //funcion para consultar los trabajos
    private static String consultartrabajos() {
        System.out.println("introduce el id del trabajo realizado");
        Scanner entrada = new Scanner(System.in);
        int identificacion = entrada.nextInt();
        String mensaje = "";
        int horas;
        double material;
        String descripcion="";
        
        if (idtrabajo.contains(identificacion)) {
            horas=numerohoras.get(identificacion);
            material=preciomaterial.get(identificacion);
            descripcion=descripciondeltrabajo.get(identificacion);
            id=identificacion;
            String p =Integer.toString((int) material);
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
    static ArrayList<Double> preciomaterial = new ArrayList<>();
    static ArrayList<String> descripciondeltrabajo = new ArrayList<>();

    //enteros para el numero de horas y precio del material
    static ArrayList<trabajos> mistrabajos = new ArrayList<>();

    public static void main(String[] args) {

        registrartrabajos();
        registrartrabajos();
        registrartrabajos();
        actualizartrabajos();
        System.out.println(idtrabajo.get(1));
        

    }

}
