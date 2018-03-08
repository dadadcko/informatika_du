/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get_right;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Dano
 * There is no need of creating JavaDoc for this program as it's not so complex 
 * Only method used is main.
 * Debug console shows no possible error
 * MalformedURLException throws exceptions with bad URLs
 * 
 */
public class GeT_RighT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        BufferedReader br = null;

        try {

            URL url = new URL("http://www.dneperska.sk");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {            
                      System.out.println(line);             //First option with using only String       ( more simple)
               // sb.append(line);                          //Second option using StringBuilder - Similar to variable-length arrays 
               // sb.append(System.lineSeparator());        // EN: 2. version is allocated in brackets, but it is completely opperative and correct though !
                                                            // SK: 2. verzia je v komentoch, je ale kompletne správna a použiteľná though !
            }

            // System.out.println(sb);
        } finally {

            if (br != null) {
                br.close();
            }
        }
    }           
}
