package fr.assel.characters;

import fr.assel.artefacts.Arme;
import fr.assel.artefacts.TypeAttaque;

public class Guerrier extends Personnage {
    private Arme arme;

	/*Une classe « Guerrier » qui aura 3 constructeurs (sans paramètres, avec nom, et avec nom/image/niveau de vie/force d’attaque)*/

    //le but du constructeur-initialiser des attributs de classe(privées ou protected)
    //il instancie l'objet

    public Guerrier(){
        this("Guerrier");
    }

    public Guerrier(String name) {
        this(name, 5,7, null);}

    public Guerrier(String name, int hp, int attack ,Arme arme) {
        super(name, hp, attack);
        this.arme=arme;
        //Le mot clé super est utilisé afin d’appeler les méthodes de la classe parente appelé aussi suoperclass.


    }

    public  void setArme(Arme arme) {
        this.arme = arme;
    }
    public  Arme getArme() {
        return this.arme;
    }
    public TypeAttaque getTypeAttaque(){return this.arme;}


}
