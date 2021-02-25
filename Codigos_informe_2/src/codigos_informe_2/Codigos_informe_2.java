
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;


public class Codigos_informe_2 {


    public static void main(String[] args) {
        Scanner entra= new Scanner(System.in);
        int opcion, tamaño=0, lugar=0, arreglo[]={0};
        float media=0, suma=0;
                        
        Calculos c1= new Calculos();
        c1.Llenar( lugar);
         System.out.println("Ingrese la opcion que desea realizar con el arreglo: \n1. Varianza \n2. Media \n3. Desviación estandar");
         opcion=entra.nextInt();
         switch (opcion){
             case 1:
                 
             case 2:
                 c1.Media(suma, media);
                 
                 break;
         }
         
    }
    } 
    

