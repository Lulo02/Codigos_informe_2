
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
    protected int  []arr={3,9,6,8,5,7,4};
    
    
    
Scanner entra= new Scanner(System.in);


    void Merge( int l, int m, int r) 
    { 
        //Se buscan los tamaños de los dos arreglos a los cuales se va a dividir
        int n1 = m - l + 1; 
        int n2 = r - m; 
        //se crean los dos sub arreglos
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        //se copian los datos en los dos subarreglos correspondientes a la parte derecha y parte izquiera del arreglo principal
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
   //se combinan los dos arreglos temporales
  
        //inicializacion de contadores 
        int i = 0, j = 0; 
        //index inicial de los sub arreglos a mezclar
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        printArray();
  
        //se copian los elementos restantes en L
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        printArray();
        //se copian los elementos restantes en R
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
        printArray();
    }
    //merge and sort algorithm
     void sort( int extremoIzquierdo, int extremoDerecho) 
    { 
        if (extremoIzquierdo < extremoDerecho) 
        { 
            // se busca el punto medio
            int puntoMedio = (extremoIzquierdo+extremoDerecho)/2; 
  
            // Sort first and second halves 
            sort( extremoIzquierdo, puntoMedio); 
            sort(  puntoMedio+1, extremoDerecho); 
  
            // Merge the sorted halves 
            Merge(  extremoIzquierdo, puntoMedio, extremoDerecho); 
        } 
    }
      public void printArray() {
         
         
        System.out.println(Arrays.toString(arr));
    }
     
  /*  public void Ordenar(){
        int longitud;
        longitud=arr.length;
        merge(0,longitud-1);
    }

    private void merge( int inicio, int fin ){
        Ordenar();
        if(inicio<fin){
            int mitad=(inicio+fin)/2;
            merge(inicio,mitad);
            merge( mitad+1,fin);
            unir(inicio,fin,mitad);
        }
    }

    private void unir( int inicio, int fin, int mitad ){
        Ordenar();
        int i=inicio, k=inicio, j=mitad+1;
        double aux[]= new double[tamaño];
        while(i<=mitad && j<=fin){
            if (arr[i]<arr[j]){
                aux[k++]=arr[i++];
            }
            else{
                aux[k++]=arr[j++];
            }
        }
        while(i<=mitad){
            aux[k++]=arr[i++];
          }
        while(j<=fin){
            aux[k++]=arr[j++];
          }
        for(i=inicio; i<k;i++){
            arr[i]=aux[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void printArray() {
         
         Ordenar();
        System.out.println(Arrays.toString(arr));
    }
*/

  /* public void sort( int left, int right) {
       
       int longitud;
       longitud=arr.length;
       left=arr[0];
        if(left < right){
      //Encuentra el punto medio del vector.
      int middle = (left + right) / 2;
      
      //Divide la primera y segunda mitad (llamada recursiva).
      sort( left, middle);
      sort( middle+1, right);

      //Une las mitades.
      merge( left, middle, right);
    }
    }

    public void merge(int left, int middle, int right) {
             //Encuentra el tamaño de los sub-vectores para unirlos.
  int n1 = middle - left + 1;
  int n2 = right - middle;

  //Vectores temporales.
  int leftArray[] = new int [n1];
  int rightArray[] = new int [n2];

  //Copia los datos a los arrays temporales.
  for (int i=0; i < n1; i++) {
    leftArray[i] = arr[left+i];
  }
  for (int j=0; j < n2; j++) {
    rightArray[j] = arr[middle + j + 1];
  }
  // Une los vectorestemporales. 

  //Índices inicial del primer y segundo sub-vector.
  int i = 0, j = 0;

  //Índice inicial del sub-vector arr[].
  int k = left;

  //Ordenamiento.
  while (i < n1 && j < n2) {
    if (leftArray[i] <= rightArray[j]) {
      arr[k] = leftArray[i];
      i++;
    } else {
        arr[k] = rightArray[j];
        j++;
    }
    k++;
  }//Fin del while.

  // Si quedan elementos por ordenar 
  //Copiar los elementos restantes de leftArray[].
  while (i < n1) {
    arr[k] = leftArray[i];
    i++;
    k++;
  }
  //Copiar los elementos restantes de rightArray[].
  while (j < n2) {
    arr[k] = rightArray[j];
    j++;
    k++;
  }
    }

    
    
*/
    public void MetodoInsercion(){
        
        int longitud, pos, x;
        double aux;
        longitud=arreglo2.length;
        System.out.println("Ordenar de forma ascendente o descendente?");
        System.out.println("1. Ascendente \n2. Descendente");
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
        System.out.println("Ordenar de forma ascendente o descendente?");
        System.out.println("1. Ascendente \n2. Descendente");
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
        System.out.println("Ordenar de forma ascendente o descendente?");
        System.out.println("1. Ascendente \n2. Descendente");
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

  
    public void Cadena_letras(){
        System.out.println("Ingrese su cadena: ");
        cadena=entra.nextLine();
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

   
