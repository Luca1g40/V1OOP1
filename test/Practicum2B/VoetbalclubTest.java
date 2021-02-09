package Practicum2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    public void clubnaam(){
        Voetbalclub test1 = new Voetbalclub("");
        Voetbalclub test2 = new Voetbalclub(null);
        assertEquals("FC", test1.getNaam());
        assertEquals("FC", test2.getNaam());
    }

    @Test
    public void foutieve_invoer(){
        Voetbalclub red = new Voetbalclub("RED");
        red.verwerkResultaat('w');
        red.verwerkResultaat('y');
        assertEquals(3,red.aantalPunten());
        assertEquals(1,red.aantalGespeeld());
    }

    @Test
    public void stringTest(){
        Voetbalclub red = new Voetbalclub("RED");
        red.verwerkResultaat('w');
        red.verwerkResultaat('y');
        assertEquals("RED 1 1 0 0 3", red.toString());
    }

    @Test
    public void correcte_optelling(){
        Voetbalclub red = new Voetbalclub("RED");
        red.verwerkResultaat('w');
        red.verwerkResultaat('g');
        red.verwerkResultaat('v');
        assertEquals(4,red.aantalPunten());
        assertEquals(3,red.aantalGespeeld());
    }


}