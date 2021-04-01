package fr.assel.artefacts;

import fr.assel.Case;
import fr.assel.Game;
import fr.assel.JoueurMortException;
import fr.assel.characters.Guerrier;
import fr.assel.characters.Personnage;

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

    public int interaction(Personnage personnage, int position_personnage)throws JoueurMortException {
        if (personnage instanceof Guerrier) {
            //je vérifie si je ss bien guerrier et j'affecte l'arme à mon personnage;je caste ds le bon type
            System.out.println("Arme trouvée! +" + getForce());
            ((Guerrier) personnage).setArme(this);
            System.out.println("Personnage upgradé! " + personnage);
        }
        return position_personnage;
    }

    @Override
    public String toString() {
        return "Arme{" +
                "force=" + force +
                ", name='" + name + '\'' +
                '}';
    }
}
