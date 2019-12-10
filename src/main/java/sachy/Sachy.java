/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sachy;

import hraci_deska.Policka;
import hraci_deska.Sachovnice;
import java.io.File;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;




/**
 *
 * @author kedar
 */
public class Sachy extends Application {
    public static Stage okno;
    Scene menu, hra;
    private static Scene ProhraSc;
    private static Scene VyhraSc;
    
    public static void main(String[] args) {
        launch();
    } 
    
    public void start(Stage primaryStage) throws Exception {
        okno = primaryStage;
        //Zacatek Hlavniho menu
        Label nazevHry = new Label("Sachy");
        Button START = new Button("ZAPNI HRU");
        Button VYPNOUT = new Button("Vypnout");
        
        String style1 = "-fx-font-size: 3em;";
		String style2 = "-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), "
						+ "linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black;"
						+ "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-size: 1.9em; -fx-padding: 10px;";
        
        nazevHry.setStyle(style1);
        START.setStyle(style2);
        VYPNOUT.setStyle(style2);
        
        VBox menuVBox = new VBox(40);
		menuVBox.setAlignment(Pos.CENTER);

		menuVBox.getChildren().addAll(nazevHry, START, VYPNOUT);

		Scene menu = new Scene(menuVBox, Policka.VELIKOST * 10, Policka.VELIKOST * 10);
               
                
                
                 //Nastaveni Hry
                Sachovnice hraci_deska = new Sachovnice();
                Scene hra = new Scene(hraci_deska, Policka.VELIKOST * 8, Policka.VELIKOST * 8);
               
                ////
                
                Label Vyhra = new Label("Vyhral bilý");

		Vyhra.setStyle(style1);

		VBox VyhraVBox = new VBox(40);
		VyhraVBox.setAlignment(Pos.CENTER);

		VyhraVBox.getChildren().add(Vyhra);

		VyhraSc = new Scene(VyhraVBox, Policka.VELIKOST * 8, Policka.VELIKOST * 8, Color.BLACK);

		START.setOnAction(e -> primaryStage.setScene(hra));
		VYPNOUT.setOnAction(e -> System.exit(0));
                ////
                
                Label Prohra = new Label("Vyhral Èerný");

		String style3 = "-fx-font-size: 3em;";

		Prohra.setStyle(style3);

		VBox ProhraVBox = new VBox(40);
		ProhraVBox.setAlignment(Pos.CENTER);

		ProhraVBox.getChildren().add(Prohra);

		ProhraSc = new Scene(ProhraVBox, Policka.VELIKOST * 8, Policka.VELIKOST * 8, Color.BLACK);
		okno.getIcons().add(new Image("WHITE_KRAL.png"));
                okno.setTitle("Sachy DOPICI");
		okno.setResizable(false);
                
              
                
                
                
		okno.setScene(menu);
		okno.show();
	}
 
	public static void Prohra() {
		okno.setScene(ProhraSc);
	}

	public static void Vyhra() {
		okno.setScene(VyhraSc);
	}
   
     
}
