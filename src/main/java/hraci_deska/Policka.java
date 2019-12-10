/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hraci_deska;


import java.util.ArrayList;
import sachy.Sachy;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import figurky.Figurka;
import figurky.Kral;


/**
 *
 * @author Radek
 */
public class Policka extends Group {
    public static final double VELIKOST = 80;
    private Rectangle pozadi;
    private Color zakladniBarva;
    private Figurka figurka;
    public static Policka aktivni;
    public static ArrayList<Policka> zamereny = new ArrayList<Policka>();
    private static int  PocitadloKol = 0;
    
    public Policka(Color b){
        zakladniBarva = b;
        pozadi = new Rectangle(VELIKOST,VELIKOST,b);
        this.getChildren().add(pozadi);
        
        this.setOnMouseClicked(event ->{
            if (zamereny.contains(this)) {
				Figurka p = aktivni.figurka;
				if (this.figurka instanceof Kral) {
					if (this.figurka.getColor() == Color.WHITE) {
						Sachy.Prohra();
						System.out.println("Vyhral Cerny");
					}
					if (this.figurka.getColor() == Color.BLACK) {
						Sachy.Vyhra();
						System.out.println("Vyhral Bily    "+ Policka.PocitadloKol + " Pocet Kol!");
					}
					return;
				}
				aktivni.figurka = null;
				aktivni.Deaktivuj();
				PocitadloKol++;
				System.out.println("Kolo: "+ PocitadloKol);
				this.PridejFigurku(p);
				p.move();
				return;
			}

			if (!hasPiece()) {
				return;
			}

			if (hasPiece()) {
				if (PocitadloKol % 2 == 0 && figurka.getColor() == Color.BLACK) { // White
					return;
				}
				if (PocitadloKol % 2 == 1 && figurka.getColor() == Color.WHITE) { // Black
					return;
				}
				Aktivuj();
				int radky = radky();
				int sloupce = sloupce();
			} else {
				if (aktivni != null) {
					aktivni.Deaktivuj();
				}
				Ukazatel(this.figurka.getColor());
			}
            
            
            
            
        });

        
        
    }
   
    private int sloupce(){
        int y = radky();
        for (int i =0; i<8; i++){
            if(Sachovnice.vsechny_policka.get(y).get(i) ==this){
                return i ; 
            }
        }
        return -1;
    }
     public int radky(){
         
       for (int i =0; i<8; i++){
            if(Sachovnice.vsechny_policka.get(i).contains(this)){
                return i ; 
            }
        }
       return -1;
     }
    public void pohniUkazatel(){
        Circle cir = new Circle(VELIKOST/2, VELIKOST/2, VELIKOST / 10, Color.YELLOW);
        this.getChildren().add(cir);
        zamereny.add(this);
    }
   public void Ukazatel(Color c) {
		if (!this.hasPiece()) {
			pohniUkazatel();
		} else {
			if (this.figurka.getColor() != c) {
				UtocnyUkazatel();
			}
		}
	}
   public void UtocnyUkazatel() {
		Circle cir = new Circle(VELIKOST / 2, VELIKOST / 2, VELIKOST / 10, Color.RED);
		this.getChildren().add(cir);
		zamereny.add(this);
	}
   private void OdstranPohniUkazatel() {
		for (Policka policka : zamereny) {
			policka.getChildren().remove(policka.getChildren().size() - 1);
		}
		zamereny.clear();
	}
   private void Aktivuj() {
		if (aktivni != null) {
			aktivni.Deaktivuj();
		}
		aktivni = this;
		this.figurka.UkazPohyby(sloupce(), radky());
		this.ZiskejPozadi().setFill(Color.GREEN);
	}
   private void Deaktivuj() {
		OdstranPohniUkazatel();
		aktivni = null;
		this.ZiskejPozadi().setFill(zakladniBarva);
	}

   public void PridejFigurku(Figurka f) {
		if (hasPiece()) {
			this.getChildren().remove(figurka);
		}
		this.figurka = f;
		this.getChildren().add(f);
	}
   public boolean hasPiece() {
		return this.figurka != null;
	}
   public Rectangle ZiskejPozadi() {
		return this.pozadi;
	}
   public Boolean Kola(int i) {
		boolean KoloBily = true;
		if (i % 2 == 0) {
			return KoloBily = false;
		} else {
			return KoloBily;
		}
	}
   
}
