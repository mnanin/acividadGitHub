
// Este programa va a calcular la superficie de un rectángulo, para ello, dispondrá de dos funciones:
// La primera función, pedirá un número entero(en centímetros) que será uno de los lados del rectángulo.
// La segunda función, calculará la superficie del rectángulo mediante estos dos números.

package actividadgithub;

import java.util.Scanner;

public class ActividadGitHub {

    // Declaración de constantes:
    static final String MSJ_ERROR_VALOR = "El valor introducido no es correcto";
    static final String MSJ_PEDIR_LADO_A = "Introduce la medida del lado A del rectángulo (en centímetros): ";
    static final String MSJ_PEDIR_LADO_B = "Introduce la medida del lado B del rectángulo (en centímetros): ";

    public static void main(String[] args) {
        
        // Pedimos los dos lados del rectángulo:
        int ladoA = pedirEntero(MSJ_PEDIR_LADO_A, MSJ_ERROR_VALOR);
        int ladoB = pedirEntero(MSJ_PEDIR_LADO_B, MSJ_ERROR_VALOR);
        calculaSuperficie (ladoA, ladoB);
    }
    
    // Método para introducir por teclado el número que será devuelto al código que lo ha llamado:
    // El parámetro "mensaje" contiene el texto que se mostrará para solicitar la introducción de un número entero.
    // El parámetro "mensajeError" contiene el texto que se mostrará en caso de que se introduzca un valor incorrecto o que no se introduzca ninguno.
    // El parámetro "return" devuelve el valor de la variable "enteroIntroducido", que es el número que se ha introducido por teclado.
    public static int pedirEntero(String mensaje, String mensajeError) {
        
        // Declaración de variable:
        boolean valorCorrecto = false;
        
        // Inicializamos el Scanner:
        Scanner scan = new Scanner(System.in);
        
        // Iniciamos el bucle para comprobar si el valor introducido es correcto:
        do {
            
            // Mostramos el mensaje para pedir un entero:
            System.out.println(mensaje);
            
            // Leemos el valor introducido y lo atribuimos a la variable "valorCorrecto":
            valorCorrecto = scan.hasNextInt();
            
            // Si el valor no es correcto, mostramos el mensaje de error:
            if (!valorCorrecto) {
                scan.next();
                System.out.print(mensajeError);
            }
            
        // El bucle no acabará hasta que el valor introducido sea correcto:
        } while (!valorCorrecto);
        
        // Introducimos por teclado el valor y lo atribuimos a la variable "enteroIntroducido".
        int enteroIntroducido = scan.nextInt();
        scan.nextLine();
        
        // Devolvemos el valor de la variable "enteroIntroducido".
        return enteroIntroducido;
    }
    
    // Método que, pasadas las medidas de los dos lados del rectángulo como parámetros, calcula la superficie y la muestra por pantalla mediante el return:
    // El parámetro ladoA corresponde al valor de tipo entero de uno de los lados del rectángulo.
    // El parámetro ladoB corresponde al valor de tipo entero del otro lado del rectángulo.
    // El parámetro "return" devuelve el valor de la variable "resultado", que es un String con la superficie después de haberlo incorporado en una salida predefinida.
    public static String calculaSuperficie(int ladoA, int ladoB){
    
        // Creamos la variable de tipo entero "superficie" a la que atribuimos el resultado de multiplicar ladoA por ladoB:
        int superficie = ladoA * ladoB;
        
        // Atribuimos el valor de la superficie a la variable de tipo String "resultado" para incorporarlo en una salida predefinida:
        String resultado = "La superficie del rectángulo es de " + superficie + " centímetros cuadrados.";
    
        // Mostramos el valor de la variable "resultado" por pantalla mediante el return:
        return resultado;
    }
}