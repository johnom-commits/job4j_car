package ru.job4j;

public class Cars implements Car {
    private int parkingArea;

    public Cars(int parkingArea) {
        this.parkingArea = parkingArea;
    }

    public int getNumberPlaces() {
        return parkingArea;
    }
}
