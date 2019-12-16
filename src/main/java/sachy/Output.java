/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package sachy;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 *
 * @author kedar
 */
 
public class Output {
    
    public static void ulozOutput(String win){
        try{
            BufferedWriter output = new BufferedWriter(new FileWriter("vysledky.txt",true));
            output.append(win + "\n" );
            output.close();       
        } catch(IOException ex){
            System.out.println("Chyba zapisu souboru.");
        }
    }
    
}
