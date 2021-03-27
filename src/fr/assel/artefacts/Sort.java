package fr.assel.artefacts;

import fr.assel.Case;

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

    @Override
    public String toString() {
        return "Sort{" +
                "force=" + force +
                ", name='" + name + '\'' +
                '}';
    }
}
