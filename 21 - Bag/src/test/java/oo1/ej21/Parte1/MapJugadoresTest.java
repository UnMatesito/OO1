package oo1.ej21.Parte1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapJugadoresTest {
    private Map<Jugador, Integer> jugadores = new HashMap<>();

    @BeforeEach
    void setUp() {
        Jugador messi = new Jugador("Lionel", "Messi");
        Jugador batis = new Jugador("Gabriel", "Batistuta");
        Jugador kun = new Jugador("Kun", "Agüero");

        jugadores.put(messi, 111);
        jugadores.put(batis, 56);
        jugadores.put(kun, 42);
    }

    @Test
    void testRemover() {
        jugadores.keySet().removeIf(key -> key.getNombre().equals("Kun") && key.getApellido().equals("Agüero"));
        assertEquals(2, jugadores.size());
    }

    @Test
    void testModificar(){
        jugadores.put(new Jugador("Lionel", "Messi"), 112);
        assertEquals(112, jugadores.entrySet().stream()
                .filter(entry -> entry.getKey().getNombre().equals("Lionel") && entry.getKey().getApellido().equals("Messi"))
                .map(jugador -> jugador.getValue())
                .findFirst()
                .orElse(null));
    }

    @Test
    void testCantGoles(){
        assertEquals(209, jugadores.values().stream().mapToInt(jugador -> jugador).sum());
    }
}
