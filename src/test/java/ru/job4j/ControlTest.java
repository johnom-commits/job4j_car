package ru.job4j;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlTest {
    private Control control;

    @Before
    public void init() {
        Parking parking = new Parking(10, 3);
        control = new Control(parking);
    }

    @Test
    public void whenParkingPassCar() {
        Car passCar = new PassengerCar();
        control.parked(passCar);
        int occupiedPassCarPlaces = control.occupiedPassCarPlaces();
        assertEquals(1, occupiedPassCarPlaces);
    }

    @Test
    public void whenPassCarMayParking() {
        Car passCar = new PassengerCar();
        boolean parked = control.canEnter(passCar);
        assertTrue(parked);
    }

    @Test
    public void whenParkingTruck() {
        Car truck = new Truck(4);
        control.parked(truck);
        int occupiedCarPlaces = control.occupiedTruckPlaces();
        assertEquals(1, occupiedCarPlaces);
    }

    @Test
    public void whenTruckMayParking() {
        Car truck = new Truck(4);
        boolean parked = control.canEnter(truck);
        assertTrue(parked);
    }

    @Test
    public void whenParkingAndLeavingPassCars() {
        Car passCar = new PassengerCar();
        control.parked(passCar);
        Car passCar2 = new PassengerCar();
        control.parked(passCar2);
        control.leaving(passCar);
        int occupiedPassCarPlaces = control.occupiedPassCarPlaces();
        assertEquals(1, occupiedPassCarPlaces);
    }
}