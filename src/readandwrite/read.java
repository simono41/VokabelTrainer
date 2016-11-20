/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import vokabeltrainer.GUI;

public class read {
    public void read() throws FileNotFoundException, IOException {
        String zeile;
        FileReader fr = new FileReader("./Vokabeln.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            br.readLine();
            while ((zeile = br.readLine()) != null) {
                GUI.vokabeln0.add(zeile);
            }
        }
    }
}

