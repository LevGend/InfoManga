
package infomanga;

public class InfoManga {


    public static void main(String[] args) {
        Mangaka EiichiroOda = new Mangaka("Oda","Eiichiro",45);
        
        MaisonEdition Glenat = new MaisonEdition("Glénat");
        
        Manga OnePiece = new Manga("One Piece", "Shonen", EiichiroOda, 1997, Glenat);
        Manga Wanted = new Manga("Wanted", "Shonen", EiichiroOda, 1992, Glenat);
        
        EiichiroOda.m_manga_ecrit.add(Wanted);
        EiichiroOda.m_manga_ecrit.add(OnePiece);
        
        EiichiroOda.afficher();

    }
    
}
