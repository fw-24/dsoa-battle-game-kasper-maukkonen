package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameCharacterTest {

    @Test
    public void testNameGetter() {
        GameCharacter g = new GameCharacter("foo", 100);
        assertEquals("foo", g.getName());
    }

    @Test
    public void testTakeDamage() {
        GameCharacter g = new GameCharacter("foo", 100);
        g.takeDamage(30);
        assertEquals(70, g.getHitPoints());
    }
}