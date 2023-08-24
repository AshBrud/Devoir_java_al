// Création d'un package qui s'appelle stiPOO
package stiPOO;

// Définition de la classe Vivant
public class Vivant {
    // Attributs non publics de type chaine de caractères
    private String espece; // espèce du vivant, comme végétal, animal, etc.
    private String lieuVie; // lieu de vie du vivant, comme terre, marin, etc.

    // Constructeur qui permet d'initialiser tous les attributs
    public Vivant(String espece, String lieuVie) {
        this.espece = espece;
        this.lieuVie = lieuVie;
    }

    // Accesseurs publics pour tous les attributs
    public String getEspece() {
        return espece;
    }

    public String getLieuVie() {
        return lieuVie;
    }

    // Méthodes privées qui permettent d'afficher les valeurs des attributs
    private void afficherEspece() {
        System.out.println("* Espèce : " + espece);
    }

    private void afficherLieuVie() {
        System.out.println("* Lieu de vie : " + lieuVie);
    }

    // Méthode non privée qui affiche tous les champs et qui utilise les méthodes privées
    public void afficherVivant() {
        afficherEspece();
        afficherLieuVie();
    }
}

