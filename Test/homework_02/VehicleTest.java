package homework_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Aurus", "Aurus Senat", 2024);
        motorcycle = new Motorcycle("Aurus", "Aurus Merlon", 2024);
    }


    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    //(используя оператор instanceof).
    @Test
    void anInstanceOfACarObjectIsAlsoAnInstanceOfAVehicle(){
        assertTrue(car instanceof Vehicle);
    }


    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void aCarObjectIsCreatedWithFourWheels(){
        assertEquals(car.getNumWheels(), 4);
    }


    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void aMotorcycleObjectIsCreatedWithTwoWheels(){
        assertEquals(motorcycle.getNumWheels(), 2);
    }


    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void carObjectReachesSpeedSixtyInTestDrivingMode(){
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }


    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    // (используя метод testDrive()).
    @Test
    void motorcycleObjectReachesSpeedOfSeventyFiveInTestDrivingMode(){
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }


    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // машина останавливается (speed = 0).
    @Test
    void inParkingModeTheCarStopsTheSpeedIsZero(){
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }


    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0).
    @Test
    void inParkingModeTheMotorcycleStopsTheSpeedIsZero(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
