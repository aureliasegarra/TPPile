public class PileTest extends Pile{

    public static void main(String[] args) {
        testEstVide();
        testSommet();
        testDepiler();
        testTaille();
    }

    public static void testEstVide(){
        System.out.println("*** TEST METHODE estVide() ***");
        Pile pile = new Pile();

        System.out.println("--- Test cas normal ---");
        if (pile.estVide()){
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }

        System.out.println("--- Test cas d'erreur ---");
        pile.empiler("pomme");
        pile.empiler("poire");
        pile.empiler("banane");

        if (!pile.estVide()){
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }
    }

    public static void testSommet(){
        System.out.println("*** TEST METHODE sommet() ***");
        Pile pile = new Pile();
        pile.empiler("poivron");
        pile.empiler("tomate");
        pile.empiler("courgette");

        System.out.println("--- Test cas normal ---");
        if (pile.sommet().equals("courgette")){
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }

        System.out.println("--- Test cas d'erreur ---");
        if (!pile.sommet().equals("tomate")){
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }
    }

    public static void testDepiler(){
        System.out.println("*** TEST METHODE depiler() ***");
        Pile pile = new Pile();

        pile.empiler("poivron");
        pile.empiler("tomate");
        pile.empiler("courgette");

        pile.depiler();

        System.out.println("--- Test cas normal ---");
        if (pile.taille()==2 && pile.sommet().equals("tomate")){
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }

        System.out.println("--- Test cas d'erreur ---");
        if (pile.taille()!=3 && !pile.sommet().equals("poivron")){
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }



    }

    public static void testTaille(){
        System.out.println("*** TEST METHODE taille() ***");
        Pile pile = new Pile();

        pile.empiler("poivron");
        pile.empiler("tomate");
        pile.empiler("courgette");

        System.out.println("--- Test cas normal ---");
        if(pile.taille()==3){
            System.out.println("Test OK");
        }
        else{
            System.out.println("Test KO");
        }

        System.out.println("--- Test cas d'erreur ---");
        if(pile.taille()!=2){
            System.out.println("Test OK");
        }
        else{
            System.out.println("Test KO");
        }
    }
}
