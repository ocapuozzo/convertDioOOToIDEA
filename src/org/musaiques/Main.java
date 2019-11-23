package org.musaiques;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  /**
   * convertir un dico https://github.com/LibreOffice/dictionaries/blob/master/fr_FR/fr.dic
   * en un dico accepté par intellij
   *  séquence/S. donne
   *    séquence
   *    séquences
   *  idem avec les x
   *  TODO voir les apstrophes et autres
   *
   *  Exemple usage : java -jar convertDicoOOToIDEA.jar /home/kpu/Documents/dico/fr-oo.dic > newfr.dic
   *  puis add dictionnaire dans l'ide :  https://www.jetbrains.com/help/idea/spellchecking.html
   *
   *  fait à l'arrache le 23 novembre
    * @param args
   */

    public static void main(String[] args) {
	    String fileName = (args.length == 1) ? args[0] : "";
      try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        int row = 0;
        String line;
        while ((line = br.readLine()) != null) {
          int pos = line.indexOf('/');
          if (pos > 1) {
            String world = line.substring(0, pos);
            System.out.println(world);
            String alt = line.substring(pos+1);
            if (alt.charAt(0) == 'S') {
              System.out.println(world+"s");
            }else if(alt.charAt(0) == 'X') {
              System.out.println(world+"x");
            }
          } else {
            System.out.println(line);
          }
        //  if (++row == 316) break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
}
