/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sachy;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
/**
 *
 * @author kedar
 */
public class AboutAlert {
    public static void zobraz(String Jmeno, String Zprava){
        Stage Okno = new Stage();
        Okno.initModality(Modality.APPLICATION_MODAL);
        Okno.setTitle(Jmeno);
        Okno.setMinWidth(250);
        Okno.setMinHeight(100);
        
        Label label = new Label();
        label.setText(Zprava);
        Button ZavritOkno = new Button("Zavrit");
        ZavritOkno.setOnAction(e -> Okno.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,ZavritOkno);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        Okno.setScene(scene);
        Okno.showAndWait();
    }
            
}
