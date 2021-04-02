package fr.assel.artefacts;

import fr.assel.Case;
import fr.assel.JoueurMortException;
import fr.assel.characters.Magicien;
import fr.assel.characters.Personnage;
import fr.assel.Game;

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

    public Sort(){}

    public int interaction(Personnage personnage, int position_personnage)throws JoueurMortException {
        if (personnage instanceof Magicien) {
            System.out.println("Sort trouvée! +" + getForce());
            ((Magicien) personnage).setSort(this);
            System.out.println("Personnage upgradé! " + personnage);
        }
        return position_personnage;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "force=" + force +
                ", name='" + name + '\'' +
                '}';
    }
}
