package fr.assel;

import fr.assel.artefacts.*;
import fr.assel.characters.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static int NB_ELEMENTS_PLATEAU = 64;
    private ArrayList<Case> plateau = new ArrayList<>(NB_ELEMENTS_PLATEAU);
    //la forme d'une ArrayList d'objets de type Case
    private int position_personnage = 0;

    public Game() {
        //on genere dynamiquement le plateau ac des entités alétoires
        Random rand = new Random();
        for(int i=0;i<NB_ELEMENTS_PLATEAU;i++) {
            Case current_case;

            int entity = rand.nextInt(10);
            switch (entity) {
                //on instancie le plateau de jeu en dur. C'est-à-dire rentrer les cases une à une avec leur position
                //Votre personnage devra donc se déplacer sur le plateau à chaque tour de jeu, et interagir avec les Cases via la méthode toString() de chacune d’entre elles
                case 0: current_case = new Dragon(); break;
                case 1: current_case = new Gobelin(); break;
                case 2: current_case = new Sorcier(); break;
                case 3: current_case = new Eclair(); break;
                case 4: current_case = new Epee(); break;
                case 5: current_case = new GrandePotion(); break;
                case 6: current_case = new Massue(); break;
                case 7: current_case = new StandardPotion(); break;
                case 8: current_case = new BouleDeFeu(); break;
                default: current_case = null;
            }

            plateau.add(current_case);
        }

        System.out.println("\u001B[35mPlateau géréné aléatoirement:");
        for(int i=0;i<NB_ELEMENTS_PLATEAU;i++) {
            System.out.println("| "+(i+1)+" | "+plateau.get(i)+" |");
        }
    }

    /*Plateau de Jeu et déplacement du joueur*/
    public void jouerUnTour(Personnage personnage) throws PersonnageHorsPlateauException, JoueurMortException {
        /*demarrerPartie c'est public car appelée par une classe tiers (main) et ça ne renvoit rien,donc VOID*/
        System.out.println("\u001B[33mNouveau jeu!");

        Random rand = new Random();
        int tour=0;
        while (position_personnage < plateau.size()) {
            //size() permet d'obtenir le nombre d'éléménts ds une liste
            tour++;
            //à chaque tour on lance le dés et on avance vers la case correspondante
            System.out.println("Tour: "+tour+": Position personnage: " + position_personnage);
            int des = rand.nextInt(6 - 1) + 1; // simulation des
            System.out.println("Jeté de dés: " + des);

            if (position_personnage + des <= plateau.size()) {
                // on choisit l'action à faire suivant l'instance que l'on trouve sur la case où on est allé
                /*Case current_case = plateau.get(position_personnage + des - 1);
                if (current_case instanceof Ennemi) {
                    System.out.println("Combat!");
                    fight(personnage, (Ennemi) current_case);
                } else if (current_case instanceof Arme && personnage instanceof Guerrier) {
                    //je vérifie si je ss bien guerrier et j'affecte l'arme à mon personnage;je caste ds le bon type
                    // Guerrier guerrier=(Guerrier) personnage;
                    // Arme arme=(Arme) current_case;
                    // guerrier.setArme(arme);
                    System.out.println("Arme trouvée! +" + ((Arme) current_case).getForce());
                    ((Guerrier) personnage).setArme((Arme) current_case);
                    System.out.println("Personnage upgradé! "+personnage);
                } else if (current_case instanceof Sort && personnage instanceof Magicien) {
                    System.out.println("Sort trouvée! +" + ((Sort) current_case).getForce());
                    ((Magicien) personnage).setSort((Sort) current_case);
                    System.out.println("Personnage upgradé! "+personnage);
                } else if (current_case instanceof Potion) {
                    System.out.println("Potion trouvée! +" + ((Potion) current_case).getHp());
                    personnage.setPotion((Potion) current_case);
                    System.out.println("Personnage upgradé! "+personnage);*/
                plateau.add(new BouleDeFeu());
                plateau.add(new Eclair());
                plateau.add(new Epee());
                plateau.add(new GrandePotion());
                plateau.add(new Massue());
                plateau.add(new StandardPotion());



                }

                position_personnage += des;
            } else throw new PersonnageHorsPlateauException();
        }

    }

    private void fight(Personnage personnage, Ennemi ennemi) throws JoueurMortException {
        System.out.println("Personnage: "+personnage);
        System.out.println("Ennemi: "+ennemi);

        int force=0;
        if (personnage.getTypeAttaque()!=null) {
            force=personnage.getTypeAttaque().getForce();
        }

        if (personnage.getAttack()+force < ennemi.getHp()) {
            int hp=personnage.getHp();
            if (personnage.getPotion()!=null) {
                hp+=personnage.getPotion().getHp();
            }
            if(hp<=ennemi.getAttack()) throw new JoueurMortException();
            else {
                System.out.println("Combat gagné contre "+ennemi+": ennemi enfuit");
            }
        } else {
            System.out.println("Combat gagné contre "+ennemi+": ennemi mort");
        }

    }
}
