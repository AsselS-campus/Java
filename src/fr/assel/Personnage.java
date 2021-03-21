package fr.assel;

public class Personnage {
    /*accès protégé. La variable n'est disponible qu'à l'intérieur d'une classe. Elle peut être donc visible pour les classes
     héritantes. Elle est aussi visible pour des classes non héritantes mais étant du même package.*/
    /*las variables protected sont utilisées ds la classe et ds la mère*/
    protected String name;
    protected int hp ;
    protected int attack;

    public  void set_name(String name) {
        this.name = name;
    }
    public  String get_name() {
        return this.name;
    }

    public  void set_hp(int hp) {
        this.hp = hp;
    }
    public  int get_hp() {
        return this.hp;
    }

    public  void set_attack(int attack) {
        this.attack = attack;
    }
    public  int get_attack() {
        return this.attack;
    }
}
