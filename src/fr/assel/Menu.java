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
    /*Plateau de Jeu et déplacement du joueur*/
    public void démarrer_partie(Personnage personnage) {
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
    public Personnage modifier_personnage(Personnage personnage) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le nom de votre personnage?");
        String name = scanner.next();
        personnage.set_name(name);

        // TODO doit on demander hp et attack ? (pour le moment en dur ds les classes)

        return personnage;
    }

    public Personnage nouveau_personnage() {
        Scanner scanner = new Scanner(System.in);
        int type_personnage = 0;

        while (type_personnage < 1 || type_personnage > 2) {
            System.out.println("Quel type de personnage voulez vous?\n1. Magicien\n2. Guerrier");
            type_personnage = scanner.nextInt();
        }

        Personnage personnage = null;
        if (type_personnage == 1) {
            personnage = new Magicien();
        } else {
            personnage = new Guerrier();
        }

        return modifier_personnage(personnage);
    }
}

