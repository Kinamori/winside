package com.example.winside;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PointTests {

    @Test
    public void latOutOfRange() {
        try {
            Point a = new Point("id1", 100, 0);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }        
    }

    @Test
    public void lonOutOfRange() {
        try {
            Point b = new Point("id2", 0, 200);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }        
    }
}
