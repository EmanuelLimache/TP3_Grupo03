package fi.unju.edu.ar.ejercicio1;

public class ArregloNumero {
	private  int [] numeros;

	public ArregloNumero(){
        setNumeros(new int [5]);
    }
	
	public void mostrarElementosDelArreglo(){
        for (int i=0; i < numeros.length; i++ )
            System.out.println(" "+numeros[i] );
    }
	
	
	
//---------------------------------------------
	public ArregloNumero(int[] numeros) {
		this.numeros = numeros;
	}
	
	
//---------------------------------------------
	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
}
