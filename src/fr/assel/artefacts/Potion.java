package fr.assel.artefacts;

import fr.assel.Case;

public abstract class Potion extends Case {

    private int hp;
    private String name;

   public Potion(String name, int hp) {
       this.name=name;
       this.hp=hp;
   }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}