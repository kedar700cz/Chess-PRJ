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
public class Dama extends Figurka{
    
    public Dama(Color b){
        super(b);
    }
    @Override
    public void UkazPohyby(int x, int y){
        //Vlevo
        for(int i= 1; i<8 ; i++){
            if(x-i <0){
                break;
            }
            Policka p1 = Sachovnice.getPolicka(x-i, y);
            if(!p1.hasPiece())
                p1.Ukazatel(getColor());
            else{
                p1.Ukazatel(getColor());
                break;
            }
        }
        /////// Vpravo
        for(int i= 1; i<8 ; i++){
            if(x+i >7){
                break;
            }
            Policka p1 = Sachovnice.getPolicka(x+i, y);
            if(!p1.hasPiece())
                p1.Ukazatel(getColor());
            else{
                p1.Ukazatel(getColor());
                break;
            }
        }
        ////NAHORU
        for(int i= 1; i<8 ; i++){
            if(y-i >0){
                break;
            }
            Policka p1 = Sachovnice.getPolicka(x, y- i);
            if(!p1.hasPiece())
                p1.Ukazatel(getColor());
            else{
                p1.Ukazatel(getColor());
                break;
            }
        }
                    
        ///DOLU
        for(int i= 1; i<8 ; i++){
            if(y+i >7){
                break;
            }
            Policka p1 = Sachovnice.getPolicka(x, y+i);
            if(!p1.hasPiece())
                p1.Ukazatel(getColor());
            else{
                p1.Ukazatel(getColor());
                break;
            }
        }
        //Nahoru Vlevo
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

        // Nahoru Vpravo
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

		// Dolu Vlevo
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

		// Dolu vpravo
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
