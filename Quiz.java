import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String nom;
    private Categorie categorie;
    private Redacteur redacteur;
    private List<Question> questions = new ArrayList<>();

    public Quiz(String nom, Categorie categorie, Redacteur redacteur) {
        this.nom = nom;
        this.categorie = categorie;
        this.redacteur = redacteur;

        System.out.println("quiz : " + nom + " , catégorie : " + categorie);
    }

    public void ajouterQuestion(Question q) {
        questions.add(q);
    }

    @Override
    public String toString() {
        return "quiz: " + nom + " , " + categorie;
    }
}