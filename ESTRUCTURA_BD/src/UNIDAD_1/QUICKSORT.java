package UNIDAD_1;
public class QUICKSORT  {
		public void procedimientoquick(Alumnos[]a , int izq, int der){
			
			Alumnos remplazar;
			Alumnos pivote=a[izq];
	        int i=izq;
	        int derecha=der;
	       
	        while (i<derecha)
	        {
	            while (a[i].compareTo(pivote)<=0 && i<derecha)
	            {
	                i++;
	            }
		            while (a[i].compareTo(pivote)>0)
		            {
		            	derecha--;
		            }
	            if (i<derecha) 
	            {
	                remplazar=a[i];
	                a[i]=a[derecha];
	                a[derecha]=remplazar;
	            }
	        }
	        		a[izq]=a[derecha];
	        		a[derecha]=pivote;
	        
	        
	        if (izq<derecha-1)
	        {
	         procedimientoquick(a,izq,derecha-1);
	        }
	        
	        
	        if (derecha+1<der) 
	        {
	         procedimientoquick(a,derecha+1,der);
	        }
		}
}
