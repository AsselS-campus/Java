package fr.assel;

public class Magicien extends Personnage {
    private Sort sort;
    private Philtre philtre;

    public Magicien() {
        this.hp = 2;
        this.attack = 5;
    }
    public Magicien(String name){
        this.hp = 2;
        this.attack = 5;

        this.name=name;
    }
    public Magicien(String name, int hp, int attack, Sort sort, Philtre philtre){
        this.name=name;
        this.hp=hp;
        this.attack=attack;
        this.sort=sort;
        this.philtre=philtre;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + this.name + '\'' +
                ", hp=" + this.hp +
                ", attack=" + this.attack +
                ", sort=" + this.sort +
                ", philtre=" + this.philtre +
                '}';
    }
}
