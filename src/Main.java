import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile();
        pile.empiler("tomate");
        pile.empiler("poivron");
        pile.empiler("cornichon");
        pile.empiler("fraise");

        pile.ecritureDonnees("text1.txt");

        ArrayList<String> maListe = pile.lectureDonnees("text1.txt");
        for (String line : maListe){
            System.out.println(line);
        }

        //System.out.println(maListe);

        pile.saveBinaire("text2.txt");


    }
}
