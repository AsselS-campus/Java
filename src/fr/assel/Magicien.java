package fr.assel;

public class Magicien extends Personnage {
    private Sort sort;
    private Philtre philtre;

    public Magicien() {
        this("Magicien");

    }
    public Magicien(String name){
        this(name,2,5, new Sort(), new Philtre());
    }

    public Magicien(String name, int hp, int attack, Sort sort, Philtre philtre){
        super(name,hp,attack);
        this.sort=sort;
        this.philtre=philtre;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + this.getName() + '\'' +
                ", hp=" + this.getHp() +
                ", attack=" + this.getAttack() +
                ", sort=" + this.sort +
                ", philtre=" + this.philtre +
                '}';
    }
}
