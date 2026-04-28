public class Redacteur {
    private String nom;
    private String prenom;

    public Redacteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("redacteur : " + nom + " " + prenom);
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}