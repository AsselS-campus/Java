package fr.assel.characters;

import fr.assel.artefacts.TypeAttaque;
import fr.assel.artefacts.Potion;

/**
 * this is my abstract class Personnage
 */

public  abstract class Personnage {
    //klass personnage poslujit realizaciei metodov kotorye budut ispol'zovat'sya dlya guerrier i dlya magicien

    private String name;
    /**
     * *this are the attributs of Personnage
     */
    private int hp ;
    private int attack;
    private Potion potion=null;



    private TypeAttaque weapon;
    /**
     * *this is a constructor with parameters
     */
    public Personnage(String name, int hp, int attack ){

    //le but du constructeur-initialiser des variables de classe(privées ou protected)
    //il instancie l'objet
        this.hp = hp;
        this.attack = attack;
        this.name = name;

    }

    /**
     * This field will return potion
     * @return
     */
    public Potion getPotion() {
        return potion;
    }

    /**
     *
     * @param potion of type potion
     */
    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    /**
     * 
     * @param name
     */
    public  void setName(String name) {
        this.name = name;
    }
    public  String getName() {
        return this.name;
    }

    public  void setHp(int hp) {
        this.hp = hp;
    }
    public  int getHp() {
        return this.hp;
    }

    public  void setAttack(int attack) {
        this.attack = attack;
    }
    public  int getAttack() {
        return this.attack;
    }

    public abstract TypeAttaque getTypeAttaque();

    public TypeAttaque getWeapon() {
        return weapon;
    }

    public void setWeapon(TypeAttaque weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", potion=" + potion +
                ", typeAttaque=" + getTypeAttaque() +
                '}';
    }

}
