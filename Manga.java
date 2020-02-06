package infomanga;

import java.util.ArrayList;
import java.util.Scanner;

public class Manga {

    /* Variables */
    MaisonEdition m_maisonEdition;
    String m_titre;
    String m_genre;
    Mangaka m_mangaka;
    int m_annee;

    static ArrayList<Manga> m_toutLesMangas = new ArrayList<Manga>();
    ArrayList m_Tome = new ArrayList<Tome>();

    /* Constructeur */
    public Manga(String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition) {
        ajouter();              // Ajouter l'objet crée à l'ArrayList m_toutLesMangas grâce à la fonction ajouter(Manga);
        m_mangaka.ajouterAListeArtiste(this);
        this.m_titre = m_titre;
        this.m_genre = m_genre;
        this.m_mangaka = m_mangaka;
        this.m_annee = m_annee;
        this.m_maisonEdition = m_maisonEdition;
        
    }

    /* Methodes */
    public void afficher() {
        System.out.println("********************");
        System.out.println("Titre : " + m_titre);
        System.out.println("Mangaka : " + m_mangaka);
        System.out.println("Année de parution : " + m_annee);
        System.out.println("Genre : " + m_genre);
        System.out.println("********************");
    }

    /* Ajouter un Manga à l'ArrayList de tout les mangas */
    public void ajouter() {      // ajouter le manga a la liste de tout les mangs(m_toutLesMangas)
        m_toutLesMangas.add(this);
    }

    /* Getters & Setters */
    public String getM_titre() {
        return m_titre;
    }

    public String getM_genre() {
        return m_genre;
    }

    public Mangaka getM_mangaka() {
        return m_mangaka;
    }

    public int getM_annee() {
        return m_annee;
    }

    public ArrayList getM_Tome() {
        return m_Tome;
    }

    public MaisonEdition getM_maisonEdition() {
        return m_maisonEdition;
    }

    public int getM_toutLesMangas() {
        return m_toutLesMangas.size();
    }
}
