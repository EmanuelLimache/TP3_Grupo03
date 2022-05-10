package fi.unju.edu.ar.ejercicio9;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal9 {

	public static void main(String[] args) {
		
		ArrayList<Producto> listaProducto= new ArrayList<Producto>();
		
		
		boolean band=true;
		Scanner leer = new Scanner(System.in);
		do {System.out.println(" ");
		System.out.println("*** MENU ***");
		System.out.println("1- Nuevo producto");
		System.out.println("2- Mostrar todos los productos");
		System.out.println("3- Incrementar precio a todos los productos");
		System.out.println("4- Monto total de todos los productos");
		System.out.println("5- Fin");
			System.out.println("Ingrese un opcion");
			int opcion=leer.nextInt();
			switch(opcion) {
			case 1:
				Producto nuevoProducto = new Producto();
				listaProducto.add(nuevoProducto);
				System.out.println("Ingrese codigo del producto");
				int codigo=leer.nextInt();
				nuevoProducto.setCodigo(codigo);
				
				System.out.println("Ingrese descripcion");
				String descripcion=leer.next();
				nuevoProducto.setDescripcion(descripcion);
				
				System.out.println("Ingrese precio");
				double precio=leer.nextDouble();
				nuevoProducto.setPrecio(precio);
				
				System.out.println("Ingrese marca");
				String marca=leer.next();
				nuevoProducto.setMarca(marca);
				
				System.out.println("Se ha agregado un nuevo alumno");
				break;
			case 2:
				
				if (!listaProducto.isEmpty()) {
					 for(int i=0;i<listaProducto.size();i++){
						System.out.println(" ");
						System.out.println(listaProducto.get(i).getCodigo());
						System.out.println(listaProducto.get(i).getDescripcion());
						System.out.println(listaProducto.get(i).getPrecio());
						System.out.println(listaProducto.get(i).getMarca());
				     }
					/*for(Producto nuevoProducto : listaProducto) {
						System.out.println(nuevoProducto.getCodigo());
						System.out.println(nuevoProducto.getDescripcion());
						System.out.println(nuevoProducto.getPrecio());
						System.out.println(nuevoProducto.getMarca());
					}*/
					 
				}else {
					System.out.println("La lista esta vacia");
				}
			break;
			case 3:
				System.out.println(" ");
				if (!listaProducto.isEmpty()) {
					 for(int i=0;i<listaProducto.size();i++){
						double a=listaProducto.get(i).getPrecio()+100.25;
						listaProducto.get(i).setPrecio(a);
				     }
					
					 System.out.println("Incremento realizado ");
				}else {
					System.out.println("La lista esta vacia");
				}
				break;
			case 4:
				System.out.println(" ");
				double a=0;
				if (!listaProducto.isEmpty()) {
					 for(int i=0;i<listaProducto.size();i++){
						a=listaProducto.get(i).getPrecio()+a;
				     }
					
					 System.out.println("TOTAL DE PRECIOS = "+a);
				}else {
					System.out.println("La lista esta vacia");
				}
			break;
			case 5:
				band=false;
				System.out.println("Fin del programa");
				break;
				default:
					System.out.println("Ingrese una opcion correcta");
			}
		}while(band==true);

		
		
	}
}
