package LISTASDOBLES;

import javax.swing.JOptionPane;

public class LISTA_DOBLE {
	private  NODO_DOBLE primero;
	private NODO_DOBLE ultimo;
	
	public LISTA_DOBLE(){
		this.primero=null;
	}
	public NODO_DOBLE  getCabeza(){
		return primero;
	}
	
	public void setCabeza(NODO_DOBLE cabeza) {
		this.primero = cabeza;
	}
	
	public boolean isDesocupado (){
		if (ultimo==null && primero==null){
			return true;
		}else{
			return false;}
		
		
		
		public  insertaradelante(MUSICA dato){
			if (primero==null){
				primero=new NODO_DOBLE(dato,null,null);
				ultimo=primero;
			}else{
				NODO_DOBLE nuevo=new NODO_DOBLE(dato,null,primero);
				primero.setAnterior(nuevo);
				primero=nuevo;
			}
		}
		
		public insertarFinal(MUSICA dato){
			if (primero==null){
				primero=new NODO_DOBLE(dato,null,null);
				ultimo=primero;
			}else{
				NODO_DOBLE nuevo=new NODO_DOBLE(dato,primero,null);
				primero.setAnterior(nuevo);
				primero=nuevo;
			}
		}
		
		
		
	}
	

}
	