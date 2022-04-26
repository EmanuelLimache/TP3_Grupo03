package fi.unju.edu.ar.ejercicio4;

import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int[] arreglo = new int[8];
		for (int i=0;i<8;i++) {
			System.out.println((i+1)+"Ingrese numero ");
			int valor= leer.nextInt();
			arreglo[i]=valor;
		}
		for(int j=0;j<8;j++) {
			
			if (arreglo[j]%2==0) {
				System.out.println(arreglo[j]+" par");
			}else {
				System.out.println(arreglo[j]+" impar");
			}
		}
	System.out.println("Fin del programa");	
	}
}
