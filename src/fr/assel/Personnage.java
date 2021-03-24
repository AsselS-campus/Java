package fr.assel;

public  abstract class Personnage {
    //klass personnage poslujit realizaciei metodov kotorye budut ispol'zovat'sya dlya guerrier i dlya magicien
    private String name;
    private int hp ;
    private int attack;

public Personnage(String name, int hp, int attack ){
    //le but du constructeur-initialiser des variables de classe(privées ou protected)
    //il instancie l'objet
    this.hp = hp;
    this.attack = attack;
    this.name = name;
}


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
}
