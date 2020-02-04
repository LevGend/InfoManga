package infomanga;

public class Manga {
    
    private String titre, editeur, genre, auteur;
    private int annee, nbTome;

    public Manga() {}

    
    public void afficher(){
      System.out.println("info globale:\n"+titre+"\n"+editeur+"\n"+genre+"\n"+auteur+"\n"+annee+"\n"+nbTome);
    }
    
    //accesseur
    public String getTitre(){return titre;}
    
    public String getEditeur(){return editeur;}
    
    public String getGenre(){return genre;}
    
    public String getAuteur(){return auteur;}
    
    public int getAnnee(){return annee;}
    
    public int getNbTome(){return nbTome;}
    
    
    

       
}
