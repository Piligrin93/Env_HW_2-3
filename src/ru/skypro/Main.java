package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor ("Гарри Поттер", 82, 65, 90, 73, 95),
                new Griffindor("Гермиона Грейнджер", 92, 95, 57, 74, 41),
                new Griffindor("Рон Уизли", 53, 75, 61, 36, 55)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 64, 70, 66, 25, 80, 58, 95),
                new Slytherin("Грэхэм Монтегю", 55, 47, 65, 49, 83, 77, 12),
                new Slytherin("Грегори Гойл", 38, 31, 45, 74, 63, 29, 50)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 78, 39, 61, 70, 57),
                new Hufflepuff("Седрик Диггори", 87, 74, 69, 65, 71),
                new Hufflepuff("Джастин Финч-Флетчли", 58, 35, 56, 78, 48)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 69, 47, 68, 26, 48),
                new Ravenclaw("Падма Патил", 51, 39, 59, 72, 74),
                new Ravenclaw("Маркус Белби", 46, 45, 85, 40, 10)
        };

        print(griffindors);
        print(slytherins);
        print(hufflepuffs);
        print(ravenclaws);

        griffindors[0].compareHogwarts(slytherins[0]);
        griffindors[2].compareHogwarts(slytherins[2]);
        slytherins[2].compareHogwarts(ravenclaws[1]);
        slytherins[1].compareHogwarts(ravenclaws[0]);
        ravenclaws[0].compareHogwarts(hufflepuffs[2]);
        ravenclaws[2].compareHogwarts(hufflepuffs[1]);

        griffindors[0].compareGriffindor(griffindors[1]);
        griffindors[0].compareGriffindor(griffindors[2]);
        griffindors[1].compareGriffindor(griffindors[2]);

        slytherins[0].compareSlytherin(slytherins[1]);
        slytherins[0].compareSlytherin(slytherins[2]);
        slytherins[1].compareSlytherin(slytherins[2]);

        hufflepuffs[0].compareHufflepuff(hufflepuffs[1]);
        hufflepuffs[0].compareHufflepuff(hufflepuffs[2]);
        hufflepuffs[1].compareHufflepuff(hufflepuffs[2]);

        ravenclaws[0].compareRavenclaw(ravenclaws[1]);
        ravenclaws[0].compareRavenclaw(ravenclaws[2]);
        ravenclaws[1].compareRavenclaw(ravenclaws[2]);
    }

    public static void print(Griffindor[] griffindors) {
        System.out.println("Количество учащихся на Грифиндоре - " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя = " + griffindor.getName()
                    + "-> Сила Магии = " + griffindor.getPowerOfMagic()
                    + "-> Трансгрессирование = " + griffindor.getTeleportation()
                    + "-> Благородство = " + griffindor.getNobility()
                    + "-> Честь = " + griffindor.getHonor()
                    + "-> Храбрость = " + griffindor.getBravery());
        }
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Количество учащихся на Слизерине - " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя = " + slytherin.getName()
                    + "-> Сила Магии = " + slytherin.getPowerOfMagic()
                    + "-> Трансгрессирование = " + slytherin.getTeleportation()
                    + "-> Хитрость = " + slytherin.getTrick()
                    + "-> Решительность = " + slytherin.getDetermination()
                    + "-> Амбициозность = " + slytherin.getAmbition()
                    + "-> Находчивость = " + slytherin.getResourcefulness()
                    + "-> Жажда Власти = " + slytherin.getOvebearing());
        }
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Количество учащихся на Пуфендуе - " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя = " + hufflepuff.getName()
                    + "-> Сила Магии = " + hufflepuff.getPowerOfMagic()
                    + "-> Трансгрессирование = " + hufflepuff.getTeleportation()
                    + "-> Трудолюбие = " + hufflepuff.getIndustriosness()
                    + "-> Верность = " + hufflepuff.getLoyalty()
                    + "-> Честность = " + hufflepuff.getHonesty());
        }
    }

    public static void print(Ravenclaw[] ravenclaws) {
        System.out.println("Количество учащихся на Когтевране - " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя = " + ravenclaw.getName()
                    + "-> Сила Магии = " + ravenclaw.getPowerOfMagic()
                    + "-> Трансгрессирование = " + ravenclaw.getTeleportation()
                    + "-> Ум = " + ravenclaw.getSmart()
                    + "-> Остроумие = " + ravenclaw.getWit()
                    + "-> Творчество = " + ravenclaw.getCreativity());
        }
    }
}
