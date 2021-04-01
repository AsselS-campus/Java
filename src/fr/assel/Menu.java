package fr.assel;

import fr.assel.characters.Guerrier;
import fr.assel.characters.Magicien;
import fr.assel.characters.Personnage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void afficher() {
        System.out.println("\u001B[0mMenu");
        System.out.println("1. Nouveau personnage");
        System.out.println("2. Afficher personnage");
        System.out.println("3. Modifier personnage");
        System.out.println("4. Démarrer la partie");
        System.out.println("5. Quitter jeu");
    }

    public void display() {
        Personnage personnage = null;
        /*condition et boucle nous permettent d'afficher le menu et de choisir quoi faire, suivant ce que rentre l'utilisateur,
        on construit le perso, on l'affiche, on le modifie ou on quitte le jeu*/
        int type_menu=0;
        while (type_menu!=5) {
            this.afficher();
            try {
                Scanner scanner = new Scanner(System.in);
                /*Pour créer un objet Scanner et le connecter à l'objet System.in*/
                type_menu = scanner.nextInt();
                try{
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
                        Game game = new Game();
                        game.jouerUnTour(personnage);

                    } else System.err.println("Pas de personnage créé...");
                } else System.err.println("Mauvais choix...");
            } catch (PersonnageHorsPlateauException | JoueurMortException e) {
                System.err.println(e);
            }
        } catch (InputMismatchException e) {
                System.err.println("Mauvais choix...");
            }
        }
    }


    public Personnage modifierPersonnage(Personnage personnage) {
        /*modifierPersonnage renvoie une istance de personnage modifié donc on met personnage en type de retour*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le nom de votre personnage?");
        String name = scanner.next();
        personnage.setName(name);

        return personnage;
    }

    /**
     * je declare ma variable,apres j'affecte soit Magicien soit Guerrier
     */
    public Personnage nouveauPersonnage() {
        Scanner scanner = new Scanner(System.in);
        int type_personnage = 0;

        while (type_personnage < 1 || type_personnage > 2) {
            System.out.println("Quel type de personnage voulez vous?\n1. Magicien\n2. Guerrier");
            type_personnage = scanner.nextInt(); // TODO: gérer l'exception si on ne rentre pas un entier
        }

        Personnage personnage;
        if (type_personnage == 1) {
            //constructeur Magicien(ctrl+p-choix des constructeurs)
            personnage = new Magicien();
        } else {
            personnage = new Guerrier();
        }
        /*
         donc je crée mon perso et j'appelle la méthode modifiérPersonnage qui sert
         à la fois à la fin de créer un perso pr lui mettre un nom et à la fois
         si je l'appelle directement pr changer le nom(modifierPersonnage*/
        return modifierPersonnage(personnage);
    }
}
