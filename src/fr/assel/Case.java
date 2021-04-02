package fr.assel;

import fr.assel.characters.Personnage;

public abstract class Case {
public abstract int interaction(Personnage personnage,int position_personnage) throws JoueurMortException;
}
