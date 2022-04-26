package fi.unju.edu.ar.ejercicio2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		 //creacion de un objeto de clase arreglo
        ArregloNumero arreglo1 =new ArregloNumero();
        ArregloNumero arreglo2 =new ArregloNumero();
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int valor=-1;
        boolean band=true;
        while (band==true){
            System.out.println("Ingrese un numero [1,9]");
            valor= entrada.nextInt();
            if (valor>0 && valor<10) {
            	//Se almacenan los numeros en dos arreglos
                for(int i=0;i<=10;i++) {
                	arreglo1.getNumeros()[i] = i;			//arreglo con elemento 0 al 10
                	arreglo2.getNumeros()[i] = valor*i;}	//arreglo con resultados
                //Se muestra la tabla del valor ingresado
                for(int j=0;j<=10;j++) {
                	System.out.println(valor+" x "+j+" = "+arreglo2.getNumeros()[j]);
                    	}
                System.out.println("¿Desea ingresar  otro numero? Rta: si/no");
                String resp= entrada.next();
                 if(resp.equals("no")||resp.equals("NO")) {
                	 band=false;
                 }
          
            }else {
            	System.out.println("ingrese un numero del 1 al 9");
            }
        }
           				
            	
            System.out.println("Fin del programa");
        
        	}

}
