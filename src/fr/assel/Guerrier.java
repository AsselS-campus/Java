package fr.assel;

public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;
	/*Une classe « Guerrier » qui aura 3 constructeurs (sans paramètres, avec nom, et avec nom/image/niveau de vie/force d’attaque)*/
    /*le but du constructeur-initialiser des variables de classe(privées ou protected)*/

    public Guerrier(){
        this("Guerrier");
    }

    public Guerrier(String name) {
        this(name, 5,10, new Bouclier(), new Arme());
    }

    public Guerrier(String name, int hp, int attack ,Bouclier bouclier, Arme arme) {
        super(name, hp, attack);
        this.arme=arme;
        this.bouclier=bouclier;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name=" + this.getName() +
                ", hp=" + this.getHp() +
                ", attack=" + this.getAttack() +
                ", arme=" + this.arme +
                ", bouclier=" + this.bouclier +
                '}';
    }
}
