class RaindropConverter {

    String convert(int number) {

        if(hasFactor3(number)) return "Pling";
        if(number == 5) return "Plang";
        if(number == 7) return "Plong";

        return String.valueOf(number);
    }

    private boolean hasFactor3(final int number) {
        return number % 3 == 0;
    }

}
