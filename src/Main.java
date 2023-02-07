import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String[] NombreMaterias;
        int[] Estudiantes;
        int[] Grupos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Materias que verá");
        int longitud = teclado.nextInt();
        NombreMaterias=new String[longitud];
        for (int i=0;i<NombreMaterias.length;i++){
            NombreMaterias[i]=teclado.next();
        }
    }
}