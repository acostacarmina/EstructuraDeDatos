package UNIDAD_1;

import java.util.*; 
public class MERGESORT{ 

public static void ordenacionMergeSort(Alumnos[]a){
        if(a.length<=1) return;
        int mitad= a.length/2;
        Alumnos[] izq=Arrays.copyOfRange(a, 0, mitad);
        Alumnos[] der=Arrays.copyOfRange(a, mitad, a.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(a, izq, der);
}

public static void combinarVector(Alumnos[] a, Alumnos[] izq,Alumnos[] der){
        int i=0;
        int j=0;
        for(int b=0;b<a.length;b++){
                if(i>=izq.length){
                        a[b]=der[j];
                        j++;
                        continue;
                }
                if(j>=der.length){
                        a[b]=izq[i];
                        i++;
                        continue;
                }
                if(izq[i].compareTo(der[j])<0){
                        a[b]=izq[i];
                        i++;
                }else{
                        a[b]=der[j];
                        j++;
                }
        }
}

}