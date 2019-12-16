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
public class Jezdec extends Figurka{
    
    public Jezdec(Color b) {
        super(b);
    }
    public void UkazPohyby(int x, int y) {
            
		if (x + 1 < 8 && y + 2 < 8) {
			Policka p1 = Sachovnice.getPolicka(x + 1, y + 2);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Right Up
		if (x + 2 < 8 && y + 1 < 8) {
			Policka p1 = Sachovnice.getPolicka(x + 2, y + 1);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Right Down
		if (x + 2 < 8 && y - 1 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x + 2, y - 1);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Down Right
		if (x + 1 < 8 && y - 2 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x + 1, y - 2);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Down Left
		if (x - 1 >= 0 && y - 2 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x - 1, y - 2);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Left Down
		if (x - 2 >= 0 && y - 1 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x - 2, y - 1);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Left Up
		if (x - 2 >= 0 && y + 1 < 8) {
			Policka p1 = Sachovnice.getPolicka(x - 2, y + 1);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}

		// Up Left
		if (x - 1 >= 0 && y + 2 < 8) {
			Policka p1 = Sachovnice.getPolicka(x - 1, y + 2);
			p1.pohniUkazatel();
                        if (!p1.hasPiece()) {
				p1.Ukazatel(getColor());
			} else {
				p1.Ukazatel(getColor());
                                
			}
		}
	}

	public void hideMove() {

	}
}
