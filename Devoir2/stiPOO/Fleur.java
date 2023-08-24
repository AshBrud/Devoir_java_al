package stiPOO;

// Définition de la classe Fleur qui hérite de la classe Vegetal
public class Fleur extends Vegetal {
    // Attribut non public de type chaine
    private String couleur; // couleur des fleurs

    // Constructeur avec 5 arguments qui permet d'initialiser les champs hérités et propres
    public Fleur(String espece, String lieuVie, String type, int dureeVie, String couleur) {
        super(espece, lieuVie, type, dureeVie); // appel au constructeur de la classe mère Vegetal
        this.couleur = couleur;
    }

    // Accesseur public pour l'attribut propre
    public String getCouleur() {
        return couleur;
    }

    // Méthode qui affiche tous les attributs d'une Fleur
    public void afficherFleur() {
        super.afficherVegetal(); // appel à la méthode de la classe mère Vegetal
        System.out.println("* Couleur : " + couleur);
    }
}
