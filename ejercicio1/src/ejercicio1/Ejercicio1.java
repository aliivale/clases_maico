package ejercicio1;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); 
            PrintStream mostrar = new PrintStream(System.out);
            logica log = new logica();
            
            
            /*
            mostrar.print("Ingrese el valor x una hora de trabajo: ");
            float valor = Float.parseFloat(leer.readLine());
            mostrar.print("Ingrese la cantidad de horas trabajadas: ");
            int horas = Integer.valueOf(leer.readLine());
            mostrar.print("El sueldo es: " + log.multiplicar(valor, horas));
            
            
            mostrar.print("Ingrese el valor del angulo 1: ");
            int lado1 = Integer.valueOf(leer.readLine());
            mostrar.print("Ingrese el valor del angulo 2: ");
            int lado2 = Integer.valueOf(leer.readLine());
            mostrar.print("La respuesta es: " + log.calcularangulo(lado1, lado2)+ "\n");
            */
            mostrar.print("Ingrese la temperatura en grados Fahrenheit: ");
            int grado = Integer.valueOf(leer.readLine());
            mostrar.print("La temperatura en celcius es: "+ log.calculargrado(grado)+ "\n");
            
            
            
        }        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}
