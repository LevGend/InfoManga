package infomanga;

public class Manga {

    private String titre, editeur, genre, auteur;
    private int annee, nbTome;
    
    public Manga (){}

    public Manga(String t, String e, String g, String a, int an, int nb) {
        titre = t;
        editeur = e;
        genre = g;
        auteur = a;
        annee = an;
        nbTome = nb;
    }

    public void afficher() {
        System.out.println("info globale:\n" + titre + "\n" + editeur + "\n" + genre + "\n" + auteur + "\n" + annee + "\n" + nbTome);
    }

    //accesseur
    public String getTitre() {
        return titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public int getNbTome() {
        return nbTome;
    }

}