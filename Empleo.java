public class Empleo extends Persona{
	private String numEmpleado;
	private double sueldo;
	
	
	public Empleo(String nombre, String numEmpleado, String correo, String telefono, double sueldo){
		super(nombre, correo, telefono);
		setnumEmpleado(numEmpleado);
		setSueldo(sueldo);
	}
	
	
	public void setnumEmpleado(String numEmpleado){
		this.numEmpleado = numEmpleado;
	}
	public String getnumEmpleado(){
		return numEmpleado;
	}
	
	public void setSueldo(double sueldo){
		this.sueldo = sueldo;
	}
	public double getSueldo(){
		return sueldo;
	}
}