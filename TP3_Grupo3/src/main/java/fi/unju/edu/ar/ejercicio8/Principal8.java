package fi.unju.edu.ar.ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;

import fi.unju.edu.ar.ejercicio3.Alumno;
public class Principal8 {

	public static void main(String[] args) {
		ArrayList<Alumno> lista= new ArrayList<Alumno>();
		Alumno unAlumno=new Alumno();
		boolean band=true;
		Scanner leer = new Scanner(System.in);
		do {System.out.println(" ");
			System.out.println("****MENU****");
			System.out.println("1- Nuevo alumno");
			System.out.println("2- Eliminar alumno");
			System.out.println("3- Modificar alumno");
			System.out.println("4- Mostrar todos los alumnos");
			System.out.println("5- Mostrar los que superan el promedio de 6");
			System.out.println("6- Salir");
			System.out.println("Ingrese un opcion");
			int opcion=leer.nextInt();
			switch(opcion) {
			case 1:
				lista.add(unAlumno);
				unAlumno.ingresarDatos(unAlumno);
				System.out.println("Se ha agregado un nuevo alumno");
				break;
			case 2:
				if (!lista.isEmpty()) {
					System.out.println("Ingrese libreta universitaria");
					int lu=leer.nextInt();
					for(int i=0;i<lista.size();i++){
						if(lista.get(i).getLibretaUniversitaria()==lu) { 
				    	 lista.remove(i);
				    	 System.out.println("alumno eliminado"); 
						}
				     }
				}else {
					System.out.println("La lista esta vacia");
				}
			break;
			case 3:
				if (!lista.isEmpty()) {
					System.out.println("Ingrese libreta universitaria del alumno a modificar");
					int lu=leer.nextInt();
					for(int i=0;i<lista.size();i++){
						if(lista.get(i).getLibretaUniversitaria()==lu) { 
						 unAlumno.modificarNotas(unAlumno);
				    	 System.out.println("se modifico alumno "); 
						}
				     }
				}else {
					System.out.println("La lista esta vacia");
				}
				break;
			case 4:
				if (!lista.isEmpty()) {
					for(int i=0;i<lista.size();i++){
						System.out.println(lista.get(i).getApellido());
						System.out.println(lista.get(i).getNombre());
						System.out.println(lista.get(i).getLibretaUniversitaria());
						System.out.println(lista.get(i).getNotas());
				     }
				}else {
					System.out.println("La lista esta vacia");
				}
			break;
			case 5:
				if (!lista.isEmpty()) {
					System.out.println("Lista de alumno");

					for(int i=0;i<lista.size();i++){
						double promedio=unAlumno.promedio(unAlumno.getNotas());
						if(promedio>6) { 
							for(int j=0;j<lista.size();j++){
								
								System.out.println(lista.get(j).getApellido());
								System.out.println(lista.get(j).getNombre());
								System.out.println(lista.get(j).getLibretaUniversitaria());
								double [] notas=lista.get(j).getNotas();
								for(int a=0;a<5;a++) {
									System.out.println(notas[a]);
								}
						     }
				    	 System.out.println(" "); 
						}
				     }
				}else {
					System.out.println("La lista esta vacia");
				}
				break;
			case 6:
				band=false;
				System.out.println("Fin del programa");
				break;
				default:
					System.out.println("Ingrese una opcion correcta");
			}
		}while(band==true);
		
	}

}
