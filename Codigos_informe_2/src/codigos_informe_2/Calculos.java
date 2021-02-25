
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lulo
 */
public class Calculos {
    protected float varianza;
    protected float desviacion_e;
    protected float suma;
    protected float media;
    protected int tamaño;
    protected int lugar;
    protected int [] arreglo;
    

  

    
    public void Llenar (int lugar){
        Scanner entra= new Scanner (System.in);
        System.out.println("Ingrese el tamaño del arreglo");
                       
        tamaño=entra.nextInt();
                
        arreglo = new int[tamaño];
        for (int i=0; i<tamaño; i++){
            
                double numero=Math.random()*100;
            arreglo[lugar]=(int) numero;
            lugar++;
            }
        System.out.println("El arreglo es: ");
        System.out.println(Arrays.toString(arreglo));
        
    }
    
        public void Media(float suma, float media){
            
            suma=0;
            for(int i=0;i<tamaño;i++){
            
                suma=suma+arreglo[i];
                            }
                 System.out.println("La suma de los numeros es:" +suma);
                 media=suma/tamaño;
                 System.out.println("La media aritmetica es: "+media);
                               
    }
}