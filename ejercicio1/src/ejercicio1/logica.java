/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author aliva
 */
public class logica {

    logica() {
    }

    float multiplicar(float v, int h) {
        float sueldo = v * h;
        return sueldo;
    }

    int calcularangulo(int l1, int l2) {

        int suma = l1 + l2;

        int rta = 180 - suma;

        return rta;

    }

    float calculargrado(int gf) {
        System.out.println(gf);
        float c = ((gf - 32) * 5 / 9);
        return c;
    }

    double calcularprecio(double precio, int plan) {

        double preciofinal = 0;

        if (plan == 1) {

            preciofinal = precio - (precio * 0.1);

        } else if (plan == 2) {

            preciofinal = precio + (precio * 0.1);
        } else if (plan == 3) {

            preciofinal = precio + (precio * 0.15);
        } else {

            preciofinal = precio + (precio * 0.25);
        }

        return preciofinal;

    }

    String calcularsigno(int dia, int mes) {
        
        String signo = "";
        if((dia >21 && mes == 3) || (dia <19 && mes == 4)){
            
            signo = "Aries";
            
            
        
        }
        /*
        else if(){
        }
        */
        return signo;
    }

}
