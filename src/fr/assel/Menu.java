package fr.assel;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public void afficher() {
        System.out.println("Menu");
        System.out.println("1. Nouveau personnage");
        System.out.println("2. Afficher personnage");
        System.out.println("3. Modifier personnage");
        System.out.println("4. Démarrer la partie");
        System.out.println("5. Quitter jeu");
    }
    public void display(){
        Scanner scanner = new Scanner(System.in);
        /*Pour créer un objet Scanner et le connecter à l'objet System.in*/

        Personnage personnage = null;

        /*condition et boucle nous permettent d'afficher le menu et de choisir quoi faire, suivant ce que rentre l'utilisateur,
        on construit le perso, on l'affiche, on le modifie ou on quitte le jeu*/
        int type_menu=0;
        while (type_menu!=5) {
            this.afficher();
            type_menu = scanner.nextInt();
            //Récupère l'entrée en tant que int
            if (type_menu == 1) {
                personnage = this.nouveauPersonnage();
            } else if (type_menu == 2) {
                if (personnage != null) System.out.println(personnage);
                else System.err.println("Pas de personnage créé...");
            } else if (type_menu == 3) {
                if (personnage != null) {
                    personnage = this.modifierPersonnage(personnage);
                } else System.err.println("Pas de personnage créé...");
            } else if (type_menu == 4) {
                if (personnage != null) {
                    this.demarrerPartie(personnage);
                } else System.err.println("Pas de personnage créé...");
            }
        }
    }

public class PersonnageHorsPlateauException extends Exception{

}
    /*Plateau de Jeu et déplacement du joueur*/
    public void demarrerPartie(Personnage personnage) {
        /*demarrerPartie c'est public car appelée par une classe tiers (main) et ça ne renvoit rien,donc VOID*/
        int[] plateau = new int[64];
        int position_personnage = 0;

        Random rand = new Random();

        while (position_personnage < plateau.length) {
            System.out.println("Position personnage: " + position_personnage);
            int des = rand.nextInt(6 - 1) + 1;
            System.out.println("jeté de dés: " + des);
            if (position_personnage + des <= plateau.length) position_personnage += des;

        }
        System.out.println("Personnage au bout du plateau en position " + position_personnage);
    }
    /*méthode*/
    public Personnage modifierPersonnage(Personnage personnage) {
        /*modifierPersonnage renvoie une istance de personnage modifié donc on met personnage en type de retour*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le nom de votre personnage?");
        String name = scanner.next();
        personnage.setName(name);

        return personnage;
    }

    public Personnage nouveauPersonnage() {
        Scanner scanner = new Scanner(System.in);
        int type_personnage = 0;

        while (type_personnage < 1 || type_personnage > 2) {
            System.out.println("Quel type de personnage voulez vous?\n1. Magicien\n2. Guerrier");
            type_personnage = scanner.nextInt();
        }

        Personnage personnage = null;
        //je déclare ma variable,après j'affecte soit Magicien soit Guerrier
        if (type_personnage == 1) {
            //constructeur Magicien(ctrl+p-choix des constructeurs
            personnage = new Magicien();
        } else {
            personnage = new Guerrier("name", 5, 10,new Bouclier(), new Arme());
        }
        /*donc je crée mon perso et j'appelle la méthode modifiérPerso qui sert à la fois à la fin de créer un perso pr lui mettre un nom et à la fois
         * si je l'appelle directement pr changer le nom(modifierPersonnage*/
        return modifierPersonnage(personnage);
    }
}
