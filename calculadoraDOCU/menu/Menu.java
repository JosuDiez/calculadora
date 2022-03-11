package menu;
import java.util.Scanner;
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * pide dos numeros al usuario 
     * 
     * @return devuelve un array de ints de dos posiciones, con los numeros que ha introducido el usuario
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    
    /**
     * pregunta que operacion matematica quiere ejecutar el usuario
     * 
     * @return devuelve un String con el simbolo de la operacion
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    
    /**
     * pregunta al usuario si quiere continuar con el prograna
     * 
     * @return un booleano true si se quiere continuar o false si no
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}