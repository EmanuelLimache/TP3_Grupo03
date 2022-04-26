package fi.unju.edu.ar.ejercicio3;
import java.util.Scanner;
public class Alumno {
	
	private String nombre;
	private String apellido;
	private int libretaUniversitaria;
	private double[] notas;
	Scanner leer = new Scanner(System.in);
	
	public double promedio(double[] notas) {
		double prom;
        double suma=0; 
        for (int i=0; i < notas.length; i++ ){
            suma=suma +notas[i];
        }
        prom=suma/notas.length;
		return prom;
	}
	
	public void modificarNotas(Alumno alumno) {
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese notas "+(i+1));
			double nota=leer.nextDouble();
         	alumno.getNotas()[i] = nota;	
		 }
	}
	
	public void ingresarDatos(Alumno alumno) {
		System.out.println("Ingrese nombre");
		String name=leer.next();
		alumno.setNombre(name);
		
		System.out.println("Ingrese apellido");
		String apellido=leer.next();
		alumno.setApellido(apellido);
		
		System.out.println("Ingrese libreta universitaria");
		int lu=leer.nextInt();
		alumno.setLibretaUniversitaria(lu);
		
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese notas "+(i+1));
			double nota=leer.nextDouble();
         	alumno.getNotas()[i] = nota;	
		 }
		
	} 
	
	
	
	public double calcularPromedio() {
		double prom;
        double suma=0; 
        for (int i=0; i < notas.length; i++ ){
            suma=suma +notas[i];
        }
        prom=suma/notas.length;
        
		
		return prom;	
	}
	public double obtenerNotaMaxima(){
        double aux=notas[0];
        for (int i=0; i < notas.length; i++ ){
            if (notas[i]>=aux){
                aux= notas[i];
            }
        }
        
        return aux;
    }

	
//---------------------------------	
	public Alumno() {
		setNotas(new double [5]);
	}
	public Alumno(String nombre, String apellido, int libretaUniversitaria, double[] notas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
		this.notas = notas;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}
	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}	
}
