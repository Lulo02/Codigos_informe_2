
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;


public class Codigos_informe_2 {


    public static void main(String[] args) {
        Scanner entra= new Scanner(System.in);
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
                
        String opcion2, opcion5, opcion6, opcion7 ;
        int opcion, opcion3;
        Calculos c1= new Calculos();
                
        System.out.println("\t Programa puntos informe 2");
        do{
        System.out.println("Ingrese los puntos que desea realizar: ");
        System.out.println("1. Puntos 1 y 2 \n2. Puntos 3 y 4 \n3. Puntos 5 y 6");
        opcion3=entra.nextInt();
        switch (opcion3){
            
            case 1:             
                    
                    c1.Llenar_numeros();
                do{
                     System.out.println("Ingrese la opcion que desea realizar con el arreglo: \n1. Varianza \n2. Media \n3. Desviación estandar");
                     opcion=entra.nextInt();
                 switch (opcion){
                        case 1:
                            c1.Varianza();
                            break;
                        case 2:
                            c1.Media();
                            break;
                        case 3:
                            c1.Desviacion_e();
                            break;
                            }
                    System.out.println("¿Desea volver a ejecutar este punto?");
                    opcion2=entra.nextLine();
                    opcion2=entra.nextLine();
                    opcion2.toLowerCase();
                    }while(opcion2.equals("si"));
                    break;
                   
            
            case 2:
                do{
                c1.Llenar_letras();
                c1.Repeticiones();
                 System.out.println("¿Desea volver a ejecutar este punto?");
                    opcion7=entra.nextLine();
                    opcion7=entra.nextLine();
                    opcion7.toLowerCase();
                }while(opcion7.equals("si"));
                break;
                
            case 3:
                do{
                c1.Llenar_numeros2();
                System.out.println("Seleccione el metodo de ordenamiento");
                System.out.println("1. Burbuja \n2. Seleccion  \n3. Insercion  \n4. Merge Sort  ");
                int opcion4;
                opcion4=entra.nextInt();
                switch(opcion4){
                    case 1:
                        c1.MetodoBurbuja();
                        break;
                    
                    case 2:
                        c1.MetodoSeleccion();
                        break;
                        
                    case 3:
                        c1.MetodoInsercion();
                        break;
                        
                    case 4:
                        c1.OrdenarMergeSort();
                        break;
                }
                System.out.println("¿Desea volver a ejecutar este punto?");
                
                    opcion5=entra.nextLine();
                    opcion5=entra.nextLine();
                    opcion5.toLowerCase();
                    }while(opcion5.equals("si"));   
               
        }
        System.out.println("¿Desea volver a ejecutar el programa?");
                
                    opcion6=entra.nextLine();
                    
                    opcion6.toLowerCase(); 
                    }while(opcion6.equals("si")); 
    
     TFin = System.currentTimeMillis();
    tiempo = TFin - TInicio;
    tiempo=tiempo/1000;
    System.out.println("Tiempo de ejecución en segundos: " + tiempo);
    
    
    } 
}

