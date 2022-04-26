package fi.unju.edu.ar.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;
public class Pricipal7 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<String> lista= new ArrayList<String>();
		 boolean band=true;
	     while (band==true){
	            System.out.println("Ingrese una fruta");
	            String fru=leer.next();
	            lista.add(fru);
	            System.out.println("¿Desea ingresar otra fruta? (S/N)");
                String resp= leer.next();
                 if(resp.equals("N")||resp.equals("n")) {
                	 band=false;
                 }
	     }
	     System.out.println("------------------------------");
	     System.out.println("Mostrar Lista por indice par");
	     for(int i=0;i<lista.size();i++){
	    	 if(i%2==0) {
	    	 System.out.println(lista.get(i));
	    	 }
	     }
	     System.out.println("------------------------------");
	     System.out.println("Eliminar fruta por indice");
	     //eliminar fruta por indice ingresado
	     int cont=0;
	     do{
	    	 System.out.println("Ingrese numero del indice");
	    	 int numero=leer.nextInt();
	    	 if(numero>=0 && numero<=lista.size()) {
	    		 lista.remove(numero);
	    		 System.out.println("se elimino un elemento");
	    		 cont=1;
	    	 }
	    	 System.out.println("------------------------------");	 
	     }while(cont==0);
	     //mostrar  lista 
	     for(int i=0;i<lista.size();i++){
	    	 System.out.println("Lista: "+lista.get(i));
	     }
	     System.out.println("------------------------------");
	     //cantidad de elmentos 
	     System.out.println("Cantidad de elementos: "+lista.size());
	     }
}
