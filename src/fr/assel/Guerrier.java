package fr.assel;

public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;
	/*Une classe « Guerrier » qui aura 3 constructeurs (sans paramètres, avec nom, et avec nom/image/niveau de vie/force d’attaque)*/
    /*le but du constructeur-initialiser des variables de classe(privées ou protected)*/
    public Guerrier(){
        this.hp = 5;
        this.attack = 10;

    }
    public Guerrier(String name) {
        this.hp = 5;
        this.attack = 10;

        this.name=name;
    }
    public Guerrier(String name, int hp, int attack, Bouclier bouclier, Arme arme) {
        this.name=name;
        this.hp=hp;
        this.attack=attack;
        this.arme=arme;
        this.bouclier=bouclier;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name=" + this.name +
                ", hp=" + this.hp +
                ", attack=" + this.attack +
                ", arme=" + this.arme +
                ", bouclier=" + this.bouclier +
                '}';
    }
}
