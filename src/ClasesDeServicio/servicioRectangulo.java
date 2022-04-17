/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeServicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class servicioRectangulo {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo ");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = leer.nextInt();

        Rectangulo nuevoRectangulo = new Rectangulo(base, altura);
        return nuevoRectangulo;
    }

    public void dibujarElRectangulo(Rectangulo rectanguloActual) {
        final String unidad = " * ";
//        String resultado= "";

        int base = rectanguloActual.getBase();
        int altura = rectanguloActual.getAltura();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if (i !=1 && i!=altura && (j==1 | j==base) ) {
//                    resultado+=unidad;
                    System.out.print("* ");
                }
                else if(i==1 || i== altura){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                    
                }
            }System.out.println("");
        }
    }
}
