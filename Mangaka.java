package infomanga;

import java.util.ArrayList;

public class Mangaka {

    private String m_nom;
    private String m_prenom;
    private int m_age;

    protected ArrayList<Manga> m_manga_ecrit = new ArrayList<Manga>();

    public Mangaka(String m_nom, String m_prenom, int m_age) {
        this.m_nom = m_nom;
        this.m_prenom = m_prenom;
        this.m_age = m_age;

    }

    public void afficher() {
        System.out.println("****** - 漫画家 - ******");
        System.out.println("++ Prénom : " + m_prenom);
        System.out.println("++ Nom : " + m_nom);
        System.out.println("++ Age : " + m_age);
        System.out.println("***********************");

        afficherManga();

    }

    public void afficherManga() {
        System.out.println("\n****** - 漫画 - ******");
        for (int i = 0; i < m_manga_ecrit.size(); i++) 
        {
            System.out.print("++ ");
            System.out.println(m_manga_ecrit.get(i).getM_titre());
        }
        System.out.println("***********************");

    }

    public int getM_manga_ecrit() {
        return m_manga_ecrit.size();
    }
    
    
}