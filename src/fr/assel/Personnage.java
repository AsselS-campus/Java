package fr.assel;

public class Personnage {
    /*accès protégé. La variable n'est disponible qu'à l'intérieur d'une classe. Elle peut être donc visible pour les classes
     héritantes. Elle est aussi visible pour des classes non héritantes mais étant du même package.*/
    /*las variables protected sont utilisées ds la classe et ds la mère*/
    protected String name;
    protected int hp ;
    protected int attack;

public Personnage(){

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
