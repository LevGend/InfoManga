package infomanga;

public class InfoManga {


    public static void main(String[] args) {
        Mangaka EiichiroOda = new Mangaka("Oda","Eiichiro",45); // Création d'un Mangaka (String m_nom, String m_prenom, int m_age)
        
        MaisonEdition Glenat = new MaisonEdition("Glénat"); // Création d'une maison d'édition (String m_nom)
        
        Manga OnePiece = new Manga("One Piece", "Shonen", EiichiroOda, 1997, Glenat); // Création d'un manga (String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition)
        Manga Wanted = new Manga("Wanted", "Shonen", EiichiroOda, 1992, Glenat);    // Création d'un manga (String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition)
        
        // Glenat.afficher(); // Appel de la fonction Afficher sur une Maison d'édition
        
        EiichiroOda.afficher();

    }
    
}
