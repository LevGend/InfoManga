package infomanga;

/* J'utilise une classe MaisonEdition et non pas une simple variable 
car je veux pouvoir voir tout les mangas d'une maison d'édition
ex: dans le main :

Glenat.afficher()

==> ***********************
==> Maison d'edition : Glénat
==> ++ OnePiece
==> Wanted
 */
public class MaisonEdition {

    /* Variables */
    String m_nom;

    /* Constructeur */
    public MaisonEdition(String m_nom) {
        this.m_nom = m_nom;
    }

    /* Methodes */
    public void afficher() {
        int n = 1;
        int total = 0;
        System.out.println("\n***********************");
        System.out.println("Maison d'edition : " + m_nom);
        for (int i = 0; i < Manga.m_toutLesMangas.size(); i++) // tant que i est inferieur au nombre de place utilisé dans l'ArrayList de tout les mangas
        {
            if (Manga.m_toutLesMangas.get(i).getM_maisonEdition() == this) {
                total++;  // test
            }
        }
        System.out.println("Nombe de mangas édités : " + total);
        for (int i = 0; i < Manga.m_toutLesMangas.size(); i++) // tant que i est inferieur au nombre de place utilisé dans l'ArrayList de tout les mangas
        {
            if (Manga.m_toutLesMangas.get(i).getM_maisonEdition() == this) {
                System.out.println((n++) + " > " + Manga.m_toutLesMangas.get(i).getM_titre());  // test
            }
        }
        System.out.println("***********************");
    }

    /* Getters & Setters */
    public String getvM_nom() {
        return m_nom;
    }

}
