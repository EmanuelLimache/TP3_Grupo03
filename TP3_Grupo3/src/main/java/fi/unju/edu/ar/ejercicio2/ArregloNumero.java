package fi.unju.edu.ar.ejercicio2;

public class ArregloNumero {
	
	 private  int [] numeros;
	    
	    public ArregloNumero(){
	        setNumeros(new int [11]);
	    }
	    /*public void mostrarTabla(int a, int b){
	        for (int i=0; i < numeros.length; i++ )
	            System.out.println(i+" x "+numeros[i] );
	    }
	    */
	    
	    
	    
	    //------------------------------------------------------
	    public int[] getNumeros() {
	        return numeros;
	    }

	    public void setNumeros(int[] numeros) {
	        this.numeros = numeros;
	    }
}
