public class Joueur {
    private String nom;
    private String prenom;

    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("joueur : " + nom + " " + prenom);
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}