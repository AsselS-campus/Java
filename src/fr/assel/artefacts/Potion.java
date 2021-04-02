package fr.assel.artefacts;

import fr.assel.Case;
import fr.assel.JoueurMortException;
import fr.assel.characters.Personnage;
import fr.assel.Game;

public abstract class Potion extends Case {

    private int hp;
    private String name;

   public Potion(String name, int hp) {
       this.name=name;
       this.hp=hp;
   }

    public int getHp() {
        return hp;
    }


    public Potion(){}

    public int interaction(Personnage personnage, int position_personnage) throws JoueurMortException{
        System.out.println("Potion trouvée! +" + getHp());
        personnage.setPotion(this);
        System.out.println("Personnage upgradé! "+personnage);

        return position_personnage;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}
