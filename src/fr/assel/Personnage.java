package fr.assel;

public abstract class Personnage {
    /*accès protégé. La variable n'est disponible qu'à l'intérieur d'une classe. Elle peut être donc visible pour les classes
     héritantes. Elle est aussi visible pour des classes non héritantes mais étant du même package.*/
    /*las variables protected sont utilisées ds la classe et ds la mère*/
    private String name;
    private int hp ;
    private int attack;

public Personnage(String name, int hp, int attack ){
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
