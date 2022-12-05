import java.time.chrono.JapaneseEra;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client arthur = new Client("Arthur","arthur@gmail.com");
        Client maxime = new Client("Maxime", "maxime@gmail.com");
        Client william = new Client("William", "william@gmail.com");
        Client sofian = new Client("Sofian", "sofian@gmail.com");
        Client nathan = new Client("Nathan", "nathan@gmail.com");
        Client francois = new Client("Francois", "francois@gmail.com");
        Client jeremy = new Client("Jérémy", "jeremy@gmail.com");

        ArrayList<String> listeDeProduitDeBase = new ArrayList<>();
        listeDeProduitDeBase.add("Fromage");
        listeDeProduitDeBase.add("Poivron");
        listeDeProduitDeBase.add("Sopalin");
        listeDeProduitDeBase.add("Café");
        listeDeProduitDeBase.add("AirBus A380");
        listeDeProduitDeBase.add("Eau");
        listeDeProduitDeBase.add("Bonbon");
        listeDeProduitDeBase.add("Coussin");
        listeDeProduitDeBase.add("Play Station 6");

        Magasin magasin = new Magasin(listeDeProduitDeBase,new ArrayList<>());

        magasin.ajouterAbonnee(arthur);
        magasin.ajouterAbonnee(maxime);
        magasin.ajouterAbonnee(william);
        magasin.ajouterAbonnee(sofian);
        magasin.ajouterAbonnee(nathan);
        magasin.ajouterAbonnee(francois);
        magasin.ajouterAbonnee(jeremy);

        magasin.ajouterProduit("Mayonnaise");
        System.out.println();
        System.out.println();

        magasin.supprimerAbonnee(arthur);
        magasin.supprimerProduit("AirBus A380");
    }
}
