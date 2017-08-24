/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.Logica;

import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Bajo extends Instrumento{

    public void dibujar(Graphics g) {
       System.out.println("dibujando el violin");
    }

    public void tocar() {
        System.out.println("tocando el bajo");
    }
    
}
