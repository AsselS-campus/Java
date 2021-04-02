package fr.assel.characters;

import fr.assel.Case;
import fr.assel.Game;
import fr.assel.JoueurMortException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ennemi extends Case {
    private Random rand = new Random();
    private int hp;
    private int attack;
    private String name;

    public Ennemi(String name, int hp, int attack) {
        this.hp=hp;
        this.attack=attack;
        this.name=name;
    }


    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp=hp;
    }

    public int getAttack() {
        return attack;
    }

    public Ennemi(){}
    public int interaction(Personnage personnage, int position_personnage)throws JoueurMortException{
        System.out.println("Rencontre d'ennemi!");
        System.out.println("Personnage: "+personnage);
        System.out.println("Ennemi: "+this);

        boolean personnage_enfuit=false;
        boolean ennemi_mort=false;
        int new_position_personnage = position_personnage;

        // combat tour par tour
        while(!personnage_enfuit && !ennemi_mort ) {
            System.out.println("Que faites vous?\n1. combattre\n2. fuir");
            try {
                Scanner scanner = new Scanner(System.in);
                int choix = scanner.nextInt();
                if (choix==1) {
                    System.out.println("Vous combattez!");

                    int force=0;
                    if (personnage.getTypeAttaque()!=null) {
                        force=personnage.getTypeAttaque().getForce();
                    }

                    int personnage_attack = personnage.getAttack()+force;
                    if (personnage_attack < getHp()) {
                        int hp=personnage.getHp();
                        if (personnage.getPotion()!=null) {
                            hp+=personnage.getPotion().getHp();
                        }
                        if(hp<=getAttack()) throw new JoueurMortException();
                        else {
                            // mise à jour des points de vie personnage et ennemi
                            personnage.setHp(hp - getAttack());
                            setHp(getHp() - personnage_attack);
                            System.out.println("Update Personnage: "+personnage);
                            System.out.println("Update Ennemi: "+this);
                        }
                    } else {
                        System.out.println("Combat gagné contre "+this+": ennemi mort");
                        ennemi_mort=true;
                    }
                } else if (choix==2) {
                    System.out.println("Vous prenez la fuite!");

                    Random rand = new Random();
                    int recule_nb_case =rand.nextInt(5) +1;
                    new_position_personnage=position_personnage-recule_nb_case;
                    if (new_position_personnage < 0) new_position_personnage = 0;

                    System.out.println("Vous vous retrouvez en position "+new_position_personnage);
                    personnage_enfuit=true;
                }
            }catch (InputMismatchException e) {
                System.err.println("Mauvais choix...");
            }
        }

        return new_position_personnage;
    }

    @Override
    public String toString() {
        return "Ennemi{" +
                "hp=" + hp +
                ", attack=" + attack +
                ", name='" + name + '\'' +
                '}';
    }
}
