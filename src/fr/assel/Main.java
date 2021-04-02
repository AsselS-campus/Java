package fr.assel;


import fr.assel.characters.Ennemi;

import java.util.Scanner;

public class Main {
    /*Main méthode*/
    public static void main(String[] args) {
        BDD.dbConnect();
        BDD bdd=new BDD();
        bdd.saveCharacter();

        Menu menu = new Menu();
        menu.display();
        /*déclaration et création de l'objet*/
        /*j'instancie l'objet menu puis j'appelle la méthode nouveauPersonnage dessus*/
    }
 }

