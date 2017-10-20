package UNIDAD_1;

public class SHELLSORT {

	public static void shell(Alumnos []a){
		   int salto, i;
		Alumnos aux;
		   boolean cambios;
		   for(salto=a.length/2; salto!=0; salto/=2){
		           cambios=true;
		           while(cambios){ 
		                       cambios=false;
		                       for(i=salto; i< a.length; i++) 
		                               if(a[i-salto].compareTo(a[i])>0){ 
		                                     aux=a[i];
		                                     a[i]=a[i-salto];
		                                     a[i-salto]=aux;
		                                     cambios=true; 
		                               }
		                        }
		            }
		}
}
