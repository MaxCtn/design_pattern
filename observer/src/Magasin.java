import java.util.ArrayList;

public class Magasin {
    private ArrayList<String> listeProduit;
    private ArrayList<Client> abonnees;

    public Magasin(ArrayList<String> listeProduit, ArrayList<Client> abonnees) {
        this.listeProduit = listeProduit;
        this.abonnees = abonnees;
    }

    public void ajouterAbonnee(Client client){
        abonnees.add(client);
    }

    public void supprimerAbonnee(Client client){
        for (int i = 0; i < abonnees.size(); i++) {
            if(abonnees.get(i) == client)
                abonnees.remove(client);
        }
    }

    private void notifierAbonnees(String etat, String produit){
        for (int i = 0; i < abonnees.size(); i++) {
            System.out.println();
            System.out.println("Envoie d'un mail à " + abonnees.get(i).getNom() + " à l'adresse mail " + abonnees.get(i).getAdresseMail());
            System.out.println(etat + " du produit \" " + produit + " \".");
        }
    }

    public void ajouterProduit(String produit){
        listeProduit.add(produit);
        notifierAbonnees("Ajout",produit);
    }

    public void supprimerProduit(String produit){
        for (int i = 0; i < listeProduit.size(); i++) {
            if(listeProduit.get(i) == produit) {
                listeProduit.remove(produit);
                notifierAbonnees("Retrait",produit);
            }
        }
    }
}
