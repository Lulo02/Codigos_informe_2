
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
    protected char caracter;
    protected double [] arreglo2;
    
    
    
Scanner entra= new Scanner(System.in);

    
    public void MetodoSeleccion(){
        
        int longitud;
        longitud=arreglo2.length;
        double menor,tem;
        int pos;
        for(int i=0; i<longitud-1;i++){
           
            menor=arreglo2[i];
            pos=i;
            for(int j=i+1;j<longitud;j++){
                if(arreglo2[j]<menor){
                  
                 menor=arreglo2[j];
                 pos=j;
               
                } 
                
            }
            if(pos!=i){
                tem=arreglo2[i];
                arreglo2[i]=arreglo2[pos];
                arreglo2[pos]=tem;
            }
            
        }
        System.out.println(Arrays.toString(arreglo2));
    }


    public void MetodoBurbuja(){
        
        int longitud;
        longitud=arreglo2.length;
        double tem;
        
     for(int i=0; i<longitud-1;i++){
         for(int j=0;j<longitud-1;j++){
             if(arreglo2[j]<arreglo2[j+1]){
                 tem=arreglo2[j];
                 arreglo2[j]=arreglo2[j+1];
                 arreglo2[j+1]=tem;
             }
         }
     }   
     
        System.out.println("Los numeros ordenados son: ");
        System.out.println(Arrays.toString(arreglo2));
         
    }
  
    public void Llenar_numeros2(){
        Scanner entra= new Scanner (System.in);
        System.out.println("Ingrese el tamaño del arreglo");
                       
        tamaño=entra.nextInt();
        int lugar=0;
                
        arreglo2 = new double[tamaño];
        for (int i=0; i<tamaño; i++){
            
                double numero=Math.random()*100;
            arreglo2[lugar]=(int) numero;
            lugar++;
            }
        System.out.println("El arreglo es: ");
        System.out.println(Arrays.toString(arreglo2));
        
    }

    public void Llenar_letras(){
        
        
        System.out.println("Ingrese su cadena: ");
        cadena=entra.nextLine();
        char caracteres[]= cadena.toCharArray();
        System.out.println(caracteres);
        
        
        
        
        
    }
    
    public void Repeticiones(){
        
        int contador=0;
        
        
        
        for (int i=0; i<cadena.length() ;i++) {
     int contadorAux = 0;
     for (int j = 0; j < cadena.length(); j++) { 
         if (cadena.charAt(0) == cadena.charAt(j)) {
             contadorAux++;
              if (contadorAux > contador) {
         contador = contadorAux;
         caracter = cadena.charAt(0);
     }
         }
     }
        i++;
 }
 System.out.println(caracter + ": " + contador);
 

             
    }
    
    public void Repetir(){
        
        cadena = cadena.replace('a',caracter).replace('e',caracter).replace('i',caracter).replace('o',caracter).replace('u',caracter);
             System.out.println("La nueva cadena es: " +cadena);
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

   
