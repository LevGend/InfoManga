package infomanga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilisateur {

    private Manga manga;
    private String tabReader[];

    public void lire() throws IOException {
        int annee = 0, nbTome = 0;
        String titre = null, editeur = null, genre = null, auteur = null;

        try ( BufferedReader br = new BufferedReader(new FileReader("liste.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);

                for (int i = 0; i < 7; i++) {
                    tabReader[i] = line;
                }

                annee = Integer.parseInt(tabReader[4]);
                nbTome = Integer.parseInt(tabReader[5]);
                titre = tabReader[0];
                editeur = tabReader[1];
                genre = tabReader[2];
                auteur = tabReader[3];
            }
            manga(titre, editeur, genre, auteur, annee, nbTome);
            manga.afficher();
        }
    }

    private void manga(String titre, String editeur, String genre, String auteur, int annee, int nbTome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
