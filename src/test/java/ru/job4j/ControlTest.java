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
        int occupiedCarPlaces = control.OccupiedCarPlaces();
        assertEquals(1, occupiedCarPlaces);
    }

    @Test
    public void whenPassCarMayParking() {
        Car passCar = new PassengerCar();
        boolean parked = control.CanEnter(passCar);
        assertTrue(parked);
    }

    @Test
    public void whenParkingTruck() {
        Car truck = new Truck(4);
        control.parked(truck);
        int occupiedCarPlaces = control.OccupiedCarPlaces();
        assertEquals(4, occupiedCarPlaces);
    }

    @Test
    public void whenTruckMayParking() {
        Car truck = new Truck(4);
        boolean parked = control.CanEnter(truck);
        assertTrue(parked);
    }
}