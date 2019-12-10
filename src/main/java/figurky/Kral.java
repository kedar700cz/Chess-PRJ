/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurky;

import javafx.scene.paint.Color;
import hraci_deska.Sachovnice;
import hraci_deska.Policka;
/**
 *
 * @author kedar
 */
public class Kral extends Figurka {
    
    public Kral(Color b) {
        super(b);
    }
   public void UkazPohyby(int x, int y) {

		// Left
		for (int i = 1; i < 2; i++) {
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
		for (int i = 1; i < 2; i++) {
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
		for (int i = 1; i < 2; i++) {
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
		for (int i = 1; i < 2; i++) {
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

		// Up Left
		for (int i = 1; i < 2; i++) {
			if (x - i < 0 || y - i < 0) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x - i, y - i);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}

		// Up Right
		for (int i = 1; i < 2; i++) {
			if (x + i > 7 || y - i < 0) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x + i, y - i);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}

		// Down Left
		for (int i = 1; i < 2; i++) {
			if (x + i > 7 || y + i > 7) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x + i, y + i);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}

		// Down Right
		for (int i = 1; i < 2; i++) {
			if (x - i < 0 || y + i > 7) {
				break;
			}
			Policka p1 = Sachovnice.getPolicka(x - i, y + i);
			if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
				break;
			}
		}
	}

	public void hideMove() {

	} 
}
    
