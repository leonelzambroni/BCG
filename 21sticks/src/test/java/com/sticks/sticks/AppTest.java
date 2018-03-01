package com.sticks.sticks;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {

	@Test
	void One() {
        App app = new App();
        app.setSticks(app.getSticks()-1);        
        int i = 20;
        assertEquals("error", i, app.getSticks());
    }

    @Test
    void Two() {
        App app = new App();
        app.setSticks(app.getSticks()-2);        
        Integer i = 19;
        assertEquals("error", i, app.getSticks());
        
}
}