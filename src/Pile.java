import java.util.ArrayList;

/**
 * Cette classe représente une structure de données de type Pile qui contient des chaînes de caracteres.
 */
public class Pile {

    private final ArrayList<String> listeDeString = new ArrayList<>();

    public Pile(ArrayList<String> listeDeString) {}
    public Pile(){}

    /**
     * Cette méthode vérifie si la pile est vide
     * @return response type boolean
     */
    public boolean estVide(){
        return listeDeString.isEmpty();
    }

    /**
     * Cette méthode retourne le nombre d'éléments contenus dans la pile
     * @return le nombre d'éléments
     */
    public int taille(){
        return listeDeString.size();
    }

    /**
     * Cette méthode retourne l'objet String au sommet de la pile
     * @return l'objet de type String
     */
    public String sommet(){
        int sommet = taille()-1;
        return listeDeString.get(sommet);
    }

    /**
     * Cette méthode ajoute "s" à la pile
     * @param s de type String
     */
    public void empiler(String s){
        listeDeString.add(s);
    }

    /**
     * Cette méthode retire le sommet de la pile et le retourne
     * @return le sommet de la pile
     */
    public String depiler(){
        String sommet = sommet();
        listeDeString.remove(sommet);
        return sommet;
    }



}
