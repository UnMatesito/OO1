package oo1.ej21.Parte1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    private Map<String, Integer> jugadores = new HashMap<>();

    @BeforeEach
    void setUp(){
        jugadores.put("Lionel Messi", 111);
        jugadores.put("Gabriel Batistuta", 56);
        jugadores.put("Kun Agüero", 42);
    }

    @Test
    void testRemover(){
        jugadores.remove("Kun Agüero");
        assertEquals(2, jugadores.size());
    }

    @Test
    void testModificar(){
        jugadores.put("Lionel Messi", 112);
        assertEquals(112, jugadores.get("Lionel Messi").intValue());
    }

    @Test
    void testCantGoles(){
        assertEquals(209, jugadores.values().stream().mapToInt(jugador -> jugador).sum());
    }
}
