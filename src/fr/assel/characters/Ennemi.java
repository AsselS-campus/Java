package fr.assel.characters;

import fr.assel.Case;
import fr.assel.Game;
import fr.assel.JoueurMortException;

public class Ennemi extends Case {

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

    public int getAttack() {
        return attack;
    }


    public void interaction(){
        System.out.println("Combat!");
        try {
            Game.fight(Game.personnage, this);
        } catch (JoueurMortException e) {
            e.printStackTrace();
        }
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
