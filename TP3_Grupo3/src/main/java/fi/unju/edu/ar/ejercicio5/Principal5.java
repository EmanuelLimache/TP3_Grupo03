package fi.unju.edu.ar.ejercicio5;
import java.util.Scanner;

public class Principal5 {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		char[] arreglo ;
		char[] arreglo2;
		System.out.println("Ingrese cadena");
		String cadena = leer.nextLine();
		arreglo=cadena.toCharArray() ;
		arreglo2=arreglo;
		int k=0;
		for (int i=cadena.length()-1;i>=0;i--) {
			char caracter=cadena.charAt(i);
			arreglo2[k]=caracter;
			k=k+1;
		}
		System.out.println("");
		System.out.println(arreglo2);
		System.out.println("fin programa"); 
	}

}
