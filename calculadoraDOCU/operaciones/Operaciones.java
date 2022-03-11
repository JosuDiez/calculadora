package operaciones;
public class Operaciones{
	
	/**
	 * suma los valores
	 * 
	 * @param numero 1
	 * @param numero 2
	 * @return la suma de numero 1 con numero 2 en formato int
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
	 * resta los valores
	 * 
	 * @param numero 1
	 * @param numero 2
	 * @return la resta de numero 1 con numero 2 en formato int
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
	 * multiplica los valores
	 * 
	 * @param numero 1
	 * @param numero 2
	 * @return la multiplicacion de numero 1 con numero 2 en formato int
	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
	 * dividir los valores
	 * 
	 * @param numero 1
	 * @param numero 2
	 * @return la division de numero 1 con numero 2 en formato int
	 */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
	 * divide los valores y devuelve el resto
	 * 
	 * @param numero 1
	 * @param numero 2
	 * @return el resto de la division de numero 1 con numero 2 en formato int
	 */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}