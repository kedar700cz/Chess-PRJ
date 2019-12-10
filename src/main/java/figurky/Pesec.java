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
public class Pesec extends Figurka {

    private boolean hasMoved = false;

    public Pesec(Color b) {
        super(b);
    }

    public void UkazPohyby(int x, int y) {

        //BILY POHYB
        if (this.getColor() == Color.WHITE) {
            Policka s1 = Sachovnice.getPolicka(x, y - 1);
            if (!s1.hasPiece()) {
                s1.pohniUkazatel();
            } else {
                Policka s3 = Sachovnice.getPolicka(x + 1, y - 1);
                if (s3.hasPiece() && this.getColor() != Color.BLACK) {
                    s3.UtocnyUkazatel();
                }
                Policka s5 = Sachovnice.getPolicka(x - 1, y - 1);
                if (s5.hasPiece() && this.getColor() != Color.BLACK) {
                    s5.UtocnyUkazatel();
                }
            }
            if (!hasMoved) {
                Policka s2 = Sachovnice.getPolicka(x, y - 2);
                if (!s2.hasPiece()) {
                    s2.pohniUkazatel();
                } else {
                    Policka s3 = Sachovnice.getPolicka(x + 1, y - 1);
                    if (s3.hasPiece() && this.getColor() != Color.BLACK) {
                        s3.UtocnyUkazatel();
                    }
                    Policka s5 = Sachovnice.getPolicka(x - 1, y - 1);
                    if (s5.hasPiece() && this.getColor() != Color.BLACK) {
                        s5.UtocnyUkazatel();
                    }
                }
            }
        }
        ///CERNY POHYB

        if (this.getColor() == Color.BLACK) {
            Policka s1 = Sachovnice.getPolicka(x, y + 1);
            if (!s1.hasPiece()) {
                s1.pohniUkazatel();
            } else {

                Policka s4 = Sachovnice.getPolicka(x + 1, y + 1);
                if (s4.hasPiece() && this.getColor() != Color.WHITE) {
                    s4.UtocnyUkazatel();
                }

                // Black Left Down
                Policka s3 = Sachovnice.getPolicka(x - 1, y + 1);
                if (s3.hasPiece() && this.getColor() != Color.WHITE) {
                    s3.UtocnyUkazatel();
                }
            }
            if (!hasMoved) {
                Policka s2 = Sachovnice.getPolicka(x, y + 2);
                if (!s2.hasPiece()) {
                    s2.pohniUkazatel();
                } else {
                    Policka s4 = Sachovnice.getPolicka(x + 1, y + 1);
                    if (s4.hasPiece() && this.getColor() != Color.WHITE) {
                        s4.UtocnyUkazatel();
                    }

                    // Black Left Down
                    Policka s3 = Sachovnice.getPolicka(x - 1, y + 1);
                    if (s3.hasPiece() && this.getColor() != Color.WHITE) {
                        s3.UtocnyUkazatel();
                    }
                }
            }
        }
        /*
        if (x - 1 > 0 || y - 1 > 0 || x + 1 < 7 || y + 1 < 7) {
            // White Right Up
            if (this.getColor() == Color.WHITE) {
                Policka s3 = Sachovnice.getPolicka(x + 1, y - 1);
                if (s3.hasPiece() && this.getColor() != Color.BLACK) {
                    s3.UtocnyUkazatel();
                }

                // White Left Up
                Policka s5 = Sachovnice.getPolicka(x - 1, y - 1);
                if (s5.hasPiece() && this.getColor() != Color.BLACK) {
                    s5.UtocnyUkazatel();
                } else {
                    return;
                }

            }
            if (this.getColor() != Color.BLACK) {
                Policka s4 = Sachovnice.getPolicka(x + 1, y + 1);
                if (s4.hasPiece() && this.getColor() != Color.WHITE) {
                    s4.UtocnyUkazatel();
                }

                // Black Left Down
                Policka s3 = Sachovnice.getPolicka(x - 1, y + 1);
                if (s3.hasPiece() && this.getColor() != Color.WHITE) {
                    s3.UtocnyUkazatel();
                } else {
                    return;
                }
            }
        
   }  */
    }

    public void changePawnToQueen() {

    }

    public void move() {
        hasMoved = true;
    }

    @Override
    public void hideMove() {

    }
}
