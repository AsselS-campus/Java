package fr.assel;

public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;
	/*Une classe « Guerrier » qui aura 3 constructeurs (sans paramètres, avec nom, et avec nom/image/niveau de vie/force d’attaque)*/

    //le but du constructeur-initialiser des variables de classe(privées ou protected)
    //il instancie l'objet

    public Guerrier(){
        this("Guerrier");
    }

    public Guerrier(String name) {
        this(name, 5,10, new Bouclier(), new Arme());
    }

    public Guerrier(String name, int hp, int attack ,Bouclier bouclier, Arme arme) {
        super(name, hp, attack);
        //Le mot clé super est utilisé afin d’appeler les méthodes de la classe parente appelé aussi suoperclass.
        this.arme=arme;
        this.bouclier=bouclier;
    }

    @Override
    public String toString() {
        /*renvoie une description de l’objet sous la forme d’une chaîne de caractères*/
        /*Elle est utile pendant la mise au point des programmes pour faire afficher l’état d’un objet*/
        return "Warrior{" +
                "name=" + this.getName() +
                ", hp=" + this.getHp() +
                ", attack=" + this.getAttack() +
                ", arme=" + this.arme +
                ", bouclier=" + this.bouclier +
                '}';
    }
}
