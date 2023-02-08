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
            while(funcionamiento==true){
                System.out.println("Que desea hacer?");
                System.out.println("1.Crear una carrera");
                System.out.println("2.Crear una materia");
                System.out.println("3.Crear un grupo");
                System.out.println("Cuantas carreras desea crear");
                int longitud = teclado.nextInt();
                Carreras= new String[longitud];

            }
        }
        if (opcion==2){

        }



    }
}