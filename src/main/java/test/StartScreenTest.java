package test;
import core.StartScreen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartScreenTest {
    StartScreen screen;

    @Before
    public void setUp() {
        screen = new StartScreen();
    }

    @Test
    public void testInitialSetup() {
        // Check initial conditions of the GUI components
        assertEquals("Enter name for Player 1", screen.Player1.getText());
        assertNotNull(screen.Player1);
        assertEquals(7, screen.player1.getItemCount()); // Checks if all colors are loaded
    }

    @Test
    public void testStartMethod() {
        // Ensure the start method reflects the correct status
        assertFalse(screen.started());
        screen.start = true;
        assertTrue(screen.started());
    }
}