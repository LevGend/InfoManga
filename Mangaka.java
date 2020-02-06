package infomanga;

import java.util.ArrayList;

public class Mangaka {

    private String m_nom;
    private String m_prenom;
    private int m_age;

    protected ArrayList<Manga> m_manga_ecrit = new ArrayList<Manga>();

    /* Constructeur */
    public Mangaka(String m_nom, String m_prenom, int m_age) {
        this.m_nom = m_nom;
        this.m_prenom = m_prenom;
        this.m_age = m_age;

    }

    /* Methodes */
    public void afficher() {        // afficher les détails d'un mangaka
        System.out.println("\n****** - 漫画家 - ******"); // 漫画家 = mangaka
        System.out.println("++ Prénom : " + m_prenom);
        System.out.println("++ Nom : " + m_nom);
        System.out.println("++ Age : " + m_age);
        System.out.println("*********************");

        afficherManga();
    }

    public void afficherManga() {   // Afficher les details de touts les mangas écrits par un mangaka
        System.out.println("\n****** - 漫画 - ******"); // 漫画 = manga
        System.out.println("Bibliographie de " + m_prenom + " " + m_nom + " : ");
        for (int i = 0; i < m_manga_ecrit.size(); i++) {
            {
                System.out.println("++ " + m_manga_ecrit.get(i).getM_titre());
            }
        }
        System.out.println("*********************");
    }

    // Getters & Setters 
    public int getM_manga_ecrit() {
        return m_manga_ecrit.size();
    }

    public void ajouterAListeArtiste(Manga e) {
        m_manga_ecrit.add(e);
    }
}
