/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwrite;

/**
 *
 * @author simono41
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import vokabeltrainer.Vokabeln;

public class readandremove {
    public void read() throws FileNotFoundException, IOException {
        String zeile;
        FileReader fr = new FileReader("./Vokabeln.old.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            br.readLine();
            while ((zeile = br.readLine()) != null) {
                Vokabeln.vokabeln0.add(zeile);
            }
            br.close();
        }
    }
}