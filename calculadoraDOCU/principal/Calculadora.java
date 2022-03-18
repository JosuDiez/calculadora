package principal;
import menu.Menu;
import operaciones.Operaciones;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculadora{
	 private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
    public static void main(String[] args) {
    	
        Handler consoleHandler = null;
        Handler fileHandler  = null;
    	
        try{
        	
        	consoleHandler = new ConsoleHandler();
            fileHandler  = new FileHandler("./operaciones.log");
        	
            //Asignar handlers al objeto LOGGER
            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);
             
            //Establecer niveles a handlers y LOGGER
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);
             
            LOGGER.config("Configuración hecha.");
             
            //Eliminamos handler de la consola
            LOGGER.removeHandler(consoleHandler);
             
            LOGGER.log(Level.FINE, "Nivel de log cambiado a FINE");
            
	        int resultado = 0;
	        String operacion = "";
	        int[] operandos = new int [2];
	        
	        Menu menu = new Menu();
	        Operaciones operaciones = new Operaciones();
	        
	        do{
	            operandos = menu.pedirNumeros();
	            operacion = menu.menuOpciones();
	            
	            LOGGER.log(Level.FINE, " operando 1: " + operandos[0] + " operando 2: " + operandos[1]);
	            
	            if (operacion.equalsIgnoreCase("+")){
	                resultado = operaciones.sumar(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	                LOGGER.log(Level.FINE, "ha sumado");
	            } else if (operacion.equalsIgnoreCase("-")){
	                resultado = operaciones.restar(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	                LOGGER.log(Level.FINE, "ha restado");
	            } else if (operacion.equalsIgnoreCase("*")){
	                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	                LOGGER.log(Level.FINE, "ha multiplicado");
	            } else if (operacion.equalsIgnoreCase("/")){
	                resultado = operaciones.dividir(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	                LOGGER.log(Level.FINE, "ha dividido");
	            } else if (operacion.equalsIgnoreCase("%")){
	                resultado = operaciones.resto(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	                LOGGER.log(Level.FINE, "ha calculado el resto");
	            } else {
	                System.out.println ("Operación no válida");
	                LOGGER.log(Level.FINE, "La operacion no es valida");
	            }
	        }   while (menu.repetir());
        } catch (java.lang.ArithmeticException | SecurityException | IOException e) {
        	LOGGER.log(Level.WARNING, "Error matematico, ten en cuenta que no se puede dividir por 0");
		} 
    }
}