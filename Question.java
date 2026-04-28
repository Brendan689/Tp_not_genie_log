import java.util.ArrayList;
import java.util.List;

public class Question {
    private String titre;
    private List<Reponse> reponses = new ArrayList<>();

    public Question(String titre) {
        this.titre = titre;
        System.out.println("question : " + titre);
    }

    public void ajouterReponse(Reponse r) {
        reponses.add(r);
    }

    public void afficherQuestion() {
        System.out.println("\nquestion : " + titre);

        for (Reponse r : reponses) {
            System.out.println(r);
        }
    }

    @Override
    public String toString() {
        return "question: " + titre + " , réponses: " + reponses;
    }
}