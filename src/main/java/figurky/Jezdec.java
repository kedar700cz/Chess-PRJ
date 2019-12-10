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
		}

		// Right Up
		if (x + 2 < 8 && y + 1 < 8) {
			Policka p1 = Sachovnice.getPolicka(x + 2, y + 1);
			p1.pohniUkazatel();
		}

		// Right Down
		if (x + 2 < 8 && y - 1 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x + 2, y - 1);
			p1.pohniUkazatel();
		}

		// Down Right
		if (x + 1 < 8 && y - 2 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x + 1, y - 2);
			p1.pohniUkazatel();
		}

		// Down Left
		if (x - 1 >= 0 && y - 2 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x - 1, y - 2);
			p1.pohniUkazatel();
		}

		// Left Down
		if (x - 2 >= 0 && y - 1 >= 0) {
			Policka p1 = Sachovnice.getPolicka(x - 2, y - 1);
			p1.pohniUkazatel();
		}

		// Left Up
		if (x - 2 >= 0 && y + 1 < 8) {
			Policka p1 = Sachovnice.getPolicka(x - 2, y + 1);
			p1.pohniUkazatel();
		}

		// Up Left
		if (x - 1 >= 0 && y + 2 < 8) {
			Policka p1 = Sachovnice.getPolicka(x - 1, y + 2);
			p1.pohniUkazatel();
		}
	}

	public void hideMove() {

	}
}
