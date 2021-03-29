package fr.assel.artefacts;

import fr.assel.Case;

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

    public Arme(){}
    public void interaction(){
        System.out.println("Arme trouvée!");

    }

    @Override
    public String toString() {
        return "Arme{" +
                "force=" + force +
                ", name='" + name + '\'' +
                '}';
    }
}
