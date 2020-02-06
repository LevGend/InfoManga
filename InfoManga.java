package infomanga;

public class InfoManga {

    public static void main(String[] args) {

        Mangaka EiichiroOda = new Mangaka("Oda", "Eiichiro", 45); // Création d'un Mangaka (String m_nom, String m_prenom, int m_age)
        Mangaka Toriyama = new Mangaka("Akira", "Toriyama", 64);

        MaisonEdition Glenat = new MaisonEdition("Glénat"); // Création d'une maison d'édition (String m_nom)
        MaisonEdition Shueisha = new MaisonEdition("Shueisha"); // Création d'une maison d'édition (String m_nom)

        Manga OnePiece = new Manga("One Piece", "Shonen", EiichiroOda, 1997, Glenat); // Création d'un manga (String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition)
        Manga Wanted = new Manga("Wanted", "Shonen", EiichiroOda, 1992, Glenat);    // Création d'un manga (String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition)
        Manga DragonBall = new Manga("Dragon Ball", "Shonen", Toriyama, 1984, Shueisha);    // Création d'un manga (String m_titre, String m_genre, Mangaka m_mangaka, int m_annee, MaisonEdition m_maisonEdition)

        DragonBall.afficher();
//        Glenat.afficher(); // Appel de la fonction Afficher sur une Maison d'édition
//        EiichiroOda.afficher();
//        EiichiroOda.afficherManga();
        Toriyama.afficherManga();



    }

}
