package fi.unju.edu.ar.ejercicio1;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
	
        int [] arreglo1 = new int [5];
        int [] arreglo2 = new int [5];
        Scanner entrada = new Scanner(System.in);
        int contador= 0;
        int contador2= 0; 
        while (contador <5){
            System.out.println("a-Ingrese 5 numeros: ");
            int valor=entrada.nextInt();
            arreglo1[contador] = valor;
            contador = contador +1;
        }
        
        while (contador2 <5){
            System.out.println("b-Ingrese 5 numeros: ");
            int valor=entrada.nextInt();
            arreglo2[contador2] = valor;
            contador2 = contador2 +1;
        }
        
        mostrar(arreglo1);
        System.out.println("");
        mostrar(arreglo2);
        System.out.println("");
        division(arreglo1, arreglo2);
        System.out.println("***Fin del programa***");
	}
	public static void mostrar(int [] arreglo) {
		for(int i=0;i<arreglo.length;i++) {
        	System.out.println("Numero: "+arreglo[i]);
        }
    }
	public static void division(int[] arreglo1,int [] arreglo2) {
		int resul=-1;
		System.out.println("**Iniciando la division**");
		for(int i=0;i<arreglo1.length;i++) {
        	try{
        		resul=arreglo1[i]/arreglo2[i];
        		System.out.println(arreglo1[i]+"/"+arreglo2[i]+"="+arreglo1[i]/arreglo2[i]);
        	}catch(ArithmeticException a){
        		System.out.println("No se puede realizar la division, causa -> "+a.getMessage());
        		resul=0;	
        	}finally {
        		System.out.println("fin de la division: "+resul);
        	}
        }
	}
	
}
