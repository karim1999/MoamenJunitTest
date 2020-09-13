package com.karim;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PointIT {
    Point p1,p2,p3,p4, p5;

    public PointIT() {
    }
    @Before
    public void setUp() {
        p1 = new Point (4,5);
        p2 = new Point (-4,-5);
        p3 = new Point (3,5);
        p4 = new Point (-7,-15);
        p5= new  Point (4,5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testaddPostive(){
        Point res1 = p1.add(p3);
        assertEquals(7,res1.x);
        assertEquals(10,res1.y);
    }
    @Test
    public void testaddNegative(){
        Point res1 = p2.add(p4);
        assertEquals(-11,res1.x);
        assertEquals(-20,res1.y);
    }
    @Test
    public void testaddZero(){
        Point res1 = p1.add(p2);
        assertEquals(0,res1.x);
        assertEquals(0,res1.y);
    }
    @Test
    public void testsubNegative(){
        Point res1 = p2.sub(p4);
        assertEquals(3,res1.x);
        assertEquals(10,res1.y);
    }
    @Test
    public void testsubPostive(){
        Point res1 = p1.sub(p3);
        assertEquals(1,res1.x);
        assertEquals(0,res1.y);
    }
    @Test
    public void testsubzero(){
        Point res1 = p1.sub(p5);
        assertEquals(0,res1.x);
        assertEquals(0,res1.y);
    }
}
