package ru.job4j;

public class Control {
    private  Parking parking;

    public Control(Parking parking) {
        this.parking = parking;
    }

    public boolean canEnter(Car car) {
        if (car instanceof PassengerCar) {
            if (parking.getNumberFreePlacesPassCars() > 0) {
                return true;
            }
        } else {
            if (parking.getNumberFreePlacesTrucks() > 0 && parking.getNumberFreePlacesPassCars() > car.getNumberPlaces()) {
                return true;
            }
        }
        return false;
    }

    public int occupiedPassCarPlaces() {
        return parking.getNumberoccupiedPassCarPlaces();
    }

    public int occupiedTruckPlaces() {
        return parking.getNumberoccupiedTruckPlaces();
    }

    public void parked(Car car) {
        parking.parked(car);
    }

    public void leaving(Car car) {
        parking.leavePlace(car);
    }
}
