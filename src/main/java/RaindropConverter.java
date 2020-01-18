class RaindropConverter {

    String convert(int number) {

        final String soundOfRaindrop = getSoundOfRaindrop(number);

        return getSoundIfAnyOrElseReturnNumber(number, soundOfRaindrop);
    }

    private String getSoundIfAnyOrElseReturnNumber(final int number, final String soundOfRaindrop) {
        return soundOfRaindrop.isEmpty() ?
                String.valueOf(number) :
                soundOfRaindrop;
    }

    private String getSoundOfRaindrop(final int number) {
        String sound = "";

        if (hasFactor(number, 3)) sound = sound.concat("Pling");
        if (hasFactor(number, 5)) sound = sound.concat("Plang");
        if (hasFactor(number, 7)) sound = sound.concat("Plong");

        return sound;
    }

    private boolean hasFactor(final int number, final int i) {
        return number % i == 0;
    }

}
