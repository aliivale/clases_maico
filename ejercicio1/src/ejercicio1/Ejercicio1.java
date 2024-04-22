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
            
            mostrar.print("Ingrese la temperatura en grados Fahrenheit: ");
            int grado = Integer.valueOf(leer.readLine());
            mostrar.print("La temperatura en celcius es: "+ log.calculargrado(grado)+ "\n");
            
            
            mostrar.print(" BIENVENIDO A TECNOMUNDO!!! \n ");
            mostrar.print("------------------------------------ \n ");
            mostrar.print("Ingrese el producto que quiere: ");
            String producto1 = leer.readLine();
            mostrar.print(" Precio: $" );
            double precio1 = Float.valueOf(leer.readLine());
            mostrar.print(" \n PLANES DISPONIBLES: \n");
            mostrar.print(" Plan 1: Abonando el 100% en el primer pago, te regalamos un descuento del 10%. \n Plan 2: Abonando el 50% en el primer pago, tenes acceso a 2 cuotas para pagar el resto incrementando al precio base un 10%. \n Plan 3: Abonando el 25% en el primer pago, tenes acceso a 5 cuotas para pagar el resto incrementando al precio base un 15%. \n Plan 4: Abonando el 60% en 4 cuotas, tenes acceso a 4 cuotas para pagar el resto incrementando al precio base un 25%. \n ");
            mostrar.print("\n Ingrese el numero del plan seleccionado: ");
            int plan1 = Integer.valueOf(leer.readLine());
            //calculamosprecio.()
            mostrar.print("\n El precio final es: " + log.calcularprecio(precio1, plan1) + "\n");
            */
            
            /*
            
            
            SAGITARIO
            22 NOVIEMBRE Y 21 DE DICIEMBRE
            LEO 
            22 DE JULIO A 23 DE AGOSTO
            
            
            
            
            22 7 AL 23 8
            DIA : 8
            MES : 8
            
            
            
            
            
            
            
            
            
            
            
            
            
            */
            
            mostrar.print("Dia: \n");
            int dia = Integer.valueOf(leer.readLine());
            mostrar.print("Mes: \n");
            int mes = Integer.valueOf(leer.readLine());
            mostrar.print("El signo es: " + log.calcularsigno(dia, mes));
        
            
            
            
            
        }        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}
