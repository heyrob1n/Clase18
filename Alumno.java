public class Alumno extends Persona{
	String matricula;
	double promedio;
	

	public Alumno(String nombre, String matricula, String correo, String telefono, double promedio){
		super(nombre, correo, telefono);
		setMatricula(matricula);
		setPromedio(promedio);
	}
	
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}
	
	public void setPromedio(double promedio){
		this.promedio = promedio;
	}
	public double getPromedio(){
		return promedio;
	}
}