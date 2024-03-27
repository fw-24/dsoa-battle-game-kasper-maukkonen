package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameCharacterTest {
    Player player;
    Npc npc;

    @BeforeEach
    public void setUp() {
        player = new Player("Hero", 100);
        npc = new Npc("Ghoul", 50);
    }

    @Test
    public void testPlayerAndNpcInstantiation() {
        assertEquals("Hero", player.getName());
        assertTrue(player.getHitPoints() > 0);
        assertEquals("Ghoul", npc.getName());
        assertTrue(npc.getHitPoints() > 0);
    }

    @Test
    public void testPlayerAttackNpc() {
        int initialNpcHp = npc.getHitPoints();
        int damageDone = player.attack(npc);
        assertEquals(initialNpcHp - damageDone, npc.getHitPoints());
    }

    @Test
    public void testNpcAttackPlayer() {
        int initialPlayerHp = player.getHitPoints();
        int damageDone = npc.attack(player);
        assertEquals(initialPlayerHp - damageDone, player.getHitPoints());
    }
}