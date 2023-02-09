import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String Carreras[]={"Ciencias de la Computación e Inteligencia Artificial","Diseño Digital"};
        String Materias[][]={{"Calculo Integral","Algebra Lineal","Cibernética"},{"E-Bussines","Taller de Ilustración","Taller de Algoritmia"}};
        int Grupos[][]={{1,2,3},{23,30,34},{30,32,27},{35,36,34}};
        System.out.println("Elija una opción para ingresar al sistema");
        System.out.println("1.Funcionario");
        System.out.println("2.Estudiante");
        int opcion = teclado.nextInt();
        if(opcion!=1&&opcion!=2){
            System.out.println("Ingrese una opción valida");
            opcion = teclado.nextInt();
        }
        if (opcion==1){
            System.out.println("Ingrese su usuario y contraseña");
            System.out.println("Usuario:");
            String usuario = teclado.next();
            System.out.println("Contraseña:");
            String contraseña = teclado.next();
            boolean funcionamiento;
            funcionamiento= true;
            int longitud=3;
            while(funcionamiento==true){
                System.out.println("Que desea hacer?");
                System.out.println("1.Crear carrera");
                System.out.println("2.Crear materia");
                System.out.println("3.Crear grupo");
                System.out.println("4.Salir");
                opcion= teclado.nextInt();
                if (opcion==1){
                    System.out.println("Cuantas carreras desea crear");
                    longitud = teclado.nextInt();
                    Carreras= new String[longitud];
                    for (int i=0;i<longitud;i++) {
                        System.out.println("Ingrese el nombre de la carrera");
                        Carreras[i] = teclado.next();
                    }
                    opcion=2;
                }
                if (opcion==2){
                    String CarrerasPrint = Arrays.toString(Carreras);
                    System.out.println(CarrerasPrint);
                    System.out.println("Cuantas materias quiere crear por carrera");
                    longitud = teclado.nextInt();
                    Materias= new String [Carreras.length][longitud];
                    for (int i=0;i< Carreras.length;i++){
                        System.out.println("Ingrese las materias para la carrera: "+Carreras[i]);
                        for (int j=0;j<longitud;j++){
                            Materias[i][j]=teclado.next();
                        }
                    }
                    System.out.println("[");
                    for (int i=0;i< Carreras.length;i++){
                        for (int j=0;j<longitud;j++){
                            System.out.println(Materias[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("]");
                    opcion=3;
                }
                if (opcion==3){
                    System.out.println("Ingrese cuantos grupos tendran las materias");
                    int longitud1 = teclado.nextInt();
                    Grupos=new int[longitud+1][longitud1];
                    for (int i =0;i<longitud1;i++){
                        Grupos[0][i]=i+1;
                    }
                    for (int i=1;i<longitud;i++){

                    }
                    }
                if (opcion==4){
                    funcionamiento=false;
                }
            }
        }
        if (opcion==2){

        }



    }
}