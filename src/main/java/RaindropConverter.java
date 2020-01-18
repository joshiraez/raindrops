class RaindropConverter {

    String convert(int number) {

        if (hasFactor(number, 3)) return "Pling";
        if (hasFactor(number, 5)) return "Plang";
        if (hasFactor(number, 7)) return "Plong";

        return String.valueOf(number);
    }

    private boolean hasFactor(final int number, final int i) {
        return number % i == 0;
    }

}
