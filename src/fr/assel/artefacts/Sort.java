package fr.assel.artefacts;

import fr.assel.Case;
import fr.assel.Game;

public abstract class Sort extends Case implements TypeAttaque {

    private int force;
    private String name;

    public Sort(String name, int force) {
        this.name=name;
        this.force =force;
    }


    public int getForce() {
        return this.force;
    }



    public void interaction(){
        System.out.println("Sort trouvé!");
        Game.personnage.setWeapon(this);
    }

    @Override
    public String toString() {
        return "Sort{" +
                "force=" + force +
                ", name='" + name + '\'' +
                '}';
    }
}
