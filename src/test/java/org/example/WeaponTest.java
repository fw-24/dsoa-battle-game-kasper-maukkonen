package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WeaponTest {
    @Test
    public void testWeaponInstantiation() {
        Weapon weapon = new Weapon("Sword", 30);
        assertEquals("Sword", weapon.getName());
        assertEquals(30, weapon.getDamage());
    }
}
