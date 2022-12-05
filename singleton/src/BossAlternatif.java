public class BossAlternatif {
    private static BossAlternatif instance;
    private String nom;
    private int attaque, pv;

    private BossAlternatif(String nom, int attaque, int pv){
        this.nom = nom;
        this.attaque = attaque;
        this.pv = pv;
    }

    public static BossAlternatif getInstance(String nom, int attaque, int pv){
        if (instance == null)
            instance = new BossAlternatif(nom, attaque, pv);
        return instance;
    }

    public String getNom() {return nom;}
    public int getAttaque() {return attaque;}
    public int getPv() {return pv;}

    public void setNom(String nom) {this.nom = nom;}
    public void setAttaque(int attaque) {this.attaque = attaque;}
    public void setPv(int pv) {this.pv = pv;}

    @Override
    public String toString() {
        return "BossAlternatif{" +
                "nom='" + nom + '\'' +
                ", attaque=" + attaque +
                ", pv=" + pv +
                '}';
    }
}
