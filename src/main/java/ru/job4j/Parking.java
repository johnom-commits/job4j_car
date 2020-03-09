package ru.job4j;

public class Parking implements IParking {
    private int numberPlaces;

    public Parking(int numberPlaces) {
        this.numberPlaces = numberPlaces;
    }

    public int getNumberFreePlaces() {
        return numberPlaces;
    }
}
