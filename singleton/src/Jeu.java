public class Jeu {
    public static void main(String[] args) {

        /*Première version du Singleton*/
        System.out.println("Première version du Singleton :");
        Boss Boultapier = Boss.getInstance();
        System.out.println("instance du boss Boultapier : " + Boultapier.toString());
        System.out.println();

        /*Seconde version du Singleton*/
        System.out.println("Seconde version du Singleton :");
        BossAlternatif Martanpion = BossAlternatif.getInstance("Martanpion, assaillant du vide",200,20000);
        BossAlternatif Cimagré = BossAlternatif.getInstance("Cimagré le désossé",0,1);
        System.out.println("boss Martanpion : " + Martanpion.toString());
        System.out.println("boss Cimagré : " + Cimagré.toString());
        System.out.println();

        /*Test : modification de la vie de Martanpion*/
        System.out.println("test : modification de la vie de Martanpion");
        Martanpion.setPv(Martanpion.getPv()-100);
        System.out.println("boss Martanpion : " + Martanpion.toString());
        System.out.println("boss Cimagré : " + Cimagré.toString());
        System.out.println();

        /*Test : modification de l'attaque de Cimagré*/
        System.out.println("test : modification de l'attaque de Cimagré");
        Cimagré.setAttaque(Cimagré.getAttaque()+50);
        System.out.println("boss Martanpion : " + Martanpion.toString());
        System.out.println("boss Cimagré : " + Cimagré.toString());
        System.out.println();
    }
}
