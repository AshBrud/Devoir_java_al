package stiPOO;

// Définition de la classe Vegetal qui hérite de la classe Vivant
public class Vegetal extends Vivant {
    // Attributs non publics de type chaine et entier
    private String type; // type du végétal, comme plante, arbre, fleur, etc.
    private int dureeVie; // durée de vie du végétal en années

    // Constructeur avec 4 arguments qui permet d'initialiser les champs hérités et propres
    public Vegetal(String espece, String lieuVie, String type, int dureeVie) {
        super(espece, lieuVie); // appel au constructeur de la classe mère Vivant
        this.type = type;
        this.dureeVie = dureeVie;
    }

    // Accesseurs publics pour les attributs propres
    public String getType() {
        return type;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    // Méthode qui affiche tous les champs décrivant un végétal, y compris son espèce et son lieu de vie
    public void afficherVegetal() {
        super.afficherVivant(); // appel à la méthode de la classe mère Vivant
        System.out.println("* Type : " + type);
        System.out.println("* Durée de vie : " + dureeVie + " ans");
    }
}