import stiPOO.*; // Importation de toutes les classes du package stiPOO

// Définition de la classe Test qui permet de tester les différentes classes
public class Main {
    
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