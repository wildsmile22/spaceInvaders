/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author luis feliz
 */
public class Explosion {
   Image imagenExplosion = null;
   Image imagenExplosion2 = null;
    //coordenadas de la Explosion
   private int x = 0;
   private int y = 0;
   private int tiempoDevida = 35;

    public int getTiempoDevida() {
        return tiempoDevida;
    }

    public void setTiempoDevida(int tiempoDevida) {
        this.tiempoDevida = tiempoDevida;
    }

    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
   public Explosion(){
        try {
            imagenExplosion = ImageIO.read((getClass().getResource("/imagenes/e1.png")));
            imagenExplosion2 = ImageIO.read((getClass().getResource("/imagenes/e2.png")));
        } catch (IOException ex) {
           
        }
   }
}