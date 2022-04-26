package fi.unju.edu.ar.ejercicio3;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {

		Alumno alumno1= new Alumno();
		Scanner leer = new Scanner(System.in);
       
		System.out.println("Ingrese Nombre: ");
		String nombre=leer.next();
		alumno1.setNombre(nombre);
		System.out.println("Ingrese Apellido: ");
		String apellido=leer.next();
		alumno1.setApellido(apellido);
		System.out.println("Ingrese libreta universitaria: ");
		int lu=leer.nextInt();
		alumno1.setLibretaUniversitaria(lu);
		 for(int i=0;i<5;i++) {
			System.out.println("Ingrese nota "+(i+1));
			double nota=leer.nextDouble();
         	alumno1.getNotas()[i] = nota;	
		 }
		
		double a=alumno1.calcularPromedio();
		System.out.println("El promedio es: " +a);
		double b=alumno1.obtenerNotaMaxima();
		System.out.println("La nota Maxima es: "+b);
		
		
            
        
	

	}

}
