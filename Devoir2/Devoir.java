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
        System.out.println("Espèce : " + espece);
    }

    private void afficherLieuVie() {
        System.out.println("Lieu de vie : " + lieuVie);
    }

    // Méthode non privée qui affiche tous les champs et qui utilise les méthodes privées
    public void afficherVivant() {
        afficherEspece();
        afficherLieuVie();
    }
}

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
        System.out.println("Type : " + type);
        System.out.println("Durée de vie : " + dureeVie + " ans");
    }
}

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
        System.out.println("Couleur : " + couleur);
    }
}

// Définition de la classe Test qui permet de tester les différentes classes
public class Test {
    
     public static void main(String []args){
        
         // Création d'un objet de la classe Vegetal avec 4 paramètres au constructeur
         Vegetal v = new Vegetal("végétal", "terre", "plante", 10);
         
         // Affichage des informations de l'objet v
         System.out.println("Informations sur le végétal :");
         v.afficherVegetal();
         System.out.println();
         
         // Création d'un objet de la classe Fleur avec 5 paramètres au constructeur
         Fleur f = new Fleur("végétal", "terre", "fleur", 5, "rouge");
         
         // Affichage des informations de l'objet f
         System.out.println("Informations sur la fleur :");
         f.afficherFleur();
     }
}
