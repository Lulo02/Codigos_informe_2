
package codigos_informe_2;

import java.util.Arrays;
import java.util.Scanner;

    
public class Calculos {
    protected double varianza;
    protected double desviacion_e;
    protected double media;
    protected int tamaño;
    protected int [] arreglo;
    protected String cadena;
    
    
    
Scanner entra= new Scanner(System.in);
  
    public void Llenar_letras(){
        
        
        System.out.println("Ingrese su cadena: ");
        cadena=entra.nextLine();
        int longitud=cadena.length();
        char caracteres[]= cadena.toCharArray();
        System.out.println(caracteres);
    }
    
    public void Repeticiones(){
        
        int contador=0;
        char caracter=0;
        while(cadena.length()!=0){
            int contadorAux=0;
            for (int j = 0; j < cadena.length(); j++) { // recorremos la cadena para contar los caracteres del indice cero
         if (cadena.charAt(0) == cadena.charAt(j)) {
             contadorAux++;
         }
     }
            if (contadorAux > contador) { // si el contador del nuevo caracter es mayor al que ya estaba guardado, lo cambiamos
         contador = contadorAux;
         caracter = cadena.charAt(0);
     }
             
               
 }
    System.out.println(caracter + ": " + contador);
    cadena = cadena.replaceAll(cadena.charAt(0) + "", "");
             cadena = cadena.replace('a',caracter).replace('e',caracter).replace('i',caracter).replace('o',caracter).replace('u',caracter);
             System.out.println(cadena);
        }
    
    public void Llenar_numeros (){
        Scanner entra= new Scanner (System.in);
        System.out.println("Ingrese el tamaño del arreglo");
                       
        tamaño=entra.nextInt();
        int lugar=0;
                
        arreglo = new int[tamaño];
        for (int i=0; i<tamaño; i++){
            
                double numero=Math.random()*100;
            arreglo[lugar]=(int) numero;
            lugar++;
            }
        System.out.println("El arreglo es: ");
        System.out.println(Arrays.toString(arreglo));
        
    }
    
    
    public  void Media(){
            double suma=0;
            for(int i=0;i<tamaño;i++){
            
                suma=suma+arreglo[i];
                            }
                 System.out.println("La suma de los numeros es:" +suma);
                 media=suma/tamaño;
                 System.out.println("La media aritmetica es: "+media);
                 
                               
    }
        
    public void Varianza(){
       double suma=0;
        for(int i=0;i<tamaño;i++){
            
                suma=suma+arreglo[i];
                            }
        media=suma/tamaño;
        
        double rango;
        
        for(int i=0;i<tamaño;i++){
            
            rango= Math.pow((arreglo[i]-media),2);
            varianza= (varianza+rango);
        }
            varianza=varianza/(tamaño-1);           
            System.out.println("La varianza es: "+varianza);
        }
      
     public void Desviacion_e (){
         
         double suma=0;
              for(int i=0;i<tamaño;i++){
            
                suma=suma+arreglo[i];
                            }
        media=suma/tamaño;
         
        double rango;
        
        for(int i=0;i<tamaño;i++){
            
            rango= Math.pow((arreglo[i]-media),2);
            varianza= (varianza+rango);
        }
            varianza=varianza/(tamaño-1);  
            desviacion_e= Math.sqrt(varianza);
            System.out.println("La desciacion estandar es: "+desviacion_e);
        }
}

   
