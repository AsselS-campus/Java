package fr.assel;

public class PersonnageHorsPlateauException extends Throwable {
    //Trowable classof all errors and exceptions in Java
    //Test le parent de l'exception
    public PersonnageHorsPlateauException() {
        super("fin de la partie: joueur en fin de plateau");

    }
}
