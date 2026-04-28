public class Partie {
    private Joueur joueur;
    private Quiz quiz;
    private int score;

    public Partie(Joueur joueur, Quiz quiz, int score) {
        this.joueur = joueur;
        this.quiz = quiz;
        this.score = score;

        System.out.println("partie : " + joueur  + " , score: " + score);
    }

}