package ru.skypro;

public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int teleportation;

    public Hogwarts(String name, int powerOfMagic, int teleportation) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.teleportation = teleportation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTeleportation() {
        return teleportation;
    }

    public void setTeleportation(int teleportation) {
        this.teleportation = teleportation;
    }

    public int abilityHogwarts() {
        return powerOfMagic + teleportation;
    }

    public void printTo() {
        System.out.println(this);
    }

    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = abilityHogwarts();
        int ability2 = hogwarts.abilityHogwarts();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(),hogwarts.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше студента %s%n", hogwarts.getName(), getName());
        } else {
            System.out.printf("Студент %s лучше студента %s%n", hogwarts.getName(), getName());
        }
    }






}
