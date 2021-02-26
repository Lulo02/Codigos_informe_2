
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;


public class Codigos_informe_2 {


    public static void main(String[] args) {
        Scanner entra= new Scanner(System.in);
                
        String opcion2;
        int opcion, opcion3;
        Calculos c1= new Calculos();
                
        System.out.println("\t Programa puntos informe 2");
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
                    System.out.println("¿Desea volver a ejecutar el programa?");
                    opcion2=entra.nextLine();
                    opcion2=entra.nextLine();
                    opcion2.toLowerCase();
                    }while(opcion2.equals("si")==true);   
                break;
            
            case 2:
                c1.Llenar_letras();
                c1.Repeticiones();
         }
    
    
    }
    } 
    

