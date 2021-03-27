package fr.assel.characters;

import fr.assel.Case;

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

    @Override
    public String toString() {
        return "Ennemi{" +
                "hp=" + hp +
                ", attack=" + attack +
                ", name='" + name + '\'' +
                '}';
    }
}
