package ru.job4j;

public class Control {
    private Parking parking;

    public Control(Parking parking) {
        this.parking = parking;
    }

    public boolean CanEnter(Car car) {
        return true;
    }

    public int OccupiedCarPlaces() {
        return 0;
    }

    public void parked(Car passCar) {
    }
}
