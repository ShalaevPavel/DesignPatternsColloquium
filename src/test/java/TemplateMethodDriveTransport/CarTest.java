package TemplateMethodDriveTransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void arrive() {
        Car car = new Car();
        assertEquals("your car arrived to the stop", car.arrive());
    }

    @Test
    void leave() {
        Car car = new Car();
        assertEquals("your car got out of the stop", car.leave());
    }
}