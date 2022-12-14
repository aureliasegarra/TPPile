import java.io.*;
import java.util.ArrayList;

/**
 * Cette classe représente une structure de données de type Pile qui contient des chaînes de caracteres.
 */
public class Pile implements IPile, Serializable{

    private final long serialVersionUID = 1L;
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

    /**
     * Cette méthode permet d'écrire les données dans un fichier texte, en écrivant une donnée par ligne
     * @param fichier de type File
     */
    public void ecritureDonnees(String fichier){
        File unFichier = new File(fichier);
        // si le fichier existe déjà, les données seront écrasées par les nouvelles
        try {
            PrintWriter writer = new PrintWriter(unFichier);
            for (String line : listeDeString){
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cette méthode permet de lire les données depuis un fichier texte passé en paramètre.
     * On lira un élément par ligne.
     * @param fichier de type File
     */
    public ArrayList<String> lectureDonnees(String fichier){
        File unFichier = new File(fichier);

        try {
            BufferedReader tampon = new BufferedReader(new FileReader(unFichier));
            String line;

            while((line = tampon.readLine()) != null){
                empiler(line);
            }
            tampon.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listeDeString;
    }


    public void saveBinaire(String monFichier) {
        try {
            File file = new File(monFichier);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            this.ecritureDonnees("text2.txt");
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readBinaire(String monFichier){
        try {
            File file = new File(monFichier);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Pile pile = (Pile) objectInputStream.readObject();
            System.out.println(pile.toString());
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
