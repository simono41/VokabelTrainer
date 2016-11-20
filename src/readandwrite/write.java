/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import vokabeltrainer.GUI;

public class write {
    public void write() throws IOException {
        FileWriter fw = new FileWriter("./Vokabeln.txt");
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Vokabeln:");
            bw.newLine();
            for (String str : GUI.vokabeln0) {
                bw.write(str);
                bw.newLine();
            }
        }
    }
}

