
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

    public void OrdenarMergeSort(){
       
        
        int inicio=0, longitud;
        longitud=arreglo2.length;
        int fin=longitud-1;
        int mitad=(inicio+fin)/2;
        double  izq[]=Arrays.copyOfRange(arreglo2, inicio, mitad);
        double der[]=Arrays.copyOfRange(arreglo2, mitad+1, longitud);
       double temp[]={0};
        
        int i=inicio, j;
        j = (mitad+1);
        int  k=0;
        
        while(i<mitad && j<fin){
            if(arreglo2[i]<=arreglo2[j]){
                
                temp[k]=arreglo2[i];
                k=k+1;
                i=i+1;
                }
            else{
                temp[k]=arreglo2[j];
                k=k+1;
                i=i+1;
            }
            
            while (i<mitad){
                temp[k]=arreglo2[j];
                k=k+1;
                i=i+1;
            }
            while(j<fin){
                temp[k]=arreglo2[j];
                k=k+1;
                i=i+1;
            }
            for(i=inicio;i<arreglo2.length;i++){
            
            arreglo2[i]=temp[i-1];
        }
        }
        
        
        System.out.println(Arrays.toString(arreglo2));
        
    }
   
    

    public void MetodoInsercion(){
        
        int longitud, pos, x;
        double aux;
        longitud=arreglo2.length;
        System.out.println("Ordenar de forma asendente o desendente?");
        System.out.println("1. Asendente \n2. Desendente");
        x=entra.nextInt();
        int inverso=longitud;
                double []numeros=new double[longitud];
        for(int i=0;i<longitud;i++){
            pos=i;
            aux=arreglo2[i];
            
            while((pos>0 && arreglo2[pos-1]> aux)){
                arreglo2 [pos]=arreglo2[pos-1];
                pos--;
            }
            arreglo2[pos]=aux;
            longitud=arreglo2.length;
        }
        if(x==1){
        
        System.out.println("Los numeros ordenados son: ");
        System.out.println(Arrays.toString(arreglo2));
        }
        else{
            for(int i=0;i<longitud;i++){
                
                
                numeros[i]= arreglo2[inverso-1];
                inverso--;
            }
            System.out.println("Los numeros ordenados son: ");
            System.out.println(Arrays.toString(numeros));
        }
    }
    
    public void MetodoSeleccion(){
        
        int longitud,x;
        longitud=arreglo2.length;
        System.out.println("Ordenar de forma asendente o desendente?");
        System.out.println("1. Asendente \n2. Desendente");
        x=entra.nextInt();
        int inverso=longitud;
                double []numeros=new double[longitud];
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
        if(x==1){
            System.out.println("Los numeros ordenados son: ");
        System.out.println(Arrays.toString(arreglo2));
        }
        else{
            for(int i=0;i<longitud;i++){
                
                
                numeros[i]= arreglo2[inverso-1];
                inverso--;
            }
           System.out.println("Los numeros ordenados son: ");
            System.out.println(Arrays.toString(numeros));
        }
    }


    public void MetodoBurbuja(){
        
        int longitud, x;
        longitud=arreglo2.length;
        double tem;
        System.out.println("Ordenar de forma asendente o desendente?");
        System.out.println("1. Asendente \n2. Desendente");
        x=entra.nextInt();
        int inverso=longitud;
                double []numeros=new double[longitud];
                
                
     for(int i=0; i<longitud-1;i++){
         for(int j=0;j<longitud-1;j++){
             if(arreglo2[j]<arreglo2[j+1]){
                 tem=arreglo2[j];
                 arreglo2[j]=arreglo2[j+1];
                 arreglo2[j+1]=tem;
             }
         }
     }   
     if(x==1){
         for(int i=0;i<longitud;i++){
                
                
                numeros[i]= arreglo2[inverso-1];
                inverso--;
            }
        System.out.println("Los numeros ordenados son: ");
        System.out.println(Arrays.toString(numeros));
     }
     else{
            
           System.out.println("Los numeros ordenados son: ");
            System.out.println(Arrays.toString(arreglo2));
        }
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
        String nueva=cadena;
        while (cadena.length() != 0) {
     int contadorAux = 0;
     for (int j = 0; j < cadena.length(); j++) { 
         if (cadena.charAt(0) == cadena.charAt(j)) {
             contadorAux++;
         }
     }
              if (contadorAux > contador) {
         contador = contadorAux;
         caracter = cadena.charAt(0);
     }
              cadena = cadena.replaceAll(cadena.charAt(0) + "", "");
         }
     
      

        System.out.println("La letra mas repetida es: "+caracter + " y se repite " + contador+" veces.");
        
        nueva = nueva.replace('a',caracter).replace('e',caracter).replace('i',caracter).replace('o',caracter).replace('u',caracter);
        System.out.println("La cadena cambiando las volcales por  la letra mas repetida queda: ");
        System.out.println(nueva);
      
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

   
