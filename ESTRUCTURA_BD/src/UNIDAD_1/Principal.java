package UNIDAD_1;

import java.util.Scanner;

public class Principal {
	
	private Alumnos[] a;
	private static int opcion,n;
	private String nc;
	private Ingresar_Alum ia=new Ingresar_Alum();
	private Busqueda_Secuencial bs= new Busqueda_Secuencial();
	
	
	private static QUICKSORT quick = new QUICKSORT();
	private static BURBUJA burbuja=new BURBUJA();
	private static Busqueda_Binaria binaria=new Busqueda_Binaria();
	
	public static void main(String[] args) {
				Principal p=new Principal();
		System.out.print(" Elementos ");
		Scanner leer=new Scanner (System.in);
		p.n=leer.nextInt();
		
		p.a=new Alumnos[p.n];
		
		p.ia.ingresar(p.n,p.a);
		
		p.opcion=0;
		while(p.opcion!=6){
		System.out.println("---MENU---");
		System.out.println("1.Busqueda Secuencial");
		System.out.println("2.Busqueda Binaria");
		System.out.println("3.Burbuja");
		System.out.println("4. QUICKSORT");
		System.out.println("5. MERGESORT");
		System.out.println("6. SHELLSORT ");
		System.out.println("7.IMPRIMIR  Base de Datos");
		System.out.println("8.----CERRAR------.");
		System.out.println("Seleccione la opcion --DESEADA--");
		p.opcion=leer.nextInt();
		
		
					switch(p.opcion){
					case 1:
						System.out.println("ingrese numero de control a buscar ");
						p.nc=leer.next();
						if(p.bs.buscar(p.nc, p.a)){
							System.out.println(" alumno encontrado ");
						}
						else{
							System.out.println("No se a encontro  a el alumno");
						}
						break;
					case 2:
						String valor = "";
						System.out.println("ingrese numero de control a buscar: ");
						valor=leer.next();
						if(binaria.binaria(p.a, valor)){
							System.out.print(" numero de control encontrado");
						}
						else{
							System.out.print("No se encontro el numero de control");
						}
						
						break;
					case 3: 
						burbuja.procedimientoburbuja(p.a);
							for(int i=0;i<p.n;i++){
								System.out.println(p.a[i]+"   ");
							}
							
							
							
						
						break;
					case 4:
						int izq=0;
						int der=p.a.length-1;
						
						quick.procedimientoquick(p.a, izq, der);
						
						for(int i=0;i<p.n;i++){
							System.out.println(p.a[i]+"   ");
						}
						
					   break;
					case 5:
						System.out.println("Arreglo de orden de Mergesort;");
						MERGESORT.ordenacionMergeSort(p.a);
						
						for(int i=0; i<Principal.n; i++){
							System.out.println(p.a[i]);
						}
						
						break;
					case 6:
						System.out.println("Arreglo de orden de Shell sort;");
						SHELLSORT.shell(p.a);
						
						for(int i=0; i<Principal.n; i++){
							System.out.println(p.a[i]);
						}
						
						break;	
					case 7:
							System.out.println("BASE DE DATOS");
							for(int i=0;i<p.n;i++){
							System.out.println(p.a[i]+"   ");
						}
						break;	
					case 8:
						System.out.println("---Adios gracias por utilizar este programa ---");
						System.exit(0);
						
					default:
						System.out.println("");
					}
		
		}
		
		
	}
}
