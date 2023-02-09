import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String Carreras[]=null;
        String Materias[][]=null;
        int Grupos[][]=null;
        int longitudmateria=0;
        int longitudcarrera=0;
        int longitudgrupo=0;
        System.out.println("Ingrese su usuario y contraseña");
        System.out.println("Usuario:");
        String usuario = teclado.next();
        System.out.println("Contraseña:");
        String contraseña = teclado.next();
        boolean funcionamientoCrear;
        funcionamientoCrear= true;
        boolean funcionamientoInscribir = false;
        while(funcionamientoCrear==true){
            System.out.println("Que desea hacer?");
            System.out.println("1.Crear carrera");
            System.out.println("2.Crear materia");
            System.out.println("3.Crear grupo");
            System.out.println("4.Salir");
            int opcion= teclado.nextInt();
            if (opcion==1){
                System.out.println("Cuantas carreras desea crear");
                longitudcarrera = teclado.nextInt();
                Carreras= new String[longitudcarrera];
                for (int i=0;i<longitudcarrera;i++) {
                    System.out.println("Ingrese el nombre de la carrera");
                    Carreras[i] = teclado.next();
                }
                opcion=2;
            }
            if (opcion==2){
                String CarrerasPrint = Arrays.toString(Carreras);
                System.out.println(CarrerasPrint);
                System.out.println("Cuantas materias quiere crear por carrera");
                longitudmateria = teclado.nextInt();
                Materias= new String [Carreras.length][longitudmateria];
                for (int i=0;i< Carreras.length;i++){
                    System.out.println("Ingrese las materias para la carrera: "+Carreras[i]);
                    for (int j=0;j<longitudmateria;j++){
                        Materias[i][j]=teclado.next();
                    }
                }

                opcion=3;
            }
            if (opcion==3){
                for (int i=0;i< Carreras.length;i++){
                    for (int j=0;j<longitudmateria;j++){
                        System.out.print(Materias[i][j]+", ");
                    }
                    System.out.println("");
                }
                System.out.println("Ingrese cuantos grupos tendran las materias");
                longitudgrupo = teclado.nextInt();
                Grupos=new int[longitudmateria+1][longitudgrupo];
                for (int i =0;i<longitudgrupo;i++){
                    Grupos[0][i]=i+1;
                }
                for (int i=1;i<longitudmateria;i++){
                    for(int j=0; j<longitudgrupo;j++){
                        if(j==0){
                            System.out.println("Ingrese el número de cupos para cada grupo de la materia: "+Materias[i-1][j]);
                        }
                        Grupos[i][j]=teclado.nextInt();
                    }
                }
                System.out.println();
                for (int i=0;i<longitudmateria+1;i++){
                    for (int j=0;j<longitudgrupo;j++){
                        System.out.print(Grupos[i][j]+", ");
                    }
                    System.out.println("");
                }
            }
            if (opcion==4){
                System.out.println("Proceso finalizado con exito");
                funcionamientoInscribir=true;
                funcionamientoCrear=false;
            }
        }


        while (funcionamientoInscribir==true){
            System.out.println("Escoja para cual carrera desea inscribir materias");
            for (int i=1;i<Carreras.length+1;i++){
                System.out.println(i+"."+Carreras[i-1]);
            }
            int carrera= teclado.nextInt();
            for (int i=1;i< Carreras.length+1;i++){
                if(carrera==i){
                    System.out.print("[");
                    int indice=1;
                    for (int j=0;j<longitudmateria;j++){
                        System.out.print(indice+"."+Materias[i][j]+", ");
                        indice=indice+1;
                    }
                    System.out.println("]");
                    System.out.println("Cuantas materias desea inscribir");
                    int longitudhorario= teclado.nextInt();
                    String horariomaterias[]=new String [longitudhorario];
                    for (int k=0;k<longitudhorario;k++){
                        System.out.println("Ingrese el indice de la materia a inscribir");
                        int a= teclado.nextInt();
                        horariomaterias[k]=Materias[i][a-1];
                    }
                    System.out.println("Estos son los grupos de cada materia elegida y sus respectivos cupos");
                    for (int j=0;j<longitudgrupo;j++){
                        System.out.println(Grupos[0][j]+" ");
                    }
                    indice=0;
                    for (int j=0;j<longitudmateria;j++){
                        for (int k=0;k<longitudgrupo;k++){
                            if(horariomaterias[indice]==Materias[i][j]){
                                System.out.print(Grupos[j+1][k]+" ");
                            }
                        }
                        indice=indice+1;
                        if(indice==horariomaterias.length){
                            break;
                        }
                    }
                    int horariogrupos[]=new int[longitudhorario];
                    indice=0;
                    int indicehorario=0;
                    for (int j=0;j<longitudmateria;j++){
                        for (int l=0;l<longitudgrupo;l++){
                            if(horariomaterias[indice]==Materias[i][j]){
                                System.out.println("Indique en que grupo desea inscribirse");
                                int a= teclado.nextInt();
                                if(Grupos[j+1][a-1]==0){
                                    System.out.println("No quedan cupos en este grupo,seleccione otro");
                                    a= teclado.nextInt();
                                }
                                if(Grupos[j+1][a-1]!=0){
                                    horariogrupos[indicehorario]=Grupos[0][a-1];
                                    indicehorario=indicehorario+1;
                                }
                            }
                        }
                        indice=indice+1;
                        if(indice==horariomaterias.length){
                            break;
                        }

                    }
                    System.out.println("Estas son sus materias y sus grupos");
                    for (int j=0;j<longitudhorario;j++){
                        System.out.println("Materia: "+horariomaterias[j]+"Grupo: "+horariogrupos[j]);
                    }
                    funcionamientoInscribir=false;
                    }
                    if(i==Carreras.length){
                        System.out.println("Ingrese una carrera valida");
                    }
                }
            }
        }



    }
