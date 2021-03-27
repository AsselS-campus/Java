package fr.assel.characters;

import fr.assel.artefacts.TypeAttaque;
import fr.assel.artefacts.Sort;

public class Magicien extends Personnage {


    private Sort sort;

    public Magicien() {
        this("Magicien");

    }
    public Magicien(String name){
        this(name,5,5, null);
    }

    public Magicien(String name, int hp, int attack, Sort sort){
        super(name,hp, attack);
        this.sort=sort;

    }

    public Sort getSort() {
        return sort;
    }
    public TypeAttaque getTypeAttaque(){return this.sort;}
    public void setSort(Sort sort) {
        this.sort = sort;
    }


}
