package infomanga;

import java.util.ArrayList;
import java.util.Scanner;

public class Manga {

    MaisonEdition m_maisonEdition;
    String m_titre;
    String m_genre;
    Mangaka m_mangaka;
    int m_annee;
    
    ArrayList m_Tome = new ArrayList<Tome>();
    
    Scanner sc = new Scanner(System.in);

    public Manga(String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition) {
        this.m_titre = m_titre;
        this.m_genre = m_genre;
        this.m_mangaka = m_mangaka;
        this.m_annee = m_annee;
        this.m_maisonEdition =  m_maisonEdition;
    }

    public void afficher(){
        System.out.println("********************");
        System.out.println("Titre : " + m_titre);
        System.out.println("Mangaka : " + m_mangaka);
        System.out.println("Année de parution : " + m_annee);
        System.out.println("Genre : " + m_genre);
        System.out.println("********************");
    }

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

    public Scanner getSc() {
        return sc;
    }
    
    
}
