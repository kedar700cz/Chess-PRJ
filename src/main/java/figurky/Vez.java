/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurky;

import hraci_deska.Policka;
import hraci_deska.Sachovnice;
import javafx.scene.paint.Color;

/**
 *
 * @author kedar
 */
public class Vez extends Figurka{
    
    public Vez(Color b) {
        super(b);
    }
    public void UkazPohyby(int x, int y) {

		// Left
		for (int i = 1; i < 8; i++) {
			if (x - i < 0) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x - i, y);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}

		// Right
		for (int i = 1; i < 8; i++) {
			if (x + i > 7) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x + i, y);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}

		// Up
		for (int i = 1; i < 8; i++) {
			if (y - i < 0) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x, y - i);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}

		// Down
		for (int i = 1; i < 8; i++) {
			if (y + i > 7) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x, y + i);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}
	}
    
    
    public void move() {
		
	}
        public void hideMove() {

	}
    
}

   
