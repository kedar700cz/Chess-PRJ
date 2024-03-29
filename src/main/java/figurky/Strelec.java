/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurky;

import javafx.scene.paint.Color;
import hraci_deska.Policka;
import hraci_deska.Sachovnice;
/**
 *
 * @author kedar
 */
public class Strelec extends Figurka{
    
    public Strelec(Color b) {
        super(b);
    }
    public void UkazPohyby(int x, int y) {

		// Up Left
		for (int i = 1; i < 8; i++) {
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
		for (int i = 1; i < 8; i++) {
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
		for (int i = 1; i < 8; i++) {
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
		for (int i = 1; i < 8; i++) {
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
