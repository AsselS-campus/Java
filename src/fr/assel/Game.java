package fr.assel;

import fr.assel.artefacts.*;
import fr.assel.characters.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static int NB_ELEMENTS_PLATEAU = 64;
    private ArrayList<Case> plateau = new ArrayList<>(NB_ELEMENTS_PLATEAU);
    private int position_personnage = 0;
    private Random rand = new Random();

    /**
     on genere dynamiquement le plateau avec des entites aleatoires
     */
    public Game() {
        Random rand = new Random();
        for (int i = 0; i < NB_ELEMENTS_PLATEAU; i++) {
            Case current_case;
            int entity = rand.nextInt(10);
            switch (entity) {
                case 0:
                    current_case = new Dragon();
                    break;
                case 1:
                    current_case = new Gobelin();
                    break;
                case 2:
                    current_case = new Sorcier();
                    break;
                case 3:
                    current_case = new Eclair();
                    break;
                case 4:
                    current_case = new Epee();
                    break;
                case 5:
                    current_case = new GrandePotion();
                    break;
                case 6:
                    current_case = new Massue();
                    break;
                case 7:
                    current_case = new StandardPotion();
                    break;
                case 8:
                    current_case = new BouleDeFeu();
                    break;
                default:
                    current_case = null;
            }

            plateau.add(current_case);
        }

        System.out.println("\u001B[35mPlateau géréné aléatoirement:");
        for (int i = 0; i < NB_ELEMENTS_PLATEAU; i++) {
            System.out.println("| " + (i + 1) + " | " + plateau.get(i) + " |");
        }
    }

    /**
     * Nouveau jeu commence ici
     */
    public void jouerUnTour(Personnage personnage) throws PersonnageHorsPlateauException, JoueurMortException {
        System.out.println("\u001B[33mNouveau jeu!");
        Random rand = new Random();
        int tour = 0;

        // size() permet d'obtenir le nombre d'éléments dans une liste

        while (position_personnage < plateau.size()) {
            tour++;
            //à chaque tour on lance le dés et on avance vers la case correspondante
            System.out.println("Tour: " + tour + ": Position personnage: " + position_personnage);
            int des = rand.nextInt(5) + 1; // simulation des
            System.out.println("Jeté de dés: " + des);

            if (position_personnage + des <= plateau.size()) {
                //on choisit l'action à faire suivant l'instance que l'on trouve sur la case ou on est allé
                position_personnage += des;
                Case current_case = plateau.get(position_personnage - 1);
                if (current_case != null)
                {
                    int new_position_personnage=current_case.interaction(personnage, position_personnage);
                    if (new_position_personnage!=position_personnage) {
                        position_personnage = new_position_personnage;
                        System.out.println("Nouvelle position personnage: "+position_personnage);
                    }
                }
                else System.out.println("Case vide...");

            } else throw new PersonnageHorsPlateauException();
        }

    }

}


