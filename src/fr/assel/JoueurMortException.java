package fr.assel;

public class JoueurMortException extends Throwable {
    //Trowable classof all errors and exceptions in Java
    //Test le parent de l'exception
    public JoueurMortException() {
        super("fin de la partie: joueur mort");

    }
}
