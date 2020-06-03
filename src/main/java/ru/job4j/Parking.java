package ru.job4j;

public class Parking implements IParking {
    private int numberPlacesPassCars;
    private int numberPlacesTrucks;
    private int occupiedPlacesPassCars;
    private int occupiedPlacesTrucks;

    public Parking(int numberPlacesPassCars, int numberPlacesTrucks) {
        this.numberPlacesPassCars = numberPlacesPassCars;
        this.numberPlacesTrucks = numberPlacesTrucks;
    }

    public int getNumberFreePlacesPassCars() {
        return numberPlacesPassCars - occupiedPlacesPassCars;
    }

    public int getNumberFreePlacesTrucks() {
        return numberPlacesTrucks - occupiedPlacesTrucks;
    }

    public void leavePlace(Car car) {
        if (car instanceof PassengerCar) {
            --occupiedPlacesPassCars;
        } else {
            --occupiedPlacesTrucks;
        }
    }

    public void parked(Car car) {
        int numberPlaces = car.getNumberPlaces();
        if (car instanceof PassengerCar) {
            ++occupiedPlacesPassCars;
        } else {
            // если это грузовик и все места для них заняты, то ставим на стоянку легковых
            if (numberPlacesTrucks == occupiedPlacesTrucks) {
                occupiedPlacesPassCars = occupiedPlacesPassCars + numberPlaces;
            } else {    // иначе ставим грузовик на стоянку грузовиков
                ++occupiedPlacesTrucks;
            }
        }
    }

    public int getNumberoccupiedPassCarPlaces() {
        return occupiedPlacesPassCars;
    }

    public int getNumberoccupiedTruckPlaces() {
        return occupiedPlacesTrucks;
    }
}
