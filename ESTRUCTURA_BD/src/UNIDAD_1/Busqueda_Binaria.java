package UNIDAD_1;

public class Busqueda_Binaria 
{
	public boolean binaria(Alumnos[]a, String valor){
	String valorBuscar=valor;
	int posicion;
	int inicio = 0;
    int fin = a.length - 1;
    while (inicio<=fin) 
    {	
    	posicion = (inicio+fin)/2;
        if (a[posicion].getNumerocontrol().compareTo(valorBuscar)==0) 
        {
            return true;
        } else if (valorBuscar.compareTo(a[posicion].getNumerocontrol())>0) 
        {
            inicio = posicion + 1;
        } else
        {
            fin = posicion - 1;
        }
    }
    	    return false;
}
}