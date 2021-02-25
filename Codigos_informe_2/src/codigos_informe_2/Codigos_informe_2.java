
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;


public class Codigos_informe_2 {


    public static void main(String[] args) {
        Scanner entra= new Scanner(System.in);
        String opcion2;
        int opcion, tamaño=0, lugar=0, arreglo[]={0};
        float media=0, suma=0;
                        
        Calculos c1= new Calculos();
        c1.Llenar( lugar);
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
         }
            System.out.println("¿Desea volver a ejecutar el programa?");
            //opcion2=entra.nextLine();
            opcion2=entra.nextLine();
            opcion2.toLowerCase();
        }while(opcion2.equals("si")==true);    
    }
    } 
    

