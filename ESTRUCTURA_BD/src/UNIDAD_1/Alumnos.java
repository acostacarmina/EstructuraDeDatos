package UNIDAD_1;

public class Alumnos implements Comparable{
	private String numerocontrol;
	private String nombre;
	private String direccion;
	public String getNumerocontrol() {
		return numerocontrol;
	}
	public void setNumerocontrol(String numerocontrol) {
		this.numerocontrol = numerocontrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int compareTo(String arg0) {
		return direccion.compareTo(arg0);
	}
	@Override
	public String toString() {
		
		return "numero de control: "+this.numerocontrol+" Nombre del alumno"+this.nombre+" direccion:"+this.direccion;
	}
	@Override
	public int compareTo(Object o) {
		
		Alumnos alumno=(Alumnos) o;
		return this.getNumerocontrol().compareTo(alumno.getNumerocontrol());
	}
	
	
}
