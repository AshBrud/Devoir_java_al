public class Main {
    public static void main(String[] args) throws Exception {

        // Création d'un objet de la classe Cercle
        Cercle c = new Cercle(12, 5, 9);

        // Calcul et Affichage de la surface de c
        System.out.println("La Surface :");
        c.surface();
        System.out.println();

        // Calcul et Affichage du périmètre de c
        System.out.println("Le périmètre :");
        c.perimetre();
        System.out.println();

        // Vérifications de l'appartenance d'un point de coordonnée (10, 3)
        System.out.println("Appartenance :");
        if(c.appartient(10, 3)){
            System.out.println("* Le point (10, 3) appartient.");
        } else {
            System.out.println("* Le point (10, 3) n'appartient pas.");
        }

        // Vérifications de l'appartenance d'un point de coordonnée (30, 20))
        if(c.appartient(30, 20)){
            System.out.println("* Le point (30, 20) appartient.");
        } else {
            System.out.println("* Le point (30, 20) n'appartient pas.");
        }
        System.out.println();

        // Affichage du cercle c
        System.out.println("Affichage du Cercle :");
        c.afficherCercle();
        System.out.println();
    }
}
