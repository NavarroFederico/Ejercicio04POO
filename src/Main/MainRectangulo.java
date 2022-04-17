/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Entidades.Rectangulo;
import ClasesDeServicio.servicioRectangulo;
/**
 *
 * @author ASUS
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servicioRectangulo servicioRectangulo1 = new servicioRectangulo();
        
        Rectangulo rectangula1 = servicioRectangulo1.crearRectangulo();
        
        servicioRectangulo1.dibujarElRectangulo(rectangula1);
        
    }
    
}
