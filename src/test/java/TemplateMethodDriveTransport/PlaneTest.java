package TemplateMethodDriveTransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void arrive() {
        Plane plane = new Plane();
        assertEquals("your plane landed", plane.arrive());
    }


    @Test
    void leave() {
        Plane plane = new Plane();
        assertEquals("your plane took off", plane.leave());
    }
}