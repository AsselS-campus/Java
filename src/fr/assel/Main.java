package fr.assel;


import java.util.Scanner;

public class Main {
    /*Main méthode*/
    public static void main(String[] args) {
        //обработка программы начинается с метода main(), который является обязательной частью каждой программы.
        /*déclaration et création de l'objet*/
        /*j'instancie l'objet menu puis j'appelle la méthode nouveauPerso dessus*/
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        /*Pour créer un objet Scanner et le connecter à l'objet System.in*/


        Personnage personnage = null;

        /*condition et boucle nous permettent d'afficher le menu et de choisir quoi faire, suivant ce que rentre l'utilisateur,
        on construit le perso, on l'affiche, on le modifie ou on quitte le jeu*/

        while (true) {
            /*Le code est exécuté tant que le booléen est vrai*/
            menu.afficher();
            int type_menu = scanner.nextInt();
            /*nextInt()-Récupère l'entrée en tant que int*/
            if (type_menu == 1) {
                personnage = menu.nouveau_personnage();
            } else if (type_menu == 2) {
                if (personnage != null) System.out.println(personnage);
                else System.err.println("Pas de personnage créé...");
            } else if (type_menu == 3) {
                if (personnage != null) {
                    personnage = menu.modifier_personnage(personnage);
                } else System.err.println("Pas de personnage créé...");
            } else if (type_menu == 4) {
                if (personnage != null) {
                    menu.demarrer_partie(personnage);
                } else System.err.println("Pas de personnage créé...");
            } else if (type_menu == 5) System.exit(0);
        }

        menu.display();
        /*jappelle methode display*/

    }
}
