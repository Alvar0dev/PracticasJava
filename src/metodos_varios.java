
public class metodos_varios {
	public static void main(String[] args) {
	
	final double pi = 3.1415167328346;
	int num = 3;
	
	double mul = pi + num;
	
		System.out.println(mul);
	
	double resultado = mul + Math.sqrt(10);
	
	int raiz = (int)Math.round(10); //  Refuncion del metodo para que lo transforme la salida en un int
	
	double resultadoRefundido = mul + raiz;
	
	
		System.out.println(resultado);
		System.out.println(resultadoRefundido);
		
		// Metodos string mas utilizados
		
		String nombre = "Alvaro";
		String apellido ="Aguilar";
		
		System.out.println(" Mi nombre tiene " + nombre.length()+ " Letras"); //devuelve la longitud de cadena de caracteres
		System.out.println(" Mi nombre tiene la tercera letra " + nombre.charAt(2)); //devuelve el char en la 3 porsicion del string = v
		
		// Para determinar la ultima letra de un nombre se puede concatenar metodos unos dentro de otros por ejemplo :
		System.out.println(" La ultima letra de mi nombre es la " + nombre.charAt(nombre.length()-1) ); 
		
		System.out.println("las letras comenzando desde la tercera hasta la cuarta  letra de mi nombre es " + nombre.substring(2,3)); //devuelve 3 caracteres a partir de la posicion 3 (empieza desde 0) = var
		System.out.println(" Es mi nombre igual que mi apellido? " + nombre.equals(apellido));// devuelve true si dos cadenas son identicas");
		System.out.println("		nombre.equalsignoreCase(cadena)// devuelve si dos cadenas son identicas ignorando mayusculas");				
}
}
