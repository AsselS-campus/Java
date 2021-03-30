package fr.assel.artefacts;

public interface TypeAttaque {
    //les interfaces encapsulent la majeure partie des méthodes utilisables avec toutes les implémentations concrètes.
    //on utilise interface afin d'éviter héritage multiple
    //une interface n'est rien d'autre qu'une classe entièrement abstraite, elle est donc considérée comme tel.
    int getForce();
}
