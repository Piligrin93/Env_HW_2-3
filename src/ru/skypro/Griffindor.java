package ru.skypro;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int powerOfMagic, int teleportation, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compareGriffindor(Griffindor griffindor) {
        int ability1 = ability();
        int ability2 = griffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), griffindor.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше студента %s%n", griffindor.getName(), getName());
        } else {
            System.out.printf("Студент %s лучше студента %s%n", griffindor.getName(), getName());
        }
    }
}
