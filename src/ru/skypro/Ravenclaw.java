package ru.skypro;

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int teleportation, int smart, int wit, int creativity) {
        super(name, powerOfMagic, teleportation);
        this.smart = smart;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int ability() {
        return smart + wit + creativity;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), ravenclaw.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше студента %s%n", ravenclaw.getName(), getName());
        } else {
            System.out.printf("Студент %s лучше студента %s%n", ravenclaw.getName(), getName());
        }
    }
}
