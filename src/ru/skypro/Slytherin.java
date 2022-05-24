package ru.skypro;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int ovebearing;

    public Slytherin(String name, int powerOfMagic, int teleportation, int trick, int determination, int ambition, int resourcefulness, int ovebearing) {
        super(name, powerOfMagic, teleportation);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.ovebearing = ovebearing;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getOvebearing() {
        return ovebearing;
    }

    public void setOvebearing(int ovebearing) {
        this.ovebearing = ovebearing;
    }

    public int ability() {
        return trick + determination + ambition + resourcefulness + ovebearing;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), slytherin.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше студента %s%n", slytherin.getName(), getName());
        } else {
            System.out.printf("Студент %s лучше студента %s%n", slytherin.getName(), getName());
        }
    }
}
