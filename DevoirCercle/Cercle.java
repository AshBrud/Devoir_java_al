// Définition de la classe Cercle
public class Cercle {
    // Attributs non publics de type réels
    private double r; // rayon du cercle
    private double a; // abscisse du centre du cercle
    private double b; // ordonnée du centre du cercle

    // Constructeur qui permet d'initialiser les 3 attributs
    public Cercle(double r, double a, double b) {
        this.r = r;
        this.a = a;
        this.b = b;
    }

    // Accesseurs pour tous les attributs
    public double getR() {
        return r;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    // Méthode qui permet de calculer et afficher la surface du cercle
    public void surface() {
        double s = Math.PI * r * r; // surface = pi * rayon au carré
        System.out.println("* La surface du cercle est " + Math.floor(s));
    }

    // Méthode qui permet de calculer et afficher le périmètre du cercle
    public void perimetre() {
        double p = 2 * Math.PI * r; // périmètre = 2 * pi * rayon
        System.out.println("* Le périmètre du cercle est " + Math.floor(p));
    }

    // Méthode qui teste si un point P(x,y) du plan est à l'intérieur du cercle ou non
    public boolean appartient(double x, double y) {
        // distance entre le point P(x,y) et le centre du cercle C(a,b)
        double d = Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
        // le point P est à l'intérieur du cercle si sa distance au centre est inférieure au rayon
        return d < r;
    }

    // Méthode qui permet d'afficher un objet de la classe Cercle sous la forme Cercle [c=(a , b), r=r)]
    public void afficherCercle() {
        System.out.println("* Cercle [c=(" + a + " , " + b + "), r=" + r + ")");
    }
}
