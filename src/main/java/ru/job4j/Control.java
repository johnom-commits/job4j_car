package ru.job4j;

public class Control {
    private  Parking parking;

    public Control(Parking parking) {
        this.parking = parking;
    }

    public boolean canEnter(Car car) {
        return true;
    }

    public int occupiedCarPlaces() {
        return 0;
    }

    public void parked(Car passCar) {
    }
}
