/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hraci_deska;

import figurky.Pesec;
import figurky.Dama;
import figurky.Jezdec;
import figurky.Kral;
import figurky.Strelec;
import figurky.Vez;
import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.paint.Color;

/**
 *
 * @author Radek Holusa
 */
public class Sachovnice extends Group{
    public static ArrayList<ArrayList<Policka>> vsechny_policka = new ArrayList<ArrayList<Policka>>();
    public Sachovnice(){
        for(int radek =0; radek < 8; radek++){
            ArrayList<Policka> poleRadku = new ArrayList<Policka>();
                for(int sloupec =0; sloupec < 8; sloupec++){
                    
                    Color pozadi = Color.DIMGREY;
                    
                        if((radek + sloupec)%2==0){
                            pozadi = Color.WHITE;
                            }
                        
                            Policka p = new Policka(pozadi);
                            ///Da X a Y souradnici Policku
                            p.setTranslateX(sloupec * Policka.VELIKOST);
                            p.setTranslateY(radek * Policka.VELIKOST);
                            this.getChildren().add(p);
                            poleRadku.add(p);

                        
                             
                    
                                     // Pesec
				if (radek == 1) {
					p.PridejFigurku(new Pesec(Color.BLACK));
				}

				if (radek == 6) {
					p.PridejFigurku(new Pesec(Color.WHITE));
				}
				// Vez
				if (radek == 0) {
					if (sloupec == 0 || sloupec == 7) {
						p.PridejFigurku(new Vez(Color.BLACK));
					}
				}

				if (radek == 7) {
					if (sloupec == 0 || sloupec == 7) {
						p.PridejFigurku(new Vez(Color.WHITE));
					}
				}

				// Jezdec
				if (radek == 0) {
					if (sloupec == 1 || sloupec == 6) {
						p.PridejFigurku(new Jezdec(Color.BLACK));
					}
				}

				if (radek == 7) {
					if (sloupec == 1 || sloupec == 6) {
						p.PridejFigurku(new Jezdec(Color.WHITE));
					}
				}

				// Strelec
				if (radek == 0) {
					if (sloupec == 2 || sloupec == 5) {
						p.PridejFigurku(new Strelec(Color.BLACK));
					}
				}

				if (radek == 7) {
					if (sloupec == 2 || sloupec == 5) {
						p.PridejFigurku(new Strelec(Color.WHITE));
					}
				}

				// Dama
				if (radek == 0) {
					if (sloupec == 3) {
						p.PridejFigurku(new Dama(Color.BLACK));
					}
				}

				if (radek == 7) {
					if (sloupec == 3) {
						p.PridejFigurku(new Dama(Color.WHITE));
					}
				}

				// Kral
				if (radek == 0) {
					if (sloupec == 4) {
						p.PridejFigurku(new Kral(Color.BLACK));
					}
				}

				if (radek == 7) {
					if (sloupec == 4) {
						p.PridejFigurku(new Kral(Color.WHITE));
					}
				}

			}
                         vsechny_policka.add(poleRadku);
        } 
    
  }
              
           public static Policka getPolicka(int x, int y) {
		return vsechny_policka.get(y).get(x);
	}
    
}
