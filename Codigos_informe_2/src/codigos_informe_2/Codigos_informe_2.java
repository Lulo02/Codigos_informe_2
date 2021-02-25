
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;


public class Codigos_informe_2 {


    public static void main(String[] args) {
        Scanner entra= new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño;
        tamaño=entra.nextInt();
                
        int []arreglo=new int[tamaño];
        int lugar=0;
        
        for (int i=0; i<tamaño; i++){
            
                double numero=Math.random()*100;
            arreglo[lugar]=(int) numero;
            lugar++;
           
        }
        
            System.out.println(Arrays.toString(arreglo));
          
    }
    }
    

