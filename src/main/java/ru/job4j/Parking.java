package ru.job4j;

public class Parking implements IParking {
    private int numberPlacesPassCars;
    private int numberPlacesTrucks;
    private Control control = new Control();

    public Parking(int numberPlacesPassCars, int numberPlacesTrucks) {
        this.numberPlacesPassCars = numberPlacesPassCars;
        this.numberPlacesTrucks = numberPlacesTrucks;
    }

    public int getNumberFreePlacesPassCars() {
        return numberPlacesPassCars;
    }

    public int getNumberFreePlacesTrucks() {
        return numberPlacesTrucks;
    }

    public void takePlace(Car vahicle) {
        control.CanEnter();
    }

    public void leavePlace(Car vahicle) {

    }
}
