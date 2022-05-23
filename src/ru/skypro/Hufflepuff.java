package ru.skypro;

public class Hufflepuff extends Hogwarts{
    private int industriosness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int teleportation, int industriosness, int loyalty, int honesty) {
        super(name, powerOfMagic, teleportation);
        this.industriosness = industriosness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriosness() {
        return industriosness;
    }

    public void setIndustriosness(int industriosness) {
        this.industriosness = industriosness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return industriosness + loyalty + honesty;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), hufflepuff.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше студента %s%n", hufflepuff.getName(), getName());
        } else {
            System.out.printf("Студент %s лучше студента %s%n", hufflepuff.getName(), getName());
        }
    }
}
