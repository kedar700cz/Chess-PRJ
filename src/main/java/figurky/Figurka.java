/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurky;


import hraci_deska.Policka;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
/**
 *
 * @author kedar
 */
public abstract class Figurka extends Group implements Movable {
    private final Color barva;
    public Figurka(Color b){
        this.barva = b;
        String BARVA = "WHITE";
		if (b == Color.BLACK) {
			BARVA = "BLACK";
		}
               Image img = new Image(BARVA + "_" + this.getClass().getSimpleName().toUpperCase() + ".png");
               ImageView iv = new ImageView(img);
		iv.setFitWidth(Policka.VELIKOST);
		iv.setFitHeight(Policka.VELIKOST);
                this.getChildren().add(iv);
    }
    
    
    
    
    
    
    
    public void move() {
           
	}
    
    public Color getColor() {
		return this.barva;
	}
    
    
}
