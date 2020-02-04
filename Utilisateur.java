package infomanga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilisateur {

    private Manga manga;

    public void comparer(Manga M) throws IOException {
        String file;
        BufferedReader br = new BufferedReader(new FileReader(liste));
        String line;
        while ((line = br.readLine()) != null) {
            // process the line.
            
        }
        br.close();
    }

}
