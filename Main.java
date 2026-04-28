public class Main {
    public static void main(String[] args) {
        Redacteur r1 = new Redacteur("Levi", "Taofi");
        Quiz quiz = new Quiz("les capitales", Categorie.Geographie, r1);
        Question q1 = new Question("quelle est la capitale de la Chine ?");
        q1.ajouterReponse(new Reponse("Pekin", true, 'A'));
        q1.ajouterReponse(new Reponse("Hong-Kong", false, 'B'));
        q1.ajouterReponse(new Reponse("Shangai", false, 'C'));
        q1.ajouterReponse(new Reponse("Okinawa", false, 'D'));
        quiz.ajouterQuestion(q1);
        q1.afficherQuestion();
        Joueur j1 = new Joueur("Kyto", "Jean");
        Joueur j2 = new Joueur("Nabas", "Talae");
        Partie p1 = new Partie(j1, quiz, 1);
        Partie p2 = new Partie(j2, quiz, 0);
    }
}
 