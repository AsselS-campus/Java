package fr.assel.artefacts;

import fr.assel.Case;
import fr.assel.Game;

public abstract class Arme extends Case implements TypeAttaque {

    private int force;
    private String name;

    public Arme(String name,  int force) {
        this.force =force;
        this.name=name;
    }

    public int getForce() {
        return this.force;
    }


    public void interaction(){
        System.out.println("Arme trouvée!");
        Game.personnage.setWeapon(this);
    }

    @Override
    public String toString() {
        return "Arme{" +
                "force=" + force +
                ", name='" + name + '\'' +
                '}';
    }
}
