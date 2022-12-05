public class Boss {
    private String nom;
    private int attaque, pv;

    /* Constructeur privé */
    private Boss(String nom, int attaque, int pv) {
        this.nom = nom;
        this.attaque = attaque;
        this.pv = pv;
    }

    /* Instance unique pré-initialisée */
    private static Boss INSTANCE = new Boss("Boultapier, incarnation du chaos", 150, 10000);

    /* Point d'accès pour l'instance unique du singleton */
    public static Boss getInstance(){return INSTANCE;}

    public String getNom() {return nom;}
    public int getAttaque() {return attaque;}
    public int getPv() {return pv;}

    public void setNom(String nom) {this.nom = nom;}
    public void setAttaque(int attaque) {this.attaque = attaque;}
    public void setPv(int pv) {this.pv = pv;}

    @Override
    public String toString() {
        return "Boss{" +
                "nom='" + nom + '\'' +
                ", attaque=" + attaque +
                ", pv=" + pv +
                '}';
    }
}
