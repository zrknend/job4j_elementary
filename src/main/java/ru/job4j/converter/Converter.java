package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        int inEuro = 140;
        int inDollar = 140;
        int expectedEuro = 2;
        int expectedDollar = 2;
        int outEuro = rubleToEuro(inEuro);
        int outDollar = rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 2 dollar. Test result : " + passedDollar);
    }
}
