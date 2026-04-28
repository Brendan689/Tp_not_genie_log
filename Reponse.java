public class Reponse {
    private String texte;
    private boolean bonneReponse;
    private char position;

    public Reponse(String texte, boolean bonneReponse, char position) {
        this.texte = texte;
        this.bonneReponse = bonneReponse;
        this.position = position;

        System.out.println("réponse : " + position + " - " + texte);
    }

    @Override
    public String toString() {
        return position + ") " + texte + (bonneReponse ? " (VRAI)" : "");
    }
}