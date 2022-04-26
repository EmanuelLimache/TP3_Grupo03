package fi.unju.edu.ar.ejercicio6;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		ArregloNumero arreglo= new ArregloNumero();
		System.out.println("Ingrese un numero");
		for(int i=0;i<10;i++) {
			int numero = leer.nextInt();
			arreglo.getNumeros()[i]=numero;
		}
		System.out.println("-----Orden inverso-----");
		for(int i=9;i>=0;i--) {
			int a=arreglo.getNumeros()[i];
			System.out.println(a);
		}
		System.out.println("-----Orden ingresado-----");
		for(int i=0;i<=9;i++) {
			System.out.println(arreglo.getNumeros()[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arreglo2=new int[10];
		System.out.println("Ingrese un numero");
		for(int i=0;i<10;i++) {
			int numero = leer.nextInt();
			arreglo[i]=numero;
		}
		
		System.out.println(arreglo);
		int a=0;
		for(int j=9;j>=0;j--) {
			arreglo2[a]=arreglo[j];
			a=a+1;
		}
		System.out.println("");
		System.out.println(arreglo2);
		*/
		System.out.println("fin programa");

	}

}
