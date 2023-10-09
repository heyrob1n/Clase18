public class Ejercicio1{
	public static void main(String args[]){
		
		System.out.println("\n\nIngresar datos (alumno)");
		Alumno al1 =  new Alumno(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de matricula"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce promedio"));
	    System.out.println();
		System.out.println("\n\nIngresar datos (empleo)");
		Empleo em1 =  new Empleo(capturaEntrada.capturarCadena("Introduce nombre"), capturaEntrada.capturarCadena("Introduce Numero de empleado"), capturaEntrada.capturarCadena("Introduce correo"),capturaEntrada.capturarCadena("Introduce telefono"), capturaEntrada.capturarDoble("Introduce sueldo"));
	    System.out.println();

		//System.out.println(em1.nombre);
		
		//Imprimir datos de alumno
		System.out.println("\n\n Datos del alumno");
		System.out.println("Nombre:" + al1.getNombre());
		System.out.println("Matricula:" + al1.getMatricula());
		System.out.println("Correo:" + al1.getCorreo());
		System.out.println("Telefono:" + al1.getTelefono());
		System.out.println("Promedio:" + al1.getPromedio());
		
        //Imprimir datos de Empleado
		System.out.println("\nDatos de empleado");
		System.out.println("Nombre profesor: "+ em1.getNombre());
		System.out.println("Num. de empleado: "+ em1.getnumEmpleado());
		System.out.println("correo: "+ em1.getCorreo());
		System.out.println("Sueldo: "+ em1.getSueldo());
		
	
	}

}